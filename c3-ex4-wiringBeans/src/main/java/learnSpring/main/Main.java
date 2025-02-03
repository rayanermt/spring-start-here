package learnSpring.main;

import learnSpring.configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Author myAuthor = context.getBean(Author.class);
        System.out.print(myAuthor);
    }
}