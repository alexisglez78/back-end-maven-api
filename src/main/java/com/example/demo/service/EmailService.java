package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Async
    public void sendEmail(String to, String subject, String body) {
        // Lógica para enviar el correo electrónico
    }
}
