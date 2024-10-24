package com.blog.content.entity;

import com.blog.common.entity.Likeable;
import com.blog.user.entity.User;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment implements Likeable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String content;

    private LocalDateTime createdAt;

    private int likeCount;

    public Comment() {
        this.createdAt = LocalDateTime.now();
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

