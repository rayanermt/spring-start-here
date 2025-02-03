package learnSpring.main;

import learnSpring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Book myBook = context.getBean(Book.class);
        myBook.setTitle("Harry Potter");
        System.out.println(myBook.getTitle());
    }
}
