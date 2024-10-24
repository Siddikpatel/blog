package com.blog.common.service;

import com.blog.common.entity.Notification;
import com.blog.common.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getNotificationsByUserId(Long userId) {
        return notificationRepository.findByRecipientId(userId);
    }

    // Additional methods for creating notifications
}

