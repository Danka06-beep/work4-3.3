package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Transport transport1 = new Transport("А192АА183","ВАЗ 2105","Белый");
        Transport transport2 = new Transport("Б252АА109","ВАЗ 2106","Синий");
        Transport transport3 = new Transport("В152АА192","Камаз 120","Красный");

        CarType carType1 = new CarType("Легковые");
        CarType carType2 = new CarType("Грузовые");

        Map<CarType, Map<Transport, Integer>> carTypeMap1 = new HashMap<>();
        Map<Transport, Integer> carMap1 = new HashMap<>();

        carMap1.put(transport1,1);
        carMap1.put(transport2,2);

        Map<Transport, Integer> carMap2 = new HashMap<>();
        carMap2.put(transport3,3);

        carTypeMap1.put(carType1, carMap1);
        carTypeMap1.put(carType2, carMap2);


        System.out.println(carType1 + carMap1.toString());
        System.out.println(carType2 + carMap2.toString());

        System.out.println();
    }
}
/* Transport transport1 = new Transport("А192АА183","ВАЗ 2105","Белый");
        Transport transport2 = new Transport("Б252АА109","ВАЗ 2106","Синий");
        Transport transport3 = new Transport("В152АА192","Камаз 120","Красный");

        CarType carType1 = new CarType("Легковые");
        CarType carType2 = new CarType("Грузовые");

        Map<CarType, Map<Transport, Integer>> carTypeMap1 = new HashMap<>();
        Map<Transport, Integer> carMap1 = new HashMap<>();

        carMap1.put(transport1,1);
        carMap1.put(transport2,2);

        Map<Transport, Integer> carMap2 = new HashMap<>();
        carMap2.put(transport3,3);

        carTypeMap1.put(carType1, carMap1);
        carTypeMap1.put(carType2, carMap2);


        System.out.println(carType1 + carMap1.toString());
        System.out.println(carType2 + carMap2.toString());

        System.out.println();*/