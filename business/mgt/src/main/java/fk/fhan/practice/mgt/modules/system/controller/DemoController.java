package fk.fhan.practice.mgt.modules.system.controller;

import fk.fhan.practice.mgt.modules.system.api.SystemConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 10:30 2018/10/24
 * @modified By:
 */
@RestController
public class DemoController {

    @Autowired
    private SystemConsumer systemConsumer;

    @RequestMapping("/sayHello")
    public String sayHello() {
        String sayHello = systemConsumer.sayHello();
        return sayHello;
    }
}
