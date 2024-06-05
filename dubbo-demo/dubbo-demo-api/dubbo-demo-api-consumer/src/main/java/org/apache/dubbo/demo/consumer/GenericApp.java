package org.apache.dubbo.demo.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.rpc.service.GenericService;

import java.util.HashMap;

public class GenericApp {

    public static void main(String[] args) throws InterruptedException {
        //创建ApplicationConfig
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("generic-impl-provider");
        //创建注册中心配置
        RegistryConfig registryConfig = new RegistryConfig("nacos://81.68.105.245:8848");



        //创建服务相关配置
        ReferenceConfig<GenericService> service = new ReferenceConfig<>();
        service.setApplication(applicationConfig);
        service.setRegistry(registryConfig);
        service.setInterface("org.apache.dubbo.demo.DemoService2");
        service.setGeneric("true");
        service.setTimeout(60000);
        //重点：设置为泛化调用
        //注：不再推荐使用参数为布尔值的setGeneric函数
        //应该使用referenceConfig.setGeneric("true")代替

        GenericService genericService = service.get();

        HashMap<String, String> req = new HashMap<>();
        req.put("name","zhangsan");
        req.put("age","22");

        Object object = genericService.$invoke("sayHello", new String[]{"org.apache.dubbo.demo.Pojo"}, new Object[]{req});

        System.out.println("dubbo service started");
    }

}
