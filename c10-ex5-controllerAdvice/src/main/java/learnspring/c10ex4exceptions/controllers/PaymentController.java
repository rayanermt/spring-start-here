/*
    The controller no longer manages exceptions, it only handles the cases with a successful transaction.
 */

package learnspring.c10ex4exceptions.controllers;

import learnspring.c10ex4exceptions.NotEnoughMoneyException;
import learnspring.c10ex4exceptions.models.ErrorDetails;
import learnspring.c10ex4exceptions.models.PaymentDetails;
import learnspring.c10ex4exceptions.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
