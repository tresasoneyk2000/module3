package com.process.one.exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.validation.ConstraintViolationException;

import java.util.List;

@ControllerAdvice   //AOP

public class GlobalException extends ResponseEntityExceptionHandler{
	
	

		@ExceptionHandler(ResourceNotFpoundException
				.class)
		public ResponseEntity<?> resourceNotFoundException(ResourceNotFpoundException
				 ex, WebRequest request){
			
			Map<String,String> body = new HashMap<>();
			body.put("message", ex.getMessage());
			return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
		}

		
	   @ExceptionHandler(ConstraintViolationException.class)
	   public ResponseEntity<?> constraintViolationException(ConstraintViolationException ex, WebRequest request){
		   
		  List<String> errors = new ArrayList<>();
		  ex.getConstraintViolations().forEach(cv -> errors.add(cv.getMessage()));
		  Map <String, List<String>> result = new HashMap();
	      result.put("errors", errors); // returns a map of error code and message value
	      return new ResponseEntity(result, HttpStatus.BAD_REQUEST);
	   }	
		
		
	}


