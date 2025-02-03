package services;

// Representa o valor total a ser cobrado, considerando a taxa de imposto sob o produto e a taxa de entrega.

public class PayService {

    private TaxService taxService;

    private DeliverService deliverService;

    public PayService(TaxService taxService, DeliverService deliverService) {
        this.taxService = taxService;
        this.deliverService = deliverService;
    }

/*
    Retorna o custo final do produto, acrescido de taxas.
    Parâmetros:     Custo do produto, UF do estado.
    Retornos:       Custo final do produto.
 */
    public double finalPrice(double cost, String state) {
        return cost + taxService.tax(cost) + deliverService.fee(state);
    }
}
