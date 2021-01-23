package com.javacourse.se.task2;


public class Area {

  private double length;
  private double width;

  public Area() {
  }

  public Area(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getLength() {
    return length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getWidth() {
    return width;
  }

  //  расчитывает площадь участка
  public double getSquareArea() {
    return length * width;
  }

  //  расчитывает периметр участка
  public double getPerimeterArea() {
    return (2 * length) + (2 * width);
  }

  //  переводит площадь участка м2 в сотки
  public void convertToSotka() {
    System.out.println("Площадь участка в сотках: " + length * width / 100 + " сотка");
  }

  //  переводит площадь участка м2 в га
  public void convertToGa() {
    System.out.println("Площадь участка в гектарах " + length * width / 10000 + " га");
  }

  //  сравнение площади участков
  public void compare(Area area) {
    if (getSquareArea() > area.getSquareArea()) {
      System.out.println("Первый участок больше второго");
    } else if (getSquareArea() < area.getSquareArea()) {
      System.out.println("Второй участок больше первого");
    } else {
      System.out.println("Участки равны");
    }
  }


}
