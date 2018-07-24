package com.example;

public class Greeting {

    private long id;
    private String content;

    public Greeting() {
        this.id = 0;
        this.content = null;

    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}