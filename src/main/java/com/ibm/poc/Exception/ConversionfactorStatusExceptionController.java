package com.ibm.poc.Exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ConversionfactorStatusExceptionController {

	@ExceptionHandler(value = ConversionfactorStatusException.class)
	   public ResponseEntity<Object> handleexception(ConversionfactorStatusException exception) {
		 return ResponseEntity.status(exception.getHttpStatus()).body(exception.getMessage());
	   }



}
