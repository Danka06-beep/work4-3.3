package com.company;

public class Transport {
    String number;
    String model;
    String color;


    public Transport(String number,String model,String color) {
        this.number = number;
        this.model = model;
        this.color = color;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        return number != null ? number.equals(transport.number) : transport.number == null;
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nТранспорт= " + "номер: " + number + ", модель: " + model + ", цвет:" + color;
    }
}
