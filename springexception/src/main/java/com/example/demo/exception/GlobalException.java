package com.example.demo.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.validation.ConstraintViolationException;


@RestControllerAdvice
//@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class GlobalException extends ResponseEntityExceptionHandler{
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity methodargumentnotvalidexception(MethodArgumentNotValidException ex, WebRequest request){
//		Map<String,String> h= new HashMap<>();
////	ex.getBindingResult().ex.getFieldErrors().forEach(errors->
////	h.add(fiel))
////		h.put("message",ex.getDetailMessageCode());
////		return new ResponseEntity(h,HttpStatus.BAD_REQUEST);
//		
//		h.put("message", "rtyui");
//		 return new ResponseEntity(h,HttpStatus.NO_CONTENT);
//		
//	}
	   @ExceptionHandler(ConstraintViolationException.class)
	   public ResponseEntity<?> constraintViolationException(ConstraintViolationException ex, WebRequest request){
		   
		  List<String> errors = new ArrayList<>();
		  ex.getConstraintViolations().forEach(cv -> errors.add(cv.getMessage()));
		  Map <String, List<String>> result = new HashMap();
	      result.put("errors", errors); // returns a map of error code and message value
	      return new ResponseEntity(result, HttpStatus.BAD_REQUEST);
	   }	
	   
	   @ExceptionHandler(NotFoundException.class)
	   public ResponseEntity<?> notfoundexception(NotFoundException ex,WebRequest request){
		   Map<String,String> m= new HashMap<>();
		   m.put("message", ex.getMessage());
		   return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(m);
		   
		   
	   } 
		

}
