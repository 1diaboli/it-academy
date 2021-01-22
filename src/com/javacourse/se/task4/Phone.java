package com.javacourse.se.task4;

import com.javacourse.se.task4.enums.Brand;
import java.awt.Color;
import java.util.Date;

public abstract class Phone {

  private Brand brand;
  private String model;
  private Color color;
  private Date releaseDate;

  public Phone() {
  }

  public Phone(Brand brand, String model, Color color, Date releaseDate) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.releaseDate = releaseDate;
  }

  public abstract void call();

  public void answer() {
    System.out.println("Hello, I`m listening to you");
  }


}
