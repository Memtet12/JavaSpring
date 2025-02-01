package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
    {
        posts.add(new Post("Первый пост - я впервые в интернете, вроде все хорошие", new Date(125,1,1)));
        posts.add(new Post("Второй пост - я пытался познакомиться с кем-то, но мне написали, что я скучный(",new Date(125,1,1)));
        posts.add(new Post("Третий пост - мне написал какой-то парень и предложил поиграть в майнкрафт вместе, я рад:3",new Date(125,1,1)));
    }
    public List<Post> listAllPosts()
    {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}