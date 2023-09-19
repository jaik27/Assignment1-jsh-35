package com.csis3275.model_jsh_35;

public class NonFictionBook extends Book {
    private String topic;
   
    public NonFictionBook(String title, String author, String topic) {
        super(title, author);
        this.topic = topic;
    }
   
    // Non-trivial method example
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
   
    // Non-trivial method example
    public String getNonFictionBookInfo() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Topic: " + topic + ", Genre: Non-Fiction";
    }
}
