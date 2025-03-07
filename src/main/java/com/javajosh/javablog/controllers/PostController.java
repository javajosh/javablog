package com.javajosh.javablog.controllers;

import com.javajosh.javablog.services.Post;
import com.javajosh.javablog.services.PostService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

  @Autowired private PostService postService;

  @PostMapping(
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Post> createPost(@RequestBody Post post) {
    Post createdPost = postService.createPost(post);
    return ResponseEntity.ok(createdPost);
  }

  @GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Post>> getPostsByUser(@PathVariable Integer userId) {
    List<Post> posts = postService.getPostsByUser(userId);
    return ResponseEntity.ok(posts);
  }

  @PutMapping(
      value = "/{postId}",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Post> updatePost(@PathVariable Integer postId, @RequestBody Post post) {
    post.setId(postId);
    Post updatedPost = postService.updatePost(post);
    return ResponseEntity.ok(updatedPost);
  }

  @DeleteMapping("/{postId}")
  public ResponseEntity<Void> deletePost(@PathVariable Integer postId) {
    postService.deletePost(postId);
    return ResponseEntity.noContent().build();
  }
}
