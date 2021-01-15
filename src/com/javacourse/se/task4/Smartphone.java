package com.javacourse.se.task4;

import java.awt.Color;
import java.util.Date;

public class Smartphone extends Phone implements Smart {

  private int sizeOfDisplay;
  private Matrix matrix;
  private int screenResolution;
  private int sizeOfRAM;
  private int sizeOfMemory;
  private CPU cpu;
  private String modelOfCPU;
  private int sizeOfBattery;
  private int cameraResolution;

  public Smartphone() {
  }




  public void openApp() {
    System.out.println("Select application to open");
  }

  public void makePhoto() {
    System.out.println("Press on this button to make a photo");
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

  @Override
  public void getOS() {
    System.out.println("Your OS is Android or iOS");
  }


}
