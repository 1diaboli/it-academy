package com.javacourse.se.task4;

import com.javacourse.se.task4.enums.Brand;
import com.javacourse.se.task4.enums.CPU;
import com.javacourse.se.task4.enums.Matrix;
import com.javacourse.se.task4.enums.OS;
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
  private boolean wiFi;


  public SmartTV() {
  }

  public SmartTV(Brand brand, String model, Color color, Matrix matrix, int sizeOfDisplay,
      OS os, CPU cpu, int sizeOfRAM, boolean wiFi) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.matrix = matrix;
    this.sizeOfDisplay = sizeOfDisplay;
    this.os = os;
    this.cpu = cpu;
    this.sizeOfRAM = sizeOfRAM;
    this.wiFi = wiFi;
  }

  public void playVideo() {
    System.out.println("You watch this video");
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

  public CPU getCpu() {
    return cpu;
  }

  public int getSizeOfRAM() {
    return sizeOfRAM;
  }

  public boolean isWiFi() {
    return wiFi;
  }

  @Override
  public void installApp() {
    System.out.println("Select application to download on your TV");
  }

  @Override
  public void getOS() {
    System.out.println("Your OS is: " + getMatrix());
  }

  @Override
  public String toString() {
    return "SmartTV{" +
        "brand=" + brand +
        ", model='" + model + '\'' +
        ", color=" + color +
        ", matrix=" + matrix +
        ", sizeOfDisplay=" + sizeOfDisplay +
        ", os=" + os +
        ", cpu=" + cpu +
        ", sizeOfRAM=" + sizeOfRAM +
        ", wiFi=" + wiFi +
        '}';
  }
}
