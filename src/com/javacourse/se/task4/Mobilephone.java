package com.javacourse.se.task4;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Mobilephone extends Phone {

  private int sizeOfDisplay;
  private int screenResolution;
  private boolean camera;
  private boolean colorDisplay;

  public Mobilephone() {
  }

  public Mobilephone(Brand brand, String model, Color color, Calendar releaseDate,
      int sizeOfDisplay, int screenResolution, boolean camera, boolean colorDisplay) {
    super(brand, model, color, releaseDate);
    this.sizeOfDisplay = sizeOfDisplay;
    this.screenResolution = screenResolution;
    this.camera = camera;
    this.colorDisplay = colorDisplay;
  }

  public void sendSMS() {
    System.out.println("Type a text and then send a message");
  }

  public void sendMMS() {
    System.out.println("Choose a picture and then send a message");
  }

  public int getSizeOfDisplay() {
    return sizeOfDisplay;
  }

  public int getScreenResolution() {
    return screenResolution;
  }

  public boolean isCamera() {
    return camera;
  }

  public boolean isColorDisplay() {
    return colorDisplay;
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
    return sizeOfDisplay == that.sizeOfDisplay && screenResolution == that.screenResolution
        && camera == that.camera && colorDisplay == that.colorDisplay;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), sizeOfDisplay, screenResolution, camera, colorDisplay);
  }

  @Override
  public String toString() {
    stringBuilder.append("Mobilephone {");
    stringBuilder.append("brand=").append(brand);
    stringBuilder.append(", model='").append(model).append('\'');
    stringBuilder.append(", color=").append(color);
    stringBuilder.append(", releaseDate=").append(releaseDate);
    stringBuilder.append(", sizeOfDisplay=").append(sizeOfDisplay);
    stringBuilder.append(", screenResolution=").append(screenResolution);
    stringBuilder.append(", camera=").append(camera);
    stringBuilder.append(", colorDisplay=").append(colorDisplay);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}
