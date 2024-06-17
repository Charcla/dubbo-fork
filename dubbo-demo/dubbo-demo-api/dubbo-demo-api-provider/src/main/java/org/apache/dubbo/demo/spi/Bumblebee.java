package org.apache.dubbo.demo.spi;

public class Bumblebee implements Robot{
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Bumblebee.");
    }
}
