package org.apache.dubbo.demo.spi.adaptive;

import org.apache.dubbo.demo.spi.adaptive.Car;

public class RaceCar implements Car {

    private Wheel wheel;

    public RaceCar(Wheel wheel){
        this.wheel=wheel;
    }
}
