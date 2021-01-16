package com.javacourse.se.task4;

import java.awt.Color;
import java.util.Date;

public class Mobilephone extends Phone {

  private int sizeOfDisplay;
  private int screenResolution;
  private boolean camera;
  private boolean colorDisplay;

  public Mobilephone() {
  }

  public Mobilephone(Brand brand, String model, Color color, Date releaseDate,
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
}
