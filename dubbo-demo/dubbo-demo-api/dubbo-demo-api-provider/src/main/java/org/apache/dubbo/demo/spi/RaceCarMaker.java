package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.URL;

public class RaceCarMaker implements CarMaker{

    WheelMaker wheelMaker;

    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }

    @Override
    public Car makeCar(URL url) {
        return null;
    }
}
