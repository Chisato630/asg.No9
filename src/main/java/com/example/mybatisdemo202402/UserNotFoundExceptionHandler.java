package com.example.mybatisdemo202402;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;
import java.util.Map;

@ControllerAdvice
public class UserNotFoundExceptionHandler {

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleUserNotFoundException(
            UserNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "message", e.getMessage(),
                "timestamp", ZonedDateTime.now().toString(),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "path", request.getRequestURI(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()));

        return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}
