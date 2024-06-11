package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.URL;

public interface CarMaker {

    Car makeCar(URL url);

}
