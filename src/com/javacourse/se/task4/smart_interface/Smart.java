package com.javacourse.se.task4.smart_interface;

public interface Smart {

  void installApp();

  default void reinstallOS() {
    System.out.println("Insert BOOT Disk to install");
  }
}
