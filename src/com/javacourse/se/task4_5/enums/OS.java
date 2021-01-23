package com.javacourse.se.task4_5.enums;

public enum OS {

  IOS("iOS"),
  WATCHOS("Watch OS"),
  ANDROID("Android"),
  TIZEN("Tizen OS"),
  WEBOS("Webos"),
  ANDROIDWEAR("Android Wear"),
  PEBBLEOS("Pebble OS"),
  GARMINOS("Garmin OS"),
  LINUX("Linux");

  private String name;

  OS(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "OS{" +
        "name='" + name + '\'' +
        '}';
  }
}
