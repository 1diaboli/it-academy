package com.javacourse.se.task4;

public interface Smart {

  void installApp();

  default void getOS() {
    System.out.println("You have an operation system");
  }
}
