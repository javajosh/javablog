package com.javajosh.javablog.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  @Autowired private PostRepository postRepository;

  public Post createPost(Post post) {
    return postRepository.save(post);
  }

  public List<Post> getPostsByUser(Integer userId) {
    return postRepository.findByUserId(userId);
  }

  public Post updatePost(Post post) {
    return postRepository.save(post);
  }

  public void deletePost(Integer postId) {
    postRepository.deleteById(postId);
  }
}
