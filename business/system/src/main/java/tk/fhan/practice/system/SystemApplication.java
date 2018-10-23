package tk.fhan.practice.system;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 13:56 2018/10/23
 * @modified By:
 */
@SpringBootApplication
@RestController
public class SystemApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SystemApplication.class).web(true).run(args);
    }

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }
}
