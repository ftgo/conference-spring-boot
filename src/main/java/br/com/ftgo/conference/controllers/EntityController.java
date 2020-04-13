package br.com.ftgo.conference.controllers;


import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

public abstract class EntityController<Entity> {

    protected abstract JpaRepository<Entity, Long> getRepository();

    @GetMapping
    public List<Entity> list() {
        return getRepository().findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Entity get(@PathVariable Long id) {
        return getRepository().getOne(id);
    }

    @PostMapping
//    @ResponseStatus(CREATED)
    public Entity create(@RequestBody final Entity entity) {
        return getRepository().saveAndFlush(entity);
    }

    @RequestMapping(value = "{id}", method = DELETE)
    public void delete(@PathVariable Long id) {
        // Also need to check for children records before deleting.
        getRepository().deleteById(id);
    }

    @RequestMapping(value = "{id}", method = PUT)
    public Entity update(@PathVariable Long id, @RequestBody final Entity entity) {
        // because this is a PUT, we expect all attributes to be passed in. A PATCH would only need what changed.
        // TODO add validation that all attributes are passed in, otherwise return a 400 bad payload

        Entity current = get(id);
        BeanUtils.copyProperties(entity, current, "id");

        return getRepository().saveAndFlush(current);

    }
}
