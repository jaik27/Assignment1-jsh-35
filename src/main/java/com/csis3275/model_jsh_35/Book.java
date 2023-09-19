package com.csis3275.model_jsh_35;

public class Book {
    // Properties
    private String title;
    private String author;
   
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
   
    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
   
    // Non-trivial method example
    public String getBookInfo() {
        return "Title: " + title + ", Author: " + author;
    }
}

