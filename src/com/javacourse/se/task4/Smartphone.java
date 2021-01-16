package com.javacourse.se.task4;

import java.awt.Color;
import java.util.Date;

public class Smartphone extends Phone implements Smart {

  private int sizeOfDisplay;
  private Matrix matrix;
  private int screenResolution;
  private CPU cpu;
  private int sizeOfRAM;
  private int sizeOfMemory;
  private int cameraResolution;
  private int sizeOfBattery;

  public Smartphone() {
  }

  public Smartphone(Brand brand, String model, Color color, Date releaseDate, int sizeOfDisplay,
      Matrix matrix, int screenResolution, CPU cpu, int sizeOfRAM, int sizeOfMemory,
      int cameraResolution, int sizeOfBattery) {
    super(brand, model, color, releaseDate);
    this.sizeOfDisplay = sizeOfDisplay;
    this.matrix = matrix;
    this.screenResolution = screenResolution;
    this.cpu = cpu;
    this.sizeOfRAM = sizeOfRAM;
    this.sizeOfMemory = sizeOfMemory;
    this.cameraResolution = cameraResolution;
    this.sizeOfBattery = sizeOfBattery;
  }

  public void openApp() {
    System.out.println("Select application to open");
  }

  public void makePhoto() {
    System.out.println("Press on this button to make a photo");
  }

  public int getSizeOfDisplay() {
    return sizeOfDisplay;
  }

  public Matrix getMatrix() {
    return matrix;
  }

  public int getScreenResolution() {
    return screenResolution;
  }

  public CPU getCpu() {
    return cpu;
  }

  public int getSizeOfRAM() {
    return sizeOfRAM;
  }

  public int getSizeOfMemory() {
    return sizeOfMemory;
  }

  public int getCameraResolution() {
    return cameraResolution;
  }

  public int getSizeOfBattery() {
    return sizeOfBattery;
  }

  @Override
  public void call() {
    System.out.println("You call from Smartphone");
  }

  @Override
  public void answer() {
    System.out.println("Hello, you call me on smartphone");
  }

  @Override
  public void installApp() {
    System.out.println("Select application to install on your Smartphone");
  }
}
