package com.benarfa.Blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        return new ResponseEntity<List<Post>>(postService.getAllPosts(), HttpStatus.OK);
    }
}
