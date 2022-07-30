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
  public RouterFunction<ServerResponse> getUsers(MiniLotoHandler MiniLotoHandler) {
    return RouterFunctions.route(
        RequestPredicates.GET("/loto/mini")
            .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
        MiniLotoHandler::miniLoto);
  }
}