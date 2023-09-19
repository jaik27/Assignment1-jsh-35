package com.csis3275.model_jsh_35;

public class FictionBook extends Book {
    private int pageCount;
   
    public FictionBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }
   
    // Non-trivial method example
    public String getGenre() {
        return "Fiction";
    }
   
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
   
    // Non-trivial method example
    public String getFictionBookInfo() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Page Count: " + pageCount + ", Genre: Fiction";
    }
}
