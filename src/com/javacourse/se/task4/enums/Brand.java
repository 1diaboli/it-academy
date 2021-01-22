package com.javacourse.se.task4.enums;

public enum Brand {

  APPLE("Apple", "USA", 1976),
  ASUS("Asus", "Taiwan", 1989),
  HTC("HTC", "Taiwan", 1997),
  HUAWEI("Huawei", "China", 1987),
  LENOVO("Lenovo", "China", 1984),
  MEIZU("Meizu", "China", 2003),
  LG("LG", "South Korea", 1947),
  NOKIA("Nokia", "Finland", 1865),
  SAMSUNG("Samsung", "South Korea", 1938),
  SONY("Sony", "Japan", 1946),
  XIAOMI("Xiaomi", "China", 2010),
  ZTE("ZTE", "China", 1985),
  SIEMENS("Siemens", "Germany", 1847),
  PANASONIC("Panasonic", "Japan", 1918);

  private String name;
  private String countryOfBrand;
  private int yearOfFoundation;

  Brand(String name, String countryOfBrand, int yearOfFoundation) {
    this.name = name;
    this.countryOfBrand = countryOfBrand;
    this.yearOfFoundation = yearOfFoundation;
  }

  public String getName() {
    return name;
  }

  public String getCountryOfBrand() {
    return countryOfBrand;
  }

  public int getYearOfFoundation() {
    return yearOfFoundation;
  }

  @Override
  public String toString() {
    return "Brand{" +
        "name='" + name + '\'' +
        ", countryOfBrand='" + countryOfBrand + '\'' +
        ", yearOfFoundation=" + yearOfFoundation +
        '}';
  }
}
