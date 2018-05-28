package com.ms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.xml.bind.ValidationException;

/**
 * Created by GulsahCoskun on 28.05.2018.
 */
@RestControllerAdvice
public class MyAdviser {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception exception){
        if(exception instanceof MethodArgumentNotValidException){
            MethodArgumentNotValidException validationException = (MethodArgumentNotValidException) exception;
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorObj().setCause(100)
            .setMessage(validationException.getMessage()));
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorObj().setCause(100)
                .setMessage(exception.getMessage()));
    }

}
