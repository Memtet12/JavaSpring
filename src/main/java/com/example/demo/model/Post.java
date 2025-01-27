package com.example.demo.model;

import javax.swing.*;

public class Post {
    private String text;
    private  Integer likes;

    public Post(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }

    public Integer getLikes()
    {
        return likes;
    }

    public void SetLikes(Integer likes)
    {
        this.likes = likes;
    }
}
