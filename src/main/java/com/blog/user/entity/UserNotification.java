package com.blog.user.entity;

import com.blog.common.entity.Notification;
import jakarta.persistence.*;

@Entity
public class UserNotification extends Notification {

    @ManyToOne
    @JoinColumn(name = "trigger_user_id", nullable = false)
    private User triggerUser;  // User who triggered the notification (e.g., follow)

    public UserNotification(User recipient, User triggerUser) {
        super();
        this.triggerUser = triggerUser;
        setRecipient(recipient);
    }

    private void setRecipient(User recipient) {
    }

    @Override
    public String getMessage() {
        return null;
    }

    // Getters and setters
}

