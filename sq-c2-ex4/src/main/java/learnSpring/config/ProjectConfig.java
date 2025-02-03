package learnSpring.config;

import learnSpring.main.Parrot;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    @ComponentScan tells Spring to search for bean annotations in a certain package.
    No arguments tell Spring to scan the current package and its sub-packages.
 */
@Configuration
@ComponentScan(basePackages = "learnSpring.main")

public class ProjectConfig {
    @Bean
    /*
        The parrot methods represents ans instance of a Parrot method that will be part of the Spring context..
        The method name is also the bean name.
        By convention, use nouns, without verbs, often the same as the class name.
     */
    Parrot parrot1() {
        var myParrot = new Parrot();
        myParrot.setName("Louro");
        return myParrot;
    }

    @Bean("jose")
    Parrot parrot2() {
        var myParrot = new Parrot();
        myParrot.setName("José");
        System.out.println(myParrot.getName());
        return myParrot;
    }
}
