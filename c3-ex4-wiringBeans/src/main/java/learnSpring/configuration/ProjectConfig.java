package learnSpring.configuration;

import learnSpring.main.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "learnSpring.main")

public class ProjectConfig {

    @Bean
    public Book romance(){
        return new Book("Dom Casmurro");
    }

    @Bean
    public Book drama(){
        return new Book("Quarto de Despejo");
    }

    @Bean
    public Book horror(){
        return new Book("O Exorcista");
    }
}
