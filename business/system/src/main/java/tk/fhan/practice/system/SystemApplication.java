package tk.fhan.practice.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 13:56 2018/10/23
 * @modified By:
 */
@SpringBootApplication
@MapperScan("tk.fhan.practice.system.modules.user.mapper")
public class SystemApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SystemApplication.class).web(true).run(args);
    }
}
