package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.demo.DemoService;

public class DogHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "dog hello";
    }
}
