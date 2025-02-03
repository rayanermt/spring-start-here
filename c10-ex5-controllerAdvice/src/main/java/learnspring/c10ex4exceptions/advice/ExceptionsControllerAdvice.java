/*
    Exceptions handler.
 */

package learnspring.c10ex4exceptions.advice;

import learnspring.c10ex4exceptions.NotEnoughMoneyException;
import learnspring.c10ex4exceptions.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to complete transaction.");

        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
