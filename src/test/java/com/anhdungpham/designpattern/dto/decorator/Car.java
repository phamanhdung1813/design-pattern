package com.anhdungpham.designpattern.dto.decorator;

import java.math.BigDecimal;

public abstract class Car {
    protected String carName;

    public String getCarName() {
        return carName;
    }

    public abstract BigDecimal price();
}
