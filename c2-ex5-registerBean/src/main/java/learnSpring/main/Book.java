package learnSpring.main;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }
}
