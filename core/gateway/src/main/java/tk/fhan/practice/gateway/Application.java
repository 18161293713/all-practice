package tk.fhan.practice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 11:05 2018/11/12
 * @modified By:
 */
@Configuration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    // 实现路由
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().route(p -> p
                .path("/mgt/**")
                .filters(f -> f.addRequestHeader("token", "key"))
                .uri(""))
                .build();
    }
}
