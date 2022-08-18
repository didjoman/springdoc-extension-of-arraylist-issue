package com.example.demo.controllers;

import io.swagger.v3.oas.annotations.Operation;

import com.example.demo.model.Book;
import com.example.demo.model.Books;
import com.example.demo.model.Knowledge;
import com.example.demo.model.Response;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class BasicController {

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "get", description = "Provides a list of books.")
    public Knowledge get() {
        return new Books(new Book("Introduction to algorithms"));
    }
}
