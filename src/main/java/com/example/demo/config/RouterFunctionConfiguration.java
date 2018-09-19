/*
package com.example.demo.config;

import com.example.demo.domain.Glf;
import com.example.demo.domain.User;
import com.example.demo.mapper.GlfMapper;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;

*/
/**
 * 函数式编程
 * spring 5.0重新定义了服务请求和响应接口；ServerRequest / ServerResponse
 *
 *//*

@Configuration
public class RouterFunctionConfiguration {


    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository) {
        return RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
                request -> {
                    Collection<User> users = userRepository.findAllUser();
                    Flux<User> userFlux = Flux.fromIterable(users);
                    Mono<ServerResponse> response = ServerResponse.ok().body(userFlux, User.class);
                    return response;
                });

    }


    @Bean
    @Autowired
    public RouterFunction<ServerResponse> findGlf(GlfMapper glfMapper) {
        return RouterFunctions.route(RequestPredicates.GET("/glf/find/all"),
                request -> {
                    Collection<Glf> glf = glfMapper.findGlfAll();
                    Flux<Glf> userFlux = Flux.fromIterable(glf);
                    Mono<ServerResponse> response = ServerResponse.ok().body(userFlux, Glf.class);
                    return response;
                });
    }
}
*/
