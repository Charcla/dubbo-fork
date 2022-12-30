package org.apache.dubbo.demo.consumer.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface HelloService {

    String sayHello(String name);
}
