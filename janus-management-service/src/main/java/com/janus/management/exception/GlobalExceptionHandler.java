package com.janus.management.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.janus.management.dto.responseDto.ErrorResponse;

@RestControllerAdvice 
public class GlobalExceptionHandler {
    
    @ExceptionHandler 
    public ResponseEntity<ErrorResponse> handleApiException(ApiException e) {
        return response(e.getStatus(), e.getMessage(), null);
    }

    @ExceptionHandler (MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidation(MethodArgumentNotValidException exception) {
        Map<String,String> errors =new LinkedHashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(), error.getDefaultMessage());
        });
        return response(HttpStatus.BAD_REQUEST, "Request validation failed", errors);
    }

    @ExceptionHandler (Exception.class)
    public ResponseEntity<ErrorResponse> handleUnexpected(Exception e) {
        return response(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected server error", null);
    }

    private ResponseEntity<ErrorResponse> response(HttpStatus status, String message,
         Map<String, String> errors) {
       
        ErrorResponse body = new ErrorResponse(
                status.value(),
                message,
                errors,
                LocalDateTime.now()
        );
        return ResponseEntity.status(status).body(body);
    }
}
