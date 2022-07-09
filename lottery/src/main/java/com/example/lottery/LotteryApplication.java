package com.example.lottery;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.lottery.app.Loto7Router;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class LotteryApplication {

  public static void main(String[] args) {
    SpringApplication.run(LotteryApplication.class, args);
  }

  @Bean
  RouterFunction<ServerResponse> routes() {
    return route(GET("/"), req -> ok().body(Flux.just("Hello", "World!"), String.class));
  }

  @Bean
  RouterFunction<ServerResponse> routess(Loto7Router loto7Router) {
    return loto7Router.route();
  }
}
