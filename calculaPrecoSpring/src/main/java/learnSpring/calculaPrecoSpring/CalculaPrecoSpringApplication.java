package learnSpring.calculaPrecoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.PayService;

@SpringBootApplication
public class CalculaPrecoSpringApplication implements CommandLineRunner {

	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(CalculaPrecoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(payService.finalPrice(300.0, "MG"));
	}
}
