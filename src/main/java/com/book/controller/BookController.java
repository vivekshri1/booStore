package com.book.controller;

import com.book.model.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("api/v1/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        BookDto bookDto = BookDto.builder()
                .title("My First book title")
                .build();
        List<BookDto> books = new ArrayList<>();
        books.add(bookDto);
        return ResponseEntity.ok(books);

    }
}
