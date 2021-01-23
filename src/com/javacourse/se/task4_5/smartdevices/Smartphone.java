package com.javacourse.se.task4_5.smartdevices;

import com.javacourse.se.task4_5.phones.Phone;
import com.javacourse.se.task4_5.enums.Brand;
import com.javacourse.se.task4_5.enums.CPU;
import com.javacourse.se.task4_5.enums.Matrix;
import com.javacourse.se.task4_5.enums.OS;
import com.javacourse.se.task4_5.smartinterface.Smart;
import java.awt.Color;
import java.util.Calendar;
import java.util.Objects;

public class Smartphone extends Phone implements Smart {

  private double sizeOfDisplay;
  private Matrix matrix;
  private String screenResolution;
  private CPU cpu;
  private OS os;
  private int sizeOfRAM;
  private int sizeOfMemory;
  private int sizeOfBattery;
  private double price;

  public Smartphone() {
  }

  public Smartphone(Brand brand, String model, Color color, Calendar releaseDate,
      double sizeOfDisplay, Matrix matrix, String screenResolution,
      CPU cpu, OS os, int sizeOfRAM, int sizeOfMemory, int sizeOfBattery, double price) {
    super(brand, model, color, releaseDate);
    this.sizeOfDisplay = sizeOfDisplay;
    this.matrix = matrix;
    this.screenResolution = screenResolution;
    this.cpu = cpu;
    this.os = os;
    this.sizeOfRAM = sizeOfRAM;
    this.sizeOfMemory = sizeOfMemory;
    this.sizeOfBattery = sizeOfBattery;
    this.price = price;
  }

  public void openApp() {
    System.out.println("Select application to open");
  }

  public void makePhoto() {
    System.out.println("Press on this button to make a photo");
  }

  public double getSizeOfDisplay() {
    return sizeOfDisplay;
  }

  public Matrix getMatrix() {
    return matrix;
  }

  public String getScreenResolution() {
    return screenResolution;
  }

  public CPU getCpu() {
    return cpu;
  }

  public OS getOs() {
    return os;
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

  public class MainCamera {

    private String additionalModule;
    private boolean opticalZoom;
    private boolean hasFlash;
    private double cameraResolution;
    private boolean hasAutoFocus;
    private boolean opticalStabilization;
    private String diaphragm;

    public MainCamera() {

    }

    public MainCamera(String additionalModule, boolean opticalZoom, boolean hasFlash,
        double cameraResolution, boolean hasAutoFocus, boolean opticalStabilization,
        String diaphragm) {
      this.additionalModule = additionalModule;
      this.opticalZoom = opticalZoom;
      this.hasFlash = hasFlash;
      this.cameraResolution = cameraResolution;
      this.hasAutoFocus = hasAutoFocus;
      this.opticalStabilization = opticalStabilization;
      this.diaphragm = diaphragm;
    }

    public String getAdditionalModules() {
      return additionalModule;
    }

    public boolean isOpticalZoom() {
      return opticalZoom;
    }

    public boolean isHasFlash() {
      return hasFlash;
    }

    public double getCameraResolution() {
      return cameraResolution;
    }

    public boolean isHasAutoFocus() {
      return hasAutoFocus;
    }

    public boolean isOpticalStabilization() {
      return opticalStabilization;
    }

    public String getDiaphragm() {
      return diaphragm;
    }
  }

  public class FrontCamera {

    private boolean hasFlash;
    private double cameraResolution;
    private boolean hasAutoFocus;
    private String diaphragm;

    public FrontCamera() {

    }

    public FrontCamera(boolean hasFlash, double cameraResolution, boolean hasAutoFocus,
        String diaphragm) {
      this.hasFlash = hasFlash;
      this.cameraResolution = cameraResolution;
      this.hasAutoFocus = hasAutoFocus;
      this.diaphragm = diaphragm;
    }

    public boolean isHasFlash() {
      return hasFlash;
    }

    public double getCameraResolution() {
      return cameraResolution;
    }

    public boolean isHasAutoFocus() {
      return hasAutoFocus;
    }

    public String getDiaphragm() {
      return diaphragm;
    }
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
  public double getPrice() {
    return this.price;
  }

  @Override
  public void installApp() {
    System.out.println("Select application to install on your Smartphone");
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
    Smartphone that = (Smartphone) o;
    return Double.compare(that.sizeOfDisplay, sizeOfDisplay) == 0
        && sizeOfRAM == that.sizeOfRAM && sizeOfMemory == that.sizeOfMemory
        && sizeOfBattery == that.sizeOfBattery && Double.compare(that.price, price) == 0
        && matrix == that.matrix && Objects.equals(screenResolution, that.screenResolution)
        && cpu == that.cpu && os == that.os;
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), sizeOfDisplay, matrix, screenResolution, cpu, os, sizeOfRAM,
            sizeOfMemory, sizeOfBattery, price);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Smartphone{");
    sb.append("brand=").append(brand);
    sb.append(", model='").append(model).append('\'');
    sb.append(", color=").append(color);
    sb.append(", releaseDate=").append(releaseDate);
    sb.append(", sizeOfDisplay=").append(sizeOfDisplay);
    sb.append(", matrix=").append(matrix);
    sb.append(", screenResolution='").append(screenResolution).append('\'');
    sb.append(", cpu=").append(cpu);
    sb.append(", os=").append(os);
    sb.append(", sizeOfRAM=").append(sizeOfRAM);
    sb.append(", sizeOfMemory=").append(sizeOfMemory);
    sb.append(", sizeOfBattery=").append(sizeOfBattery);
    sb.append(", price=").append(price);
    sb.append('}');
    return sb.toString();
  }
}
