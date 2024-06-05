package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService2;
import org.apache.dubbo.demo.Pojo;
import org.apache.dubbo.demo.TestRes;

public class DemoServiceImpl2 implements DemoService2 {
    @Override
    public TestRes sayHello(Pojo pojo) {

        TestRes res = new TestRes();
        res.setCode("999999");
        res.setMessage("成功");
//        throw new RuntimeException("000");
        return res;
    }
}
