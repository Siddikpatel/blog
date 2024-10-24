package com.blog.content.entity;

import com.blog.common.entity.Notification;
import com.blog.user.entity.User;
import jakarta.persistence.*;

@Entity
@Table(name = "post_notifications")
public class PostNotification extends Notification {

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    public PostNotification(User recipient, Post post) {
        super();
        this.post = post;
        setRecipient(recipient);
    }

    private void setRecipient(User recipient) {

    }

    @Override
    public String getMessage() {
        return "New activity on your post: " + post.getContent();
    }

    // Getters and setters
}
