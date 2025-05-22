package com.tillu.service;

import com.tillu.exception.SellerException;
import com.tillu.exception.UserException;
import com.tillu.request.LoginRequest;
import com.tillu.request.ResetPasswordRequest;
import com.tillu.request.SignupRequest;
import com.tillu.response.ApiResponse;
import com.tillu.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
