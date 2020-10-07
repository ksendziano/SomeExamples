package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library() {}

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> tempBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor() == author){
                tempBooks.add(book);
            }
        }
        return tempBooks;
    }
    public ArrayList<Book> findBooksByTitle(String title) {
        ArrayList<Book> tempBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                tempBooks.add(book);
            }
        }
        return tempBooks;
    }
    public ArrayList<Book> findBooksByDate(Date date) {
        ArrayList<Book> tempBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getDate() == date){
                tempBooks.add(book);
            }
        }
        return tempBooks;
    }

    public void deleteBook(Book book){
        books.remove(book);
    }

    public void sortBooksByDate(){
       books.sort((a,b)->a.getDate().compareTo(b.getDate()));
    }

    public void sortBooksByAuthor(){
        books.sort((a, b)-> a.getAuthor().compareTo(b.getAuthor()));
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "";
    }
}

