package cn.leap.dubboprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.leap.dubbocommon.service.DemoService;

/**
 * @className: DemoAction
 * @description:
 * @dateTime 2018/5/14 16:26
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
    private DemoService demoService;

    @RequestMapping(value = "/say")
    public String sayHello(String name) {
        demoService.sayHello(name);
        System.out.println("调用成功");
        return "普通调用成功";
    }

}