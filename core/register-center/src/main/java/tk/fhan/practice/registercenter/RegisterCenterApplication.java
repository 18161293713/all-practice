package tk.fhan.practice.registercenter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 13:25 2018/10/23
 * @modified By:
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RegisterCenterApplication.class).web(true).run(args);
    }
}
