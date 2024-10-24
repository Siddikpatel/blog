package com.blog.content.service;

import com.blog.content.entity.Post;
import com.blog.content.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> findPostsByUserId(Long userId) {
        return postRepository.findAllByUserId(userId);
    }

    // Add more methods like update post, delete post, etc.
}
