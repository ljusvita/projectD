package com.example.lottery.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/loto6")
public class Loto6Controller {

    @GetMapping
    public Mono<Loto6> loto6() {
//        return List.of("1", "2", "3", "4", "5", "6");
//        Loto6Service service = new Loto6Service();
        Loto6 loto6 = new Loto6();
        loto6.setNumbers(List.of(1, 2, 3, 4, 5, 6));
        return Mono.just(loto6);
    }
}
