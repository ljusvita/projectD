package com.example.lottery.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

  @Bean
  public RouterFunction<ServerResponse> getUsers(MiniLotoHandler miniLotoHandler) {
    return RouterFunctions.route(
        RequestPredicates.GET("/loto/mini")
            .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
        miniLotoHandler::loto7);
  }

  @Bean
  public RouterFunction<ServerResponse> getLoto7(Loto7Handler loto7Handler) {
    return RouterFunctions.route(
        RequestPredicates.GET("/loto/７").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
        loto7Handler::loto7);
  }
}
