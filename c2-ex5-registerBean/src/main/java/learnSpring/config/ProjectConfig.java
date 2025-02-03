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

public class ProjectConfig {

}
