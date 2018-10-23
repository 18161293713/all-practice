package fk.fhan.practice.mgt.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: hans.f.han
 * @description: 访问远程接口
 * @date: Created in 15:01 2018/10/23
 * @modified By:
 */
@FeignClient("system")
public interface SystemConsumer {
    @RequestMapping("/")
    String sayHello();
}
