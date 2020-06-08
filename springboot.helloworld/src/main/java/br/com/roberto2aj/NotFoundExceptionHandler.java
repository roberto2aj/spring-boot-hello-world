package br.com.roberto2aj;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class NotFoundExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = EntityNotFoundException.class)
	protected ResponseEntity<Object> handleConclict(RuntimeException exception, WebRequest request) {
        return handleExceptionInternal(exception, exception.getMessage(), 
          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

}
