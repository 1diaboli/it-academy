package com.javacourse.se.task4.phones;

import com.javacourse.se.task4.enums.Brand;
import java.awt.Color;
import java.util.Calendar;
import java.util.Objects;

public class Mobilephone extends Phone {

  private double sizeOfDisplay;
  private String screenResolution;
  private boolean hasCamera;
  private boolean hasColorDisplay;
  private double price;

  public Mobilephone() {
  }

  public Mobilephone(Brand brand, String model, Color color,
      Calendar releaseDate, double sizeOfDisplay, String screenResolution, boolean hasCamera,
      boolean hasColorDisplay, double price) {
    super(brand, model, color, releaseDate);
    this.sizeOfDisplay = sizeOfDisplay;
    this.screenResolution = screenResolution;
    this.hasCamera = hasCamera;
    this.hasColorDisplay = hasColorDisplay;
    this.price = price;
  }

  public void sendSMS() {
    System.out.println("Type a text and then send a message");
  }

  public void sendMMS() {
    System.out.println("Choose a picture and then send a message");
  }

  public double getSizeOfDisplay() {
    return sizeOfDisplay;
  }

  public String getScreenResolution() {
    return screenResolution;
  }

  public boolean isHasCamera() {
    return hasCamera;
  }

  public boolean isHasColorDisplay() {
    return hasColorDisplay;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public void call() {
    System.out.println("You call from Mobilephone");
  }

  @Override
  public void answer() {
    System.out.println("Hello, you call me on mobilephone");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Mobilephone that = (Mobilephone) o;
    return Double.compare(that.sizeOfDisplay, sizeOfDisplay) == 0
        && hasCamera == that.hasCamera && hasColorDisplay == that.hasColorDisplay
        && Double.compare(that.price, price) == 0 && Objects
        .equals(screenResolution, that.screenResolution);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), sizeOfDisplay, screenResolution, hasCamera, hasColorDisplay, price);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Mobilephone{");
    sb.append("sizeOfDisplay=").append(sizeOfDisplay);
    sb.append(", screenResolution='").append(screenResolution).append('\'');
    sb.append(", hasCamera=").append(hasCamera);
    sb.append(", hasColorDisplay=").append(hasColorDisplay);
    sb.append(", price=").append(price);
    sb.append(", brand=").append(brand);
    sb.append(", model='").append(model).append('\'');
    sb.append(", color=").append(color);
    sb.append(", releaseDate=").append(releaseDate);
    sb.append('}');
    return sb.toString();
  }
}