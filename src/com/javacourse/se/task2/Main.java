package com.javacourse.se.task2;

public class Main {

  public static void main(String[] args) {

    Area area1 = new Area(10, 10);
    Area area2 = new Area(11, 11);
    House house1 = new House("Александровская", 5, 2015, 9, "кирпич+блок", false, true, false, 13.4,
        15.7, 2.8);
    House house2 = new House("Березинская", 6, 2011, 1, "дерево", true, false, true, 7, 5.8, 2.5);

    System.out.println("Площадь участка " + area1.getSquareArea() + " м2");
    System.out.println("Площадь участка " + area2.getSquareArea() + " м2");
    System.out.println("Периметр участка " + area1.getPerimeterArea() + " м");
    System.out.println("Периметр участка " + area2.getPerimeterArea() + " м");
    area1.convertToSotka();
    area2.convertToSotka();
    area1.convertToGa();
    area2.convertToGa();
    area1.compare(area2);
    area2.compare(area1);

    System.out.println("Площадь дома " + house1.getSquareHouse() + " м2");
    System.out.println("Площадь дома " + house2.getSquareHouse() + " м2");
    System.out.println("Объем дома " + house1.getVolumeHouse() + " м3");
    System.out.println("Объем дома " + house2.getVolumeHouse() + " м3");

    house1.getAddressHouse();
    house2.getAddressHouse();
    house1.evenOddNumber();
    house2.evenOddNumber();

    house1.capacity(area1, house2);
    house1.date();
    house2.date();

    house1.communications();
    house2.communications();

    System.out.println(house1.age());
    System.out.println(house2.age());
  }

}
