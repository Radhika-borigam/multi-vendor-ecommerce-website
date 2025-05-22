package com.tillu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tillu.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
