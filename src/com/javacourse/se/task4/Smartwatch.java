package com.javacourse.se.task4;

public class Smartwatch implements Smart {

  private String brand;
  private String model;
  private String bodyColor;
  private String strapColor;
  private String bodyMaterial;
  private int sizeOfDisplay;
  private int sizeOfRAM;
  private int sizeOfMemory;
  private int sizeOfBattery;

  public Smartwatch() {
  }

  public Smartwatch(String brand, String model, String bodyColor, String strapColor,
      String bodyMaterial, int sizeOfDisplay, int sizeOfRAM, int sizeOfMemory, int sizeOfBattery) {
    this.brand = brand;
    this.model = model;
    this.bodyColor = bodyColor;
    this.strapColor = strapColor;
    this.bodyMaterial = bodyMaterial;
    this.sizeOfDisplay = sizeOfDisplay;
    this.sizeOfRAM = sizeOfRAM;
    this.sizeOfMemory = sizeOfMemory;
    this.sizeOfBattery = sizeOfBattery;
  }

  public void checkPulse() {
    System.out.println("Your pulse is: ");
  }

  public void checkNumberOfSteps() {
    System.out.println("Your step count: ");
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getBodyColor() {
    return bodyColor;
  }

  public String getStrapColor() {
    return strapColor;
  }

  public String getBodyMaterial() {
    return bodyMaterial;
  }

  public int getSizeOfDisplay() {
    return sizeOfDisplay;
  }

  public int getSizeOfRAM() {
    return sizeOfRAM;
  }

  public int getSizeOfMemory() {
    return sizeOfMemory;
  }

  public int getSizeOfBattery() {
    return sizeOfBattery;
  }

  @Override
  public void installApp() {
    System.out.println("Select the application you want to add to your watch");
  }

  @Override
  public void getOS() {
    System.out.println("Your operating system is one of:\n"
        + "Android Wear\n"
        + "Tizen OS\n"
        + "Watch OS\n"
        + "Pebble OS\n"
        + "Garmin OS");
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
