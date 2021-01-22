package com.javacourse.se.task4;

import com.javacourse.se.task4.enums.Brand;
import com.javacourse.se.task4.enums.CPU;
import com.javacourse.se.task4.enums.Matrix;
import com.javacourse.se.task4.enums.OS;
import java.awt.Color;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTV smartTV = (SmartTV) o;
    return sizeOfDisplay == smartTV.sizeOfDisplay && sizeOfRAM == smartTV.sizeOfRAM
        && sizeOfMemory == smartTV.sizeOfMemory && wiFi == smartTV.wiFi && brand == smartTV.brand
        && model.equals(smartTV.model) && color.equals(smartTV.color) && matrix == smartTV.matrix
        && os == smartTV.os && cpu == smartTV.cpu;
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(brand, model, color, matrix, sizeOfDisplay, os, cpu, sizeOfRAM, sizeOfMemory, wiFi);
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
        ", sizeOfMemory=" + sizeOfMemory +
        ", wiFi=" + wiFi +
        '}';
  }
}
