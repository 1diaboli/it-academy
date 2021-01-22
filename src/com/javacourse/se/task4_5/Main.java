package com.javacourse.se.task4;

import com.javacourse.se.task4.enums.Brand;
import com.javacourse.se.task4.enums.CPU;
import com.javacourse.se.task4.enums.Matrix;
import com.javacourse.se.task4.enums.OS;
import com.javacourse.se.task4.phones.Phone;
import com.javacourse.se.task4.smartdevices.SmartTV;
import com.javacourse.se.task4.smartdevices.Smartphone;
import com.javacourse.se.task4.smartdevices.Smartwatch;
import com.javacourse.se.task4.smartinterface.Smart;
import com.javacourse.se.task4.smartstore.Store;
import java.awt.Color;
import java.util.Calendar;
import com.javacourse.se.task4.phones.*;

public class Main {


  public static void main(String[] args) {
    Calendar calendarSmartphone1 = Calendar.getInstance();
    calendarSmartphone1.set(2019, Calendar.DECEMBER, 25);
    Calendar calendarSmartphone2 = Calendar.getInstance();
    calendarSmartphone2.set(2020, Calendar.OCTOBER, 19);
    Calendar calendarMobilephone = Calendar.getInstance();
    calendarMobilephone.set(2005, Calendar.JANUARY, 5);

    Phone smartphone1 = new Smartphone(Brand.HUAWEI, "P20", Color.CYAN,
        calendarSmartphone1, 6, Matrix.IPS, "1200x1080", CPU.EXYNOS_990, OS.ANDROID, 4000, 256, 50,
        5000, 700);
    Smart smartphone2 = new Smartphone();
    Smartphone smartphone3 = new Smartphone(Brand.APPLE, "IPhone 12", Color.BLACK,
        calendarSmartphone2, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15, 4000, 1500);
    Smartphone smartphone4 = new Smartphone(Brand.APPLE, "IPhone 13", Color.BLACK,
        calendarSmartphone2, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15, 4000, 1500);
    Smartphone smartphone5 = new Smartphone(Brand.APPLE, "IPhone 14", Color.BLACK,
        calendarSmartphone2, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15, 4000, 1500);
    Smartphone smartphone6 = new Smartphone(Brand.APPLE, "IPhone 15", Color.BLACK,
        calendarSmartphone2, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15, 4000, 1500);
    Smartphone smartphone7 = new Smartphone(Brand.APPLE, "IPhone 16", Color.BLACK,
        calendarSmartphone2, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15, 4000, 1500);
    Smartphone smartphone8 = new Smartphone(Brand.APPLE, "IPhone 17", Color.BLACK,
        calendarSmartphone2, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15, 4000, 1500);
    Smartphone smartphone9 = new Smartphone(Brand.APPLE, "IPhone 18", Color.BLACK,
        calendarSmartphone2, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15, 4000, 1500);
    Smartphone smartphone10 = new Smartphone(Brand.HUAWEI, "P20", Color.CYAN,
        calendarSmartphone1, 6, Matrix.IPS, "1200x1080", CPU.EXYNOS_990, OS.ANDROID, 4000, 256, 50,
        5000, 10000);

    Phone mobilephone1 = new Mobilephone();
    Mobilephone mobilephone2 = new Mobilephone();
//        (Brand.NOKIA, "3310", Color.BLUE, calendarMobilephone,
//        2.2, "500x400", false, false);
    Smart smartTV1 = new SmartTV();
    SmartTV smartTV2 = new SmartTV();
    Smart smartwatch1 = new Smartwatch(Brand.APPLE, "Watch 5", Color.white, Color.BLACK, "rubber",
        OS.WATCHOS, Matrix.RETINA, CPU.APPLE_A13, 4, 1024, 32, 2000, 500);
    Smartwatch smartwatch2 = new Smartwatch();

    smartphone1.call();
    smartphone1.answer();
    smartphone1.getReleaseDate();
    smartphone2.installApp();
    smartphone2.reinstallOS();
    smartphone3.makePhoto();
    smartphone3.openApp();
    smartphone3.getReleaseDate();
    mobilephone1.answer();
    mobilephone1.call();
    mobilephone2.sendSMS();
    mobilephone2.sendMMS();
    mobilephone2.getReleaseDate();
    smartTV1.installApp();
    smartTV1.reinstallOS();
    smartTV2.playVideo();
    smartwatch1.installApp();
    smartwatch1.reinstallOS();
    smartwatch2.checkPulse();
    smartwatch2.checkNumberOfSteps();

    Smartphone[] smartphones = new Smartphone[]{
        smartphone3,
        smartphone4,
        smartphone5,
        smartphone6,
        smartphone7,
        smartphone8,
        smartphone9
    };
    Store<Smartphone> products = new Store<>(smartphones);
    products.printProducts();
    products.setCash(10000);
    System.out.println(products.getProducts().toString());
//    System.out.println(products.purchase(1500));
//    products.printProducts();
//    System.out.println(products.purchase(1700));
//    products.printProducts();
//    System.out.println(products.purchase(1700));
//    products.printProducts();
//    System.out.println(products.purchase(1700));
//    products.printProducts();
    System.out.println(products.purchase(1700));
    products.printProducts();
    System.out.println(products.getCash());

    products.sell(smartphone10);
    System.out.println("--------");
    products.printProducts();

    System.out.println("--------");



  }

}