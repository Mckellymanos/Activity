
package com.mycompany.book;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

 
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   
    public static void addBook(ArrayList<Book> collection, Book book) {
        collection.add(book);
        System.out.println("Book added: Title - " + book.getTitle() + ", Author - " + book.getAuthor() + ", ISBN - " + book.getIsbn());
    }

    
    public static void removeBook(ArrayList<Book> collection, Book book) {
        if (collection.remove(book)) {
            System.out.println("Book removed: Title - " + book.getTitle() + ", Author - " + book.getAuthor() + ", ISBN - " + book.getIsbn());
        } else {
            System.out.println("Book not found in the collection.");
        }
    }

    
    public static void main(String[] args) {
        ArrayList<Book> bookCollection = new ArrayList<>();

      
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        
        addBook(bookCollection, book1);
        addBook(bookCollection, book2);

     
        removeBook(bookCollection, book1);

        
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455");
        removeBook(bookCollection, book3);
    }
}
