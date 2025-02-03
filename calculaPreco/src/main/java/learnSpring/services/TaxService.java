package services;

// Representa a taxa de imposto de um produto.

public class TaxService {

/*
    Calcula o imposto de um produto (10% sobre o valor).
    Parâmetros:     Valor do produto.
    Retornos:       Valor acrescido do imposto sob o produto.
 */
    public double tax(double value) {
        return value * 0.1;
    }
}
