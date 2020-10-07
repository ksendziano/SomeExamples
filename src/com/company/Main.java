package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Вася", "Украл наш код", new Date());
        Book b2 = new Book("Петя", "Украл ваш код", new Date());
        Book b3 = new Book("Настя", "Украла у Васи с Петей сердечко", new Date());
        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.sortBooksByAuthor();
        System.out.println("");


    }
}
