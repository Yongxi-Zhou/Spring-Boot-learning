package com.example.demo.controller;

import com.example.demo.AjaxResponse;
import com.example.demo.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class BookController {

//    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    @GetMapping("/books/{id}")
    public AjaxResponse getBook(@PathVariable Integer id) {

        Book book = Book.builder().id(id).title("bookTitle").author("book-author").build();
        log.info("book : {}", book);
        AjaxResponse response = AjaxResponse.builder().code(200).msg("Success!!").data(book).build();
        log.info("response : {}", response);
        return AjaxResponse.success(book);
    }

//    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @PostMapping("/book")
    public AjaxResponse saveBook() {
        log.info("book : {}", "book");

        return AjaxResponse.success("");
    }

//    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    @PutMapping("/book")
    public AjaxResponse updateBook() {
        log.info("book : {}", "book");
        return AjaxResponse.success("");
    }

//    @RequestMapping(value = "/book", method = RequestMethod.DELETE)
    @DeleteMapping("/book")
    public AjaxResponse deleteBook() {
        log.info("book : {}", "book");
        return AjaxResponse.success("");
    }
}
