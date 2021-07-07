package com.company;

public class CarType {
    String carType;

    public CarType( String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return  "\nтип='" + carType ;
    }
}
