package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Main {

    public static void main(String[] args) {

        spi1();

    }

    private static void spi1(){
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        Robot optimusPrime2 = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();

        System.out.println();
    }

    private static void spi2(){

    }
}
