package com.itclj.common;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("s1", r -> r.path("/s1/**").uri("http://127.0.0.1:8081")) //注意**通配符
                .route("s2", r -> r.path("/s2/**").uri("http://127.0.0.1:8082"))
                .build();
    }
}
