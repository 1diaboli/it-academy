package com.javacourse.se.task4;

import java.awt.Color;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Smartwatch that = (Smartwatch) o;
    return sizeOfDisplay == that.sizeOfDisplay && sizeOfRAM == that.sizeOfRAM
        && sizeOfMemory == that.sizeOfMemory && sizeOfBattery == that.sizeOfBattery
        && brand == that.brand && Objects.equals(model, that.model) && Objects
        .equals(bodyColor, that.bodyColor) && Objects.equals(strapColor, that.strapColor)
        && Objects.equals(bodyMaterial, that.bodyMaterial) && os == that.os
        && matrix == that.matrix && cpu == that.cpu;
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(brand, model, bodyColor, strapColor, bodyMaterial, os, matrix, cpu, sizeOfDisplay,
            sizeOfRAM, sizeOfMemory, sizeOfBattery);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Smartwatch{");
    sb.append("brand=").append(brand);
    sb.append(", model='").append(model).append('\'');
    sb.append(", bodyColor=").append(bodyColor);
    sb.append(", strapColor=").append(strapColor);
    sb.append(", bodyMaterial='").append(bodyMaterial).append('\'');
    sb.append(", os=").append(os);
    sb.append(", matrix=").append(matrix);
    sb.append(", cpu=").append(cpu);
    sb.append(", sizeOfDisplay=").append(sizeOfDisplay);
    sb.append(", sizeOfRAM=").append(sizeOfRAM);
    sb.append(", sizeOfMemory=").append(sizeOfMemory);
    sb.append(", sizeOfBattery=").append(sizeOfBattery);
    sb.append('}');
    return sb.toString();
  }
}
