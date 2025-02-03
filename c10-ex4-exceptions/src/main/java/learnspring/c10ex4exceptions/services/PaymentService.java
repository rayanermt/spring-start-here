/*
    Implements the business logic for processing transactions.
 */

package learnspring.c10ex4exceptions.services;

import learnspring.c10ex4exceptions.NotEnoughMoneyException;
import learnspring.c10ex4exceptions.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

//    This methods ommits all the complex business logic for processing a payment, demonstrating an exception.
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();

//        PaymentDetails testPayment = new PaymentDetails();
//        testPayment.setAmount(1500);
//        return testPayment;
    }
}
