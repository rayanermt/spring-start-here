package learnSpring.main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Author {
    private String name = "Machado de Assis";
    private final Book book;

    public Author(@Qualifier("drama") Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return name + ": " + book;
    }
}
