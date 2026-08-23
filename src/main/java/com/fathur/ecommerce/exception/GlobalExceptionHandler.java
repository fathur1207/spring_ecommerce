package com.fathur.ecommerce.exception;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String handleMaxUploadException(
            MaxUploadSizeExceededException ex,
            HttpSession session) { 

        session.setAttribute("errorMsg", "Ukuran file maksimal 2 MB!");

        return "admin/admin-dashboard";
    }

    @ExceptionHandler(EmailAlreadyRegisteredException.class)
    public String handleEmailAlreadyRegisteredException(
            EmailAlreadyRegisteredException ex,
            HttpSession session) {

        session.setAttribute("errorMsg", "Email sudah terdaftar!");
        
        return "redirect:/register";
    }
}
