package br.com.ftgo.conference.repositories;

import br.com.ftgo.conference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
