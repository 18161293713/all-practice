package fk.fhan.practice.mgt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @Autowired
    private SystemConsumer systemConsumer;

    public static void main(String[] args) {
        new SpringApplicationBuilder(MgtApplication.class).web(true).run(args);
    }

    @RequestMapping("/sayHello")
    public String sayHello() {
        String sayHello = systemConsumer.sayHello();
        return sayHello;
    }

}
