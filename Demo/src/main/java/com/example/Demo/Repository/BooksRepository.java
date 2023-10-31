package com.example.Demo.Repository;

import com.example.Demo.models.Books;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BooksRepository {
    HashMap<Integer, Books> BooksMap;
     public  BooksRepository(){
        BooksMap =new HashMap<>();
    }
    public  String addBook(Books book) {
        BooksMap.put(book.getId(),book);
        return "book added";
    }

    public Books getBooks(int id){
        System.out.println(BooksMap.get(id).getName());
        return BooksMap.get(id);
    }
    public String deleteBook(int id){
         BooksMap.remove(id);
        return  "deleted";

    }
    public Books updateBook(int id,int pages){
         Books book=BooksMap.get(id);
         book.setpages(pages);
         BooksMap.put(book.getId(),book);
         return book;
    }
}
