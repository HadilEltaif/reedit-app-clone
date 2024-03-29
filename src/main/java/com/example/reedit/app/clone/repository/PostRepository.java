package com.example.reedit.app.clone.repository;

import com.example.reedit.app.clone.models.Post;
import com.example.reedit.app.clone.models.Subreddit;
import com.example.reedit.app.clone.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
