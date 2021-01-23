package com.javacourse.se.task4_5.smartdevices;

import com.javacourse.se.task4_5.enums.Brand;
import com.javacourse.se.task4_5.enums.CPU;
import com.javacourse.se.task4_5.enums.Matrix;
import com.javacourse.se.task4_5.enums.OS;
import com.javacourse.se.task4_5.smartinterface.Smart;
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
  private double price;

  public SmartTV() {
  }

  public SmartTV(Brand brand, String model, Color color,
      Matrix matrix, int sizeOfDisplay, OS os, CPU cpu, int sizeOfRAM, int sizeOfMemory,
      double price) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.matrix = matrix;
    this.sizeOfDisplay = sizeOfDisplay;
    this.os = os;
    this.cpu = cpu;
    this.sizeOfRAM = sizeOfRAM;
    this.sizeOfMemory = sizeOfMemory;
    this.price = price;
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

  public class InputOutputPort {

    private boolean bluetooth;
    private boolean wifi;
    private boolean componentInput;
    private boolean compositeInput;
    private boolean scart;
    private boolean vga;
    private boolean hdmi;
    private boolean usb;
    private boolean ethernet;
    private boolean airPlay;

    public InputOutputPort() {

    }

    public InputOutputPort(boolean bluetooth, boolean wifi, boolean componentInput,
        boolean compositeInput, boolean scart, boolean vga, boolean hdmi, boolean usb,
        boolean ethernet,
        boolean airPlay) {
      this.bluetooth = bluetooth;
      this.wifi = wifi;
      this.componentInput = componentInput;
      this.compositeInput = compositeInput;
      this.scart = scart;
      this.vga = vga;
      this.hdmi = hdmi;
      this.usb = usb;
      this.ethernet = ethernet;
      this.airPlay = airPlay;
    }

    public boolean isBluetooth() {
      return bluetooth;
    }

    public boolean isWifi() {
      return wifi;
    }

    public boolean isComponentInput() {
      return componentInput;
    }

    public boolean isCompositeInput() {
      return compositeInput;
    }

    public boolean isScart() {
      return scart;
    }

    public boolean isVga() {
      return vga;
    }

    public boolean isHdmi() {
      return hdmi;
    }

    public boolean isUsb() {
      return usb;
    }

    public boolean isEthernet() {
      return ethernet;
    }

    public boolean isAirPlay() {
      return airPlay;
    }
  }

  @Override
  public double getPrice() {
    return this.price;
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
        && sizeOfMemory == smartTV.sizeOfMemory && Double.compare(smartTV.price, price) == 0
        && brand == smartTV.brand && Objects.equals(model, smartTV.model)
        && Objects.equals(color, smartTV.color) && matrix == smartTV.matrix
        && os == smartTV.os && cpu == smartTV.cpu;
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(brand, model, color, matrix, sizeOfDisplay, os, cpu, sizeOfRAM, sizeOfMemory, price);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("SmartTV{");
    sb.append("brand=").append(brand);
    sb.append(", model='").append(model).append('\'');
    sb.append(", color=").append(color);
    sb.append(", matrix=").append(matrix);
    sb.append(", sizeOfDisplay=").append(sizeOfDisplay);
    sb.append(", os=").append(os);
    sb.append(", cpu=").append(cpu);
    sb.append(", sizeOfRAM=").append(sizeOfRAM);
    sb.append(", sizeOfMemory=").append(sizeOfMemory);
    sb.append(", price=").append(price);
    sb.append('}');
    return sb.toString();
  }
}
