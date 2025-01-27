package com.example.demo.service;

import com.example.demo.model.Post;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class PostService {
    public List<Post> listAllPosts()
    {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Первый пост - я впервые в интернете, вроде все хорошие"));
        posts.add(new Post("Второй пост - я пытался познакомиться с кем-то, но мне написали, что я скучный("));
        posts.add(new Post("Третий пост - мне написал какой-то парень и предложил поиграть в майнкрафт вместе, я рад:3"));
        return posts;
    }
}
