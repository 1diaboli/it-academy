package com.javacourse.se.task4_5.smartdevices;

import com.javacourse.se.task4_5.enums.Brand;
import com.javacourse.se.task4_5.enums.CPU;
import com.javacourse.se.task4_5.enums.Matrix;
import com.javacourse.se.task4_5.enums.OS;
import com.javacourse.se.task4_5.smartinterface.Smart;
import java.awt.Color;
import java.util.Objects;

public class Smartwatch implements Smart {

  private Brand brand;
  private String model;
  private Color bodyColor;
  private OS os;
  private Matrix matrix;
  private CPU cpu;
  private int sizeOfDisplay;
  private int sizeOfRAM;
  private int sizeOfMemory;
  private int sizeOfBattery;
  private double price;

  public Smartwatch() {
  }

  public Smartwatch(Brand brand, String model, Color bodyColor, OS os,
      Matrix matrix, CPU cpu, int sizeOfDisplay, int sizeOfRAM, int sizeOfMemory, int sizeOfBattery,
      double price) {
    this.brand = brand;
    this.model = model;
    this.bodyColor = bodyColor;
    this.os = os;
    this.matrix = matrix;
    this.cpu = cpu;
    this.sizeOfDisplay = sizeOfDisplay;
    this.sizeOfRAM = sizeOfRAM;
    this.sizeOfMemory = sizeOfMemory;
    this.sizeOfBattery = sizeOfBattery;
    this.price = price;
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

  public class WatchBand {

    private Color color;
    private String typeOfBand;
    private String material;
    private double size;

    public WatchBand() {

    }

    public WatchBand(Color color, String typeOfBand, String material, double size) {
      this.color = color;
      this.typeOfBand = typeOfBand;
      this.material = material;
      this.size = size;
    }

    public Color getColor() {
      return color;
    }

    public String getTypeOfBand() {
      return typeOfBand;
    }

    public String getMaterial() {
      return material;
    }

    public double getSize() {
      return size;
    }
  }

  public class Sensor {

    private boolean accelerometer;
    private boolean gyroscope;
    private boolean lightSensor;
    private boolean barometer;
    private boolean pedometer;
    private boolean heartRateMonitor;
    private boolean sensorECG;
    private boolean sensorBloodOxygen;
    private boolean compass;

    public Sensor() {

    }

    public Sensor(boolean accelerometer, boolean gyroscope, boolean lightSensor, boolean barometer,
        boolean pedometer, boolean heartRateMonitor, boolean sensorECG, boolean sensorBloodOxygen,
        boolean compass) {
      this.accelerometer = accelerometer;
      this.gyroscope = gyroscope;
      this.lightSensor = lightSensor;
      this.barometer = barometer;
      this.pedometer = pedometer;
      this.heartRateMonitor = heartRateMonitor;
      this.sensorECG = sensorECG;
      this.sensorBloodOxygen = sensorBloodOxygen;
      this.compass = compass;
    }

    public boolean isAccelerometer() {
      return accelerometer;
    }

    public boolean isGyroscope() {
      return gyroscope;
    }

    public boolean isLightSensor() {
      return lightSensor;
    }

    public boolean isBarometer() {
      return barometer;
    }

    public boolean isPedometer() {
      return pedometer;
    }

    public boolean isHeartRateMonitor() {
      return heartRateMonitor;
    }

    public boolean isSensorECG() {
      return sensorECG;
    }

    public boolean isSensorBloodOxygen() {
      return sensorBloodOxygen;
    }

    public boolean isCompass() {
      return compass;
    }
  }

  @Override
  public double getPrice() {
    return this.price;
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
        && Double.compare(that.price, price) == 0 && brand == that.brand
        && Objects.equals(model, that.model) && Objects
        .equals(bodyColor, that.bodyColor) && os == that.os && matrix == that.matrix
        && cpu == that.cpu;
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(brand, model, bodyColor, os, matrix, cpu, sizeOfDisplay, sizeOfRAM, sizeOfMemory,
            sizeOfBattery, price);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Smartwatch{");
    sb.append("brand=").append(brand);
    sb.append(", model='").append(model).append('\'');
    sb.append(", bodyColor=").append(bodyColor);
    sb.append(", os=").append(os);
    sb.append(", matrix=").append(matrix);
    sb.append(", cpu=").append(cpu);
    sb.append(", sizeOfDisplay=").append(sizeOfDisplay);
    sb.append(", sizeOfRAM=").append(sizeOfRAM);
    sb.append(", sizeOfMemory=").append(sizeOfMemory);
    sb.append(", sizeOfBattery=").append(sizeOfBattery);
    sb.append(", price=").append(price);
    sb.append('}');
    return sb.toString();
  }
}
