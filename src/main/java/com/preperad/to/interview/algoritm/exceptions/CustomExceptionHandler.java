package com.preperad.to.interview.algoritm.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(SubstractionException.class)
    public ResponseEntity<String> subtractionHandler() {
        return new ResponseEntity<>("wrong request type", HttpStatus.BAD_REQUEST);
    }
}
