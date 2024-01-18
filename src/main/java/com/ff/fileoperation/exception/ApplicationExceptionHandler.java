package com.ff.fileoperation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ImageNotFoundException.class)
    public ResponseEntity catchImageException(ImageNotFoundException imageNotFoundException)
    {
         return new ResponseEntity(imageNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
