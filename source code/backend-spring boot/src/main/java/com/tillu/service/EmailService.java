package com.tillu.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendVerificationOtpEmail(String userEmail, String otp, String subject, String text) throws MessagingException, MailSendException {


        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");


            helper.setSubject(subject);
            String htmlContent = String.format(
                "<div style='font-family: Arial, sans-serif; padding: 20px;'>" +
                "<h2 style='color: #333;'>%s</h2>" +
                "<p style='font-size: 16px;'>%s</p>" +
                "<h1 style='color: #0066cc; font-size: 32px; letter-spacing: 5px;'>%s</h1>" +
                "<p style='color: #666; margin-top: 20px;'>This OTP will expire in 5 minutes.</p>" +
                "<p style='color: #999; font-size: 12px;'>If you did not request this OTP, please ignore this email.</p>" +
                "</div>",
                subject, text, otp
            );
            helper.setText(htmlContent, true);
            helper.setTo(userEmail);
            javaMailSender.send(mimeMessage);
        } catch (MailException e) {
            throw new MailSendException("Failed to send email");
        }
    }
}
