package com.anhdungpham.designpattern.dto.decorator;

import java.math.BigDecimal;

public class Red extends Color{

    private final Car car;

    public Red(Car car) {
        this.car = car;
    }

    @Override
    public BigDecimal price() {
        return (new BigDecimal("1.5")).add(car.price());
    }

    @Override
    public String getCarColourName() {
        return car.getCarName() + "RED";
    }
}
