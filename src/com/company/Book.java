package com.company;

import java.util.Date;

public class Book {
    private String author;

    private String title;

    private Date date;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Book(String author, String title, Date date) {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    @Override
    public String toString() {
        return "";
    }
}

