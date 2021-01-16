package com.javacourse.se.task4;

import java.awt.Color;

public class Smartwatch implements Smart {

  private Brand brand;
  private String model;
  private Color bodyColor;
  private Color strapColor;
  private String bodyMaterial;
  private OS os;
  private Matrix matrix;
  private CPU cpu;
  private int sizeOfDisplay;
  private int sizeOfRAM;
  private int sizeOfMemory;
  private int sizeOfBattery;

  public Smartwatch() {
  }

  public Smartwatch(Brand brand, String model, Color bodyColor, Color strapColor,
      String bodyMaterial, OS os, Matrix matrix, CPU cpu, int sizeOfDisplay, int sizeOfRAM,
      int sizeOfMemory, int sizeOfBattery) {
    this.brand = brand;
    this.model = model;
    this.bodyColor = bodyColor;
    this.strapColor = strapColor;
    this.bodyMaterial = bodyMaterial;
    this.os = os;
    this.matrix = matrix;
    this.cpu = cpu;
    this.sizeOfDisplay = sizeOfDisplay;
    this.sizeOfRAM = sizeOfRAM;
    this.sizeOfMemory = sizeOfMemory;
    this.sizeOfBattery = sizeOfBattery;
  }

  public void checkPulse() {
    System.out.println("Your pulse is: ");
  }

  public void checkNumberOfSteps() {
    System.out.println("Number of steps: ");
  }

  public Brand getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public Color getBodyColor() {
    return bodyColor;
  }

  public Color getStrapColor() {
    return strapColor;
  }

  public String getBodyMaterial() {
    return bodyMaterial;
  }

  public OS getOs() {
    return os;
  }

  public Matrix getMatrix() {
    return matrix;
  }

  public CPU getCpu() {
    return cpu;
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
}
