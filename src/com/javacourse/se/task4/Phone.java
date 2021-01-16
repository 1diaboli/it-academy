package com.javacourse.se.task4;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class Phone {

  protected StringBuilder stringBuilder = new StringBuilder();
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return brand == phone.brand && model.equals(phone.model) && color.equals(phone.color)
        && releaseDate.equals(phone.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, color, releaseDate);
  }

  @Override
  public String toString() {
    stringBuilder.append("Phone {");
    stringBuilder.append("brand=").append(brand);
    stringBuilder.append(", model='").append(model).append('\'');
    stringBuilder.append(", color=").append(color);
    stringBuilder.append(", releaseDate=").append(releaseDate);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}
