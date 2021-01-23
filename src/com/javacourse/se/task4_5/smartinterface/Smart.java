package com.javacourse.se.task4_5.smartinterface;

public interface Smart {

  void installApp();

  default void reinstallOS() {
    System.out.println("Insert BOOT Disk to install");
  }

  double getPrice();
}
