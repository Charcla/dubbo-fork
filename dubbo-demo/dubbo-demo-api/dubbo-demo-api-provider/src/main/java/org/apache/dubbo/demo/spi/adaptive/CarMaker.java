package org.apache.dubbo.demo.spi.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.demo.spi.adaptive.Car;

public interface CarMaker {

    Car makeCar(URL url);

}
