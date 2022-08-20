package com.example.lottery.app;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/loto7")
public class Loto7Controller {

  @GetMapping
  public Mono<Loto7> loto7() {
    Loto7 loto7 = new Loto7();
    loto7.setNumbers(List.of(1, 2, 3, 4, 5, 6, 7));

    return Mono.just(loto7);
  }
}
