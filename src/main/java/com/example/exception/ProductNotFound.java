package com.example.exception;
import  org.springframework.web.bind.annotation.ResponseStatus;
import  org.springframework.http.HttpStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ProductNotFound  extends RuntimeException {
    private static final long serialVersionUID= 1L;

    public ProductNotFound(String message)
    {super(message);
    }
}
