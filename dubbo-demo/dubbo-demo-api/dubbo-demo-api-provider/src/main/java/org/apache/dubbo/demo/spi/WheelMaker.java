package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.URL;

//车轮制造厂接口
public interface WheelMaker {

    Wheel makeWheel(URL url);
}
