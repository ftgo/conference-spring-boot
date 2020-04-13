package br.com.ftgo.conference.controllers;


import br.com.ftgo.conference.models.Speaker;
import br.com.ftgo.conference.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("speakerController")
@RequestMapping("api/v1/speakers")
public class SpeakerController extends EntityController<Speaker> {

    @Autowired
    private SpeakerRepository repository;

    @Override
    protected JpaRepository<Speaker, Long> getRepository() {
        return repository;
    }
}
