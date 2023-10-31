package com.example.Demo.Service;

import com.example.Demo.Repository.BooksRepository;
import com.example.Demo.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {
    @Autowired
    BooksRepository booksRepository;
    public String addBook(Books book){
        return booksRepository.addBook(book);
    }
    public Books getBook(int id){
        return booksRepository.getBooks(id);
    }


    public String deletebook(int id) {
        return booksRepository.deleteBook(id);
    }

    public Books updateBook(int id, int pages) {
        return booksRepository.updateBook(id,pages);
    }


}
