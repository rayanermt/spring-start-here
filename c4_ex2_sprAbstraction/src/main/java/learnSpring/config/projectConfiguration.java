package learnSpring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"learnSpring.proxies", "learnSpring.repositories", "learnSpring.services"})
@Configuration
public class projectConfiguration {

}
