package org.example.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/books")
public class BookController {
    @GetMapping("/{bookId}")
    public String book(@PathVariable String bookId) {
        return "Ama book numba " + bookId;
    }
}
