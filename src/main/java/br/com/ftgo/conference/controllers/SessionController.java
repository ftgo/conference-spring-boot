package br.com.ftgo.conference.controllers;


import br.com.ftgo.conference.models.Session;
import br.com.ftgo.conference.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("sessionController")
@RequestMapping("api/v1/sessions")
public class SessionController extends EntityController<Session> {

    @Autowired
    private SessionRepository repository;

    @Override
    protected JpaRepository<Session, Long> getRepository() {
        return repository;
    }

}
