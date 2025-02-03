package learnspring.c10ex1rest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @ResponseBody annotation tells the dispatcher servlet that this method doesn't return a view (An HTML page), but the HTTP response directly.
    This annotation only 'works' for a single method, so I have to re-write it for each REST Methods. Besides, the component also needs the @Controller annotation.

    To avoid code repetition, use @RestController, which is a combination of the two previous annotations.
    This way, Spring understand that all methods in the container are Response Body.
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hi there, good to see you!";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye, see you later!";
    }

    @PostMapping("/hello")
    public String postHello() {
        return "Hi, that's a POST request.";
    }
}
