package org.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/{bookId}")
    public String book(@PathVariable String bookId) {
        return "Ama book numba " + bookId;
    }

    @GetMapping("/about-instance")
    public String aboutInstance() {
        return "Ama instance namba " + instanceId;
    }
}
