package learnSpring.main;

import learnSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Gets a reference of a bean of type Parrot from the Spring context.
        Parrot myParrot = context.getBean(Parrot.class);
        System.out.println(myParrot.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);
    }
}
