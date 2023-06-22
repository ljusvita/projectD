package com.example.lottery.app;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/loto7")
@CrossOrigin("*")
public class Loto7Controller {

  @GetMapping
  public Mono<Loto7> loto7() {
    System.out.println("executed");
    return Mono.just(new Loto7.builder().quickPick().build());
  }
}
