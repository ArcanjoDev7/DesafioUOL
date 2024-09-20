package com.miguel.uolhost_backend.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchElementException(NoSuchElementException exception){
        ExceptionDTO dto = new ExceptionDTO("essa lista nao existe mais usuario existentes", "400");
        return ResponseEntity.badRequest().body(dto);
    }
}
