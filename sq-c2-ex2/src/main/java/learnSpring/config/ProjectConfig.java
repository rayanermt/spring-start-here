package learnSpring.config;

import learnSpring.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    /*
        The parrot methods represents ans instance of a Parrot method that will be part of the Spring context..
        The method name is also the bean name.
        By convention, use nouns, without verbs, often the same as the class name.
     */
    Parrot parrot() {
        var myParrot = new Parrot();
        myParrot.setName("Louro");
        return myParrot;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    int twelve() {
        return 12;
    }
}
