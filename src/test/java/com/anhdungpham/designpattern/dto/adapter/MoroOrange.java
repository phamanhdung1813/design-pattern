package com.anhdungpham.designpattern.dto.adapter;

public class MoroOrange implements Orange {

    @Override
    public String getVariety() {
        return "HI MORO";
    }

    @Override
    public void eat() {
        System.out.println("Moro EAT");
    }

    @Override
    public void peel() {
        System.out.println("Moro PEEL");
    }

    @Override
    public void juice() {
        System.out.println("Moro JUICE");
    }
}
