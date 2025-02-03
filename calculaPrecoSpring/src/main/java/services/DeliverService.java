package services;

// Representa a taxa de entrega sob um produto baseado no estado de destino.

import org.springframework.stereotype.Service;

@Service
public class DeliverService {

/*
    Retorna a taxa de entrega de um produto baseado no estado (UF) de destino.
    Parâmetros:     UF do estado.
    Retornos:       Percentual da taxa de entrega para o estado determinado.
 */
    public double fee(String state) {
        if ("SP".equalsIgnoreCase(state))
            return 10.0;

        return 20.0;
    }
}
