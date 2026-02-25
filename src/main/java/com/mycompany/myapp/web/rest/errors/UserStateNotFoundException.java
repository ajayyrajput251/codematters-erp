package com.mycompany.myapp.web.rest.errors;

public class UserStateNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UserStateNotFoundException() {
        super("User activation statistics are not available.");
    }

    public UserStateNotFoundException(String message) {
        super(message);
    }
}


