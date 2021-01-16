package com.javacourse.se.task4;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Phone {

  protected Brand brand;
  protected String model;
  protected Color color;
  protected Date releaseDate;

  protected Phone() {
  }

  protected Phone(Brand brand, String model, Color color, Date releaseDate) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.releaseDate = releaseDate;
  }

  protected abstract void call();

  protected void answer() {
    System.out.println("Hello, I`m listening to you");
  }

  protected void dateFormater(Date date) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:MM:yyyy hh:mm:ss");
    System.out.println(simpleDateFormat.format(date));
  }
}
