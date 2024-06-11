package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * 本类是一个代理类，与传统的代理逻辑不同，此类所代理的对象是在makeWheel方法中通过SPI机制加载得到的
 */
public class AdaptiveWheelMaker implements WheelMaker{
    @Override
    public Wheel makeWheel(URL url) {

        if(url == null){
            throw new IllegalArgumentException("url == null");
        }

        // 1.从 URL 中获取 WheelMaker 名称
        String wheelMakerName = url.getParameter("Wheel.maker");

        // 2.通过 SPI 加载具体的 WheelMaker
        WheelMaker wheelMaker = ExtensionLoader
                .getExtensionLoader(WheelMaker.class).getExtension(wheelMakerName);

        // 3.调用目标方法
        return wheelMaker.makeWheel(url);
    }
}
