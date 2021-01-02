package com.javacourse.se.task2;


public class House {

    private String street;
    private int houseNumber;
    private int houseYear;
    private int houseMonth;
    private String houseMaterial;
    private boolean electricity;
    private boolean gas;
    private boolean water;
    private double length;
    private double width;
    private double height;

    public House(){

    }

    public House(String street, int houseNumber, int houseYear, int houseMonth, String houseMaterial, boolean electricity, boolean gas, boolean water, double length, double width, double height){
        this.street = street;
        this.houseNumber = houseNumber;
        this.houseYear = houseYear;
        this.houseMonth = houseMonth;
        this.houseMaterial = houseMaterial;
        this.electricity = electricity;
        this.gas = gas;
        this.water = water;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getHouseYear() {
        return houseYear;
    }

    public void setHouseYear(int houseYear) {
        this.houseYear = houseYear;
    }

    public int getHouseMonth() {
        return houseMonth;
    }

    public void setHouseMonth(int houseMonth) {
        this.houseMonth = houseMonth;
    }

    public String getHouseMaterial() {
        return houseMaterial;
    }

    public void setHouseMaterial(String houseMaterial) {
        this.houseMaterial = houseMaterial;
    }

    public boolean isElectricity() {
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //  расчитывает площадь дома
    public double getSquareHouse(){
        return length * width;
    }

    //  расчитывает объем дома
    public double getVolumeHouse(){
        return length * width * height;
    }

    //  выводит адрес
    public void getAddressHouse(){
        System.out.println("Адрес дома: ул. " + street + ", д. " + houseNumber);
    }

    //  четная/нечетная сторона улицы
    public void evenOddNumber(){
        if (houseNumber%2 == 0){
            System.out.println("Четная сторона");
        } else{
            System.out.println("Нечетная сторона");
        }
    }

    //  проверяет вместятся ли два дома на одном участке
    public void capacity(Area area, House house){
        if (getSquareHouse() + house.getSquareHouse() <= area.getSquareArea()){
            System.out.println("Дома поместятся");
        } else{
            System.out.println("Дома не поместятся");
        }
    }

    //  выводит сезон и год постройки дома
    public void date(){
        switch (getHouseMonth()){
            case 12:
            case 1:
            case 2:
                System.out.println("Дом построен зимой " + getHouseYear() + "г.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Дом построен весной " + getHouseYear() + "г.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Дом построен летом " + getHouseYear() + "г.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Дом построен осенью " + getHouseYear() + "г.");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }

    //  проверяет какие есть коммуникации в доме
    public void communications(){
        if (electricity && gas && water){
            System.out.println("К дому проведены все необходимые коммуникации");
        } else if (!electricity && gas && water){
            System.out.println("В доме нет электричества");
        } else if (!electricity && !gas && water){
            System.out.println("В доме нет электричества и газа");
        } else if (!electricity && gas && !water){
            System.out.println("В доме нет электричества и воды");
        } else if (electricity && gas && !water){
            System.out.println("В доме нет воды");
        } else if(electricity && !gas && water){
            System.out.println("В доме нет газа");
        } else if (electricity && !gas && !water){
            System.out.println("В доме нет газа и воды");
        }
        else System.out.println("В доме нет никаких коммуникаций");
    }

    //  проверяет дом старше 10 лет или нет
    public String age(){
        return houseYear <= 2010 ? "Дом старше 10 лет" : "Дом младше 10 лет";
    }




}
