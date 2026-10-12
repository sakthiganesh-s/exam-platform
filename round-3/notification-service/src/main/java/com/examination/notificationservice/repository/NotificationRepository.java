package com.examination.notificationservice.repository;
import com.examination.notificationservice.model.Notification; import org.springframework.data.jpa.repository.JpaRepository;
public interface NotificationRepository extends JpaRepository<Notification,Long>{}
