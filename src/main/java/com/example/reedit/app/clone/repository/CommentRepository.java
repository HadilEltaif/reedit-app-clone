package com.example.reedit.app.clone.repository;

import com.example.reedit.app.clone.models.Comment;
import com.example.reedit.app.clone.models.Post;
import com.example.reedit.app.clone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}