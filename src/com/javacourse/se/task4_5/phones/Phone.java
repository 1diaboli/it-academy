package com.javacourse.se.task4_5.phones;

import com.javacourse.se.task4_5.enums.Brand;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public abstract class Phone {

  protected Brand brand;
  protected String model;
  protected Color color;
  protected Calendar releaseDate;

  protected Phone() {
  }

  public Phone(Brand brand, String model, Color color, Calendar releaseDate) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.releaseDate = releaseDate;
  }

  public abstract void call();

  public void answer() {
    System.out.println("Hello, I`m listening to you");
  }

  public Brand getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public Color getColor() {
    return color;
  }

  public void getReleaseDate() {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy", Locale.getDefault());
    System.out.println(simpleDateFormat.format(releaseDate.getTime()));
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
    return brand == phone.brand && Objects.equals(model, phone.model) && Objects
        .equals(color, phone.color) && Objects.equals(releaseDate, phone.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, color, releaseDate);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Phone{");
    sb.append("brand=").append(brand);
    sb.append(", model='").append(model).append('\'');
    sb.append(", color=").append(color);
    sb.append(", releaseDate=").append(releaseDate);
    sb.append('}');
    return sb.toString();
  }
}
