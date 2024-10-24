package com.blog.common.entity;

import com.blog.user.entity.User;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public abstract class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private boolean isRead;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User recipient;

    public Notification() {
        this.createdAt = LocalDateTime.now();
        this.isRead = false;
    }

    public abstract String getMessage();  // Abstract method to be implemented by child classes

    // Getters and setters
}

