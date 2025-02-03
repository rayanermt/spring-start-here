package learnSpring.main;

import learnSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot myParrot = new Parrot();
        myParrot.setName("Louro");

        Supplier<Parrot> parrotSupplier = () -> myParrot;

        context.registerBean("parrot1", Parrot.class, parrotSupplier);

        Parrot otherParrot = context.getBean(Parrot.class);


    }
}
