package fk.fhan.practice.mgt;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 15:01 2018/10/23
 * @modified By:
 */
@FeignClient("system")
public interface SystemConsumer {
    @RequestMapping("/")
    String sayHello();
}
