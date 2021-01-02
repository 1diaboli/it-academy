package com.javacourse.se.task1;


public class Car {

    public String brand;
    public String model;
    public int year;
    public String color;
    public String transmissionType;
    public int mileage;
    public double fuelConsumption;
    private int engineVolume;
    private String engineType;
    private boolean navi;
    private boolean climateControl;
    private boolean airBags;
    private int trunkVolume;
    private double length;
    private double weight;
    private int price;

    public Car() {
        brand = "BMW";
        model = "G20";
        year = 2018;
        color = "black";
        transmissionType = "auto";
        mileage = 25000;
    }

    public Car(String brand, String model, int year, String color, int engineVolume, String engineType, String transmissionType, boolean navi, boolean climateControl, boolean airBags, int trunkVolume, double length, double weight, int mileage, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineVolume = engineVolume;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
        this.navi = navi;
        this.climateControl = climateControl;
        this.airBags = airBags;
        this.trunkVolume = trunkVolume;
        this.length = length;
        this.weight = weight;
        this.mileage = mileage;
        this.price = price;
    }

    public void setEngineVolume(int engineVolume){
        this.engineVolume = engineVolume;
    }

    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    public void setNavi(boolean navi){
        this.navi = navi;
    }

    public void setClimateControl(boolean climateControl){
        this.climateControl = climateControl;
    }

    public void setAirBags(boolean airBags){
        this.airBags = airBags;
    }

    public void setTrunkVolume(int trunkVolume){
        this.trunkVolume = trunkVolume;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getEngineVolume(){
        System.out.print("Объем двигателя ");
        return engineVolume;
    }

    public String getEngineType(){
        System.out.print("Тип двигателя ");
        return engineType;
    }

    public boolean getNavi(){
        System.out.print("Наличие навигации ");
        return navi;
    }

    public boolean getClimateControl(){
        System.out.print("Наличие климат-контроля ");
        return climateControl;
    }

    public boolean getAirBags()
    {
        System.out.print("Наличие подушек безопасности ");
        return airBags;
    }

    public int getTrunkVolume(){
        System.out.print("Объем багажника ");
        return trunkVolume;
    }

    public double getLength(){
        System.out.print("Длина ");
        return length;
    }

    public double getWeight(){
        System.out.print("Вес ");
        return weight;
    }

    public int getPrice(){
        System.out.print("Цена ");
        return price;
    }




    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                ", engineType='" + engineType + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", navi=" + navi +
                ", climateControl=" + climateControl +
                ", airBags=" + airBags +
                ", trunkVolume=" + trunkVolume +
                ", length=" + length +
                ", weight=" + weight +
                ", mileage=" + mileage +
                ", price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
