package com.example.demo.model;

public class Response {

    private Knowledge books;

    public Response(Knowledge books) {
        this.books = books;
    }

    public Knowledge getBooks() {
        return books;
    }

    public void setBooks(Knowledge books) {
        this.books = books;
    }
}
