package com.foodcenter.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class ApplicationException extends Exception {
    public ApplicationException() {
        super();
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
