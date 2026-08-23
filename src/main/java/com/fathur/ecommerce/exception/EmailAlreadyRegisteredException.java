package com.fathur.ecommerce.exception;

import jakarta.servlet.http.HttpSession;

public class EmailAlreadyRegisteredException extends RuntimeException {

    public EmailAlreadyRegisteredException(String email) {
        super("Email sudah terdaftar: " + email);
    }
}
