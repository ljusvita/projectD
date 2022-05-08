package com.example.lottery.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lotto7")
public class Loto7Controller {

    @GetMapping
    public String lotto7() {
        return "1, 2, 3, 4, 5, 6, 7";
    }
}
