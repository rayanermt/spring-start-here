package learnSpring.config;

import learnSpring.services.LocationService;
import org.springframework.context.annotation.Bean;

public class projectConfiguration {

    @Bean
    public LocationService locationService() {
        return new LocationService();
    }

    @Bean
    public LocationService locationService2() {
        return new LocationService();
    }
}
