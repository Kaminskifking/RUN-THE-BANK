package com.example.GftApplication.exceptions.customs;

public class NotFoundException extends Exception {
    public NotFoundException(final String errorMessage) {
        super(errorMessage);
    }
}
