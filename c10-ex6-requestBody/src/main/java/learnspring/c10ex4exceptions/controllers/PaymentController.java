/*
    The controller no longer manages exceptions, it only handles the cases with a successful transaction.
 */

package learnspring.c10ex4exceptions.controllers;

import learnspring.c10ex4exceptions.NotEnoughMoneyException;
import learnspring.c10ex4exceptions.models.ErrorDetails;
import learnspring.c10ex4exceptions.models.PaymentDetails;
import learnspring.c10ex4exceptions.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(@RequestBody PaymentDetails paymentDetails) {

        logger.info("Received payment " + paymentDetails.getAmount());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
