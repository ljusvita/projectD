package com.example.lottery.app;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class Loto7Handler {

  public Mono<ServerResponse> loto7(ServerRequest request) {
    Loto7 loto7 = new Loto7();
    loto7.setNumbers(List.of(1, 2, 3, 4, 5, 6, 7));

    return ServerResponse.ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(Mono.just(loto7), Loto7.class);
  }
}
