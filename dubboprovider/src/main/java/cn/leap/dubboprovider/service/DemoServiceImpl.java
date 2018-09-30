package cn.leap.dubboprovider.service;


import com.alibaba.dubbo.config.annotation.Service;

import cn.leap.dubbocommon.service.DemoService;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService{
	
	@Override
    public void sayHello(String name) {
        System.out.println("hello , " + name);
    }
}
