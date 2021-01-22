package com.javacourse.se.task4.smartinterface;

public interface Smart {

  double getPrice();

  void installApp();

  default void reinstallOS() {
    System.out.println("Insert BOOT Disk to install");
  }
}
