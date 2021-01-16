package com.javacourse.se.task4;

import java.awt.Color;

public class SmartTV implements Smart {

  private Brand brand;
  private String model;
  private Color color;
  private Matrix matrix;
  private int sizeOfDisplay;
  private OS os;
  private CPU cpu;
  private int sizeOfRAM;
  private int sizeOfMemory;
  private boolean wiFi;

  public SmartTV() {
  }

  public SmartTV(Brand brand, String model, Color color, Matrix matrix, int sizeOfDisplay,
      OS os, CPU cpu, int sizeOfRAM, int sizeOfMemory, boolean wiFi) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.matrix = matrix;
    this.sizeOfDisplay = sizeOfDisplay;
    this.os = os;
    this.cpu = cpu;
    this.sizeOfRAM = sizeOfRAM;
    this.sizeOfMemory = sizeOfMemory;
    this.wiFi = wiFi;
  }

  public void playVideo() {
    System.out.println("Select the video you want to watch");
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

  public Matrix getMatrix() {
    return matrix;
  }

  public int getSizeOfDisplay() {
    return sizeOfDisplay;
  }

  public OS getOs() {
    return os;
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

  public boolean isWiFi() {
    return wiFi;
  }

  @Override
  public void installApp() {
    System.out.println("Select application to download on your TV");
  }
}
