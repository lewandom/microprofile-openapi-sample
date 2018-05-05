package com.ibm.code.bookstore;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class Book {

    @Schema(required = true, description = "The full title of the book", example = "Pan Wołodyjowski")
    private String title;

    @Schema(required = true, description = "The name and surname of the book's author", example = "Henryk Sienkiewicz")
    private String author;

    public Book(String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }

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

}
