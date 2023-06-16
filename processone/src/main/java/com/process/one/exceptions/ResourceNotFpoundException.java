package com.process.one.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class ResourceNotFpoundException extends Exception {
	
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ResourceNotFpoundException(String message) {
			
			super(message);
		}

	}


