package com.example.lottery.app;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/** 미니로또 핸들러 */
@Component
public class MiniLotoHandler {

  public Mono<ServerResponse> miniLoto(ServerRequest request) {
    MiniLoto miniLoto = new MiniLoto();
    miniLoto.setNumbers(List.of(1, 2, 3, 4, 5));

    return ServerResponse.ok()
        .contentType(MediaType.APPLICATION_JSON)
        .body(Mono.just(miniLoto), MiniLoto.class);
  }
}
