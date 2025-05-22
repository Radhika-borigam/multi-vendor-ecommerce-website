package com.tillu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tillu.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
