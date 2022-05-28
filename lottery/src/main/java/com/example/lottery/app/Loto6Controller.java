package com.example.lottery.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/loto6")
public class Loto6Controller {

    @GetMapping
    public Mono<Loto6> loto6() {
        Loto6Service service = new Loto6Service();
        return Mono.just(service.pick());
    }
}
