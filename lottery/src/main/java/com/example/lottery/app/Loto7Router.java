package com.example.lottery.app;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class Loto7Router {

    private static final String PATH = "/loto77";
    
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions.route(GET(PATH), this::loto7);
    }

    private Mono<ServerResponse> loto7(ServerRequest req) {
        // Loto6Service service = new Loto6Service();
        // // return ok().body(service.pick(), Loto6.class);
        // return ok().bodyValue(service.pick());
        Loto7 loto7 = new Loto7();
        loto7.setNumbers(List.of(1, 2, 3, 4, 5, 6, 7));
        return ok().bodyValue(loto7);
    }
}
