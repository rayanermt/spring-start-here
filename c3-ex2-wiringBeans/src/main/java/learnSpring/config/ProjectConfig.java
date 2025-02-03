package learnSpring.config;

import learnSpring.main.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot myParrot = new Parrot();
        myParrot.setName("Louro Jose");
        return myParrot;
    }

    @Bean
    public Person person(Parrot parrot) {
        Person myPerson = new Person();
        myPerson.setName("Ana Maria");
        myPerson.setParrot(parrot);
        return myPerson;
    }
}
