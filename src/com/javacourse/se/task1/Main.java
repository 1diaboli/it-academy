package com.javacourse.se.task1;

import com.javacourse.se.task1.Car;

public class Main {

  public static void main(String[] args) {

    Car carFirst = new Car();
    System.out.println("Марка " + carFirst.brand);
    System.out.println("Модель " + carFirst.model);
    System.out.println("Год " + carFirst.year);
    System.out.println("Цвет " + carFirst.color);
    System.out.println("Тип коробки передач " + carFirst.transmissionType);
    System.out.println("Пробег " + carFirst.mileage);
    carFirst.setEngineVolume(2200);
    carFirst.setEngineType("diesel");
    carFirst.setNavi(false);
    carFirst.setClimateControl(false);
    carFirst.setAirBags(false);
    carFirst.setTrunkVolume(300);
    carFirst.setLength(180);
    carFirst.setWeight(2100);
    carFirst.setPrice(10000);

    System.out.println(carFirst.getEngineVolume());
    System.out.println(carFirst.getEngineType());
    System.out.println(carFirst.getNavi());
    System.out.println(carFirst.getClimateControl());
    System.out.println(carFirst.getAirBags());
    System.out.println(carFirst.getTrunkVolume());
    System.out.println(carFirst.getLength());
    System.out.println(carFirst.getWeight());
    System.out.println(carFirst.getPrice());

//попытка распечатать приватное поле вызывает ошибку java: price has private access in com.javacourse.se.task1.Car
//System.out.println(car.price);

    Car carSecond = new Car("Audi", "A8", 2019, "black", 3000, "petrol", "auto", true, true, true,
        370, 190, 2500, 5000, 9000);
    System.out.println(carSecond.toString());


  }
}
