package learnSpring;

import learnSpring.config.projectConfiguration;
import learnSpring.services.LocationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(projectConfiguration.class);

        var c1 = context.getBean("locationService", LocationService.class);
        var c2 = context.getBean("locationService2", LocationService.class);

        boolean bool  = c1 == c2;
        System.out.println(bool);
    }
}