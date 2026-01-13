package pl.edu.vistula.first_rest_api_spring.product.support;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pl.edu.vistula.first_rest_api_spring.product.support.exception.ProductNotFoundException;
import pl.edu.vistula.first_rest_api_spring.shared.api.response.ErrorMessageResponse;

@ControllerAdvice
public class ProductAdvisor {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleProductNotFoundException(ProductNotFoundException exc) {
        ErrorMessageResponse errorResponse = new ErrorMessageResponse(exc.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}