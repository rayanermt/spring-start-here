/*
    Manages the exceptions and sends HTTP responses.
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

/*
    Returns a positive HTTP and a PaymentService instance response if the service method succeeds. Otherwise, throws an error message.
 */
    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        try {
            PaymentDetails paymentDetails = paymentService.processPayment();

            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        } catch (NotEnoughMoneyException exception) {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment.");

            return ResponseEntity
                    .badRequest()
                    .body(errorDetails);
        }
    }

}
