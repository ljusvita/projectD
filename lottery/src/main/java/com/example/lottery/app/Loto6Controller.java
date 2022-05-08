package com.example.lottery.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loto6")
public class Loto6Controller {

    @GetMapping
    public String lotto6() {
        return "1, 2, 3, 4, 5, 6";
    }
}
