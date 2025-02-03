package learnSpring.production;

import learnSpring.services.*;

public class Application {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        DeliverService deliverService = new DeliverService();

        PayService payService = new PayService(taxService, deliverService);
        System.out.println("Resultado = R$ " + payService.finalPrice(300.0, "SC"));
    }
}
