package com.anhdungpham.designpattern.dto.decorator;

import java.math.BigDecimal;

public class Honda extends Car{

    public Honda() {
        this.carName = "HI HONDA";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("20.00");
    }
}
