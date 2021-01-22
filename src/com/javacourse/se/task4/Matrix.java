package com.javacourse.se.task4;

public enum Matrix {

  LCD("LCD"),
  TN_FILM("TN+FILM"),
  IPS("IPS"),
  TFT_LCD("TFT LCD"),
  OLED("OLED"),
  PMOLED("PMOLED"),
  AMOLED("AMOLED"),
  RETINA("RETINA"),
  SUPER_RETINA("SUPER RETINA"),
  QLED("QLED");

  private String name;

  Matrix(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Matrix{" +
        "name='" + name + '\'' +
        '}';
  }
}
