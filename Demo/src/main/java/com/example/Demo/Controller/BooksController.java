package com.example.Demo.Controller;

import com.example.Demo.Service.BookServices;
import com.example.Demo.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    BookServices bookServices;

    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody Books book) {
        String st = bookServices.addBook(book);
        return new ResponseEntity<>(st, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Books> addBook(@PathVariable int id) {
        Books book = bookServices.getBook(id);
        return new ResponseEntity<>(book, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        String st = bookServices.deletebook(id);
        return new ResponseEntity<>(st, HttpStatus.FOUND);
    }

    @PutMapping("/update")
    public ResponseEntity<Books> updateBook(@RequestParam int id, @RequestParam int pages) {
        Books book=bookServices.updateBook(id,pages);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }
}

