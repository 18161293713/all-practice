package fk.fhan.practice.mgt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 14:44 2018/10/23
 * @modified By:
 */
@SpringBootApplication
@EnableFeignClients
@RestController
public class MgtApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MgtApplication.class).web(true).run(args);
    }

}
