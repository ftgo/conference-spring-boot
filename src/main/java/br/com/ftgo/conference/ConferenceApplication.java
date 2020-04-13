package br.com.ftgo.conference;

import br.com.ftgo.conference.controllers.SessionController;
import br.com.ftgo.conference.models.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConferenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceApplication.class, args);

//        ApplicationContext context = new AnnotationConfigApplicationContext(ConferenceConfiguration.class);
//        SessionController controller = context.getBean("sessionController", SessionController.class);
//        Session session = controller.get(1l);
//        System.out.println(session);

    }

}
