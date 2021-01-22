package com.javacourse.se.task4.enums;

public enum CPU {

  SNAPDRAGON_865("SNAPDRAGON 865"),
  SNAPDRAGON_865_PLUS("SNAPDRAGON 865 Plus"),
  SNAPDRAGON_855("SNAPDRAGON 855"),
  SNAPDRAGON_855_PLUS("SNAPDRAGON 855 Plus"),
  APPLE_A13("APPLE A13"),
  APPLE_A12("APPLE A12"),
  APPLE_A11("APPLE A11"),
  APPLE_A10("APPLE A10"),
  APPLE_A9("APPLE A9"),
  APPLE_A8("APPLE A8"),
  EXYNOS_990("EXYNOS 990"),
  EXYNOS_9820("EXYNOS 9820"),
  EXYNOS_9825("EXYNOS 9825"),
  KIRIN_990("KIRIN 990"),
  KIRIN_980("KIRIN 980"),
  KIRIN_985("KIRIN 985");

  private String name;

  CPU(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "CPU{" +
        "name='" + name + '\'' +
        '}';
  }
}
