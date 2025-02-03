package learnSpring.main;

import learnSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//      Declares a new Spring Context.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//      Gets a reference from the variables declared in the Spring context.
        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person's name : " + person.getName());

        System.out.println("Parrot's name : " + parrot.getName());

        System.out.println("Person's parrot : " + person.getParrot());

    }
}