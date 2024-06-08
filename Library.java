
package com.mycompany.library;


import java.util.ArrayList;
import java.util.List;

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

  
    public String displayBookDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class Library {
    private List<Book> books;

 
    public Library() {
        books = new ArrayList<>();
    }

   
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.displayBookDetails());
    }

    
    public void removeBook(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removed: " + bookToRemove.displayBookDetails());
        } else {
            System.out.println("Book not found with ISBN: " + isbn);
        }
    }

   
    public static void main(String[] args) {
        Library library = new Library();

    
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

      
        library.addBook(book1);
        library.addBook(book2);

     
        library.removeBook("1234567890");

    
        library.removeBook("0000000000");
    }
}
