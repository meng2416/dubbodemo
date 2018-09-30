package cn.leap.dubbocosumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.leap.dubbocommon.service.DemoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: DemoAction
 * @description:
 * @dateTime 2018/5/14 16:26
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    // dubbo的注解
    // 相当于<dubbo:reference interface="com.ahut.service.DemoService" id="demoService"/>
	@Reference(version="1.0.0")
    private DemoService demoService;

    @RequestMapping(value = "/say")
    public String sayHello(String name) {
        demoService.sayHello(name);
        System.out.println("调用成功");
        return "dubbo消费者调用服务者成功";
    }

}