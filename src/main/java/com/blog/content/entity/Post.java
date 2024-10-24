package com.blog.content.entity;

import com.blog.common.entity.Likeable;
import com.blog.user.entity.User;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post implements Likeable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String content;

    private LocalDateTime createdAt;

    // Add other relevant fields such as likes, comments, etc.

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public String getContent() {
        return "";
    }

    // Fields, constructor, etc. from earlier

    private int likeCount;

    public Post() {
        super();
        this.likeCount = 0;
    }

    @Override
    public void like() {
        likeCount++;
    }

    @Override
    public void unlike() {
        if (likeCount > 0) {
            likeCount--;
        }
    }

    @Override
    public int getLikeCount() {
        return likeCount;
    }

    // Getters and setters
}
