package com.javacourse.se.task4_5;

import com.javacourse.se.task4_5.enums.Brand;
import com.javacourse.se.task4_5.enums.CPU;
import com.javacourse.se.task4_5.enums.Matrix;
import com.javacourse.se.task4_5.enums.OS;
import com.javacourse.se.task4_5.phones.Phone;
import com.javacourse.se.task4_5.smartdevices.SmartTV;
import com.javacourse.se.task4_5.smartdevices.Smartphone;
import com.javacourse.se.task4_5.smartdevices.Smartphone.MainCamera;
import com.javacourse.se.task4_5.smartdevices.Smartwatch;
import com.javacourse.se.task4_5.smartinterface.Smart;
import com.javacourse.se.task4_5.smartstore.Store;
import java.awt.Color;
import java.util.Calendar;
import com.javacourse.se.task4_5.phones.*;

public class Main {


  public static void main(String[] args) {
    Calendar calendarSmartphone1 = Calendar.getInstance();
    calendarSmartphone1.set(2019, Calendar.DECEMBER, 25);
    Calendar calendarSmartphone2 = Calendar.getInstance();
    calendarSmartphone2.set(2020, Calendar.OCTOBER, 19);
    Calendar calendarMobilephone = Calendar.getInstance();
    calendarMobilephone.set(2005, Calendar.JANUARY, 5);

    Phone smartphone1 = new Smartphone(Brand.HUAWEI, "P20", Color.CYAN,
        calendarSmartphone1, 6, Matrix.IPS, "1200x1080", CPU.EXYNOS_990, OS.ANDROID, 4000, 256,
        5000, 700);
    Smart smartphone2 = new Smartphone();

    Smartphone smartphone3 = new Smartphone(Brand.APPLE, "IPhone 12", Color.BLACK,
        calendarSmartphone2, 6.1, Matrix.OLED, "1170x2532", CPU.APPLE_A14, OS.IOS, 4096, 256, 4000,
        1500);
    Smartphone.MainCamera mainCamera3 = smartphone3.new MainCamera("Ultra wide angle", true, true,
        12, true, true, "f/1.6");
    Smartphone.FrontCamera frontCamera3 = smartphone3.new FrontCamera(true, 12, true, "f/2.2");

    Smartphone smartphone4 = new Smartphone(Brand.APPLE, "IPhone 12", Color.RED,
        calendarSmartphone2, 6.1, Matrix.OLED, "1170x2532", CPU.APPLE_A14, OS.IOS, 4096, 128,
        4000, 1500);
    Smartphone smartphone5 = new Smartphone(Brand.APPLE, "IPhone 11", Color.RED,
        calendarSmartphone2, 6.1, Matrix.IPS, "828x1792", CPU.APPLE_A13, OS.IOS, 4096, 64,
        14000, 1000);
    Smartphone smartphone6 = new Smartphone(Brand.APPLE, "IPhone 11", Color.BLACK,
        calendarSmartphone2, 6.1, Matrix.IPS, "828x1792", CPU.APPLE_A13, OS.IOS, 4096, 128,
        4000, 1000);
    Smartphone smartphone7 = new Smartphone(Brand.APPLE, "IPhone 11", Color.YELLOW,
        calendarSmartphone2, 6.1, Matrix.IPS, "828x1792", CPU.APPLE_A13, OS.IOS, 4096, 256,
        4000, 1000);

    Smartphone smartphone8 = new Smartphone(Brand.HUAWEI, "P20", Color.BLACK,
        calendarSmartphone1, 5.8, Matrix.IPS, "1080x2244", CPU.KIRIN_980, OS.ANDROID, 4096, 128,
        3400, 400);
    Smartphone smartphone9 = new Smartphone(Brand.HUAWEI, "P40 Pro", Color.BLUE,
        calendarSmartphone2, 6.58, Matrix.OLED, "1200x2640", CPU.KIRIN_990, OS.ANDROID, 8192, 256,
        4200, 1000);
    Smartphone smartphone10 = new Smartphone(Brand.SAMSUNG, "Galaxy S20", Color.WHITE,
        calendarSmartphone2, 6.9, Matrix.AMOLED, "1440x3200", CPU.EXYNOS_990, OS.ANDROID, 12288,
        128,
        5000, 1200);
    Smartphone smartphone11 = new Smartphone(Brand.SAMSUNG, "Galaxy S21", Color.BLUE,
        calendarSmartphone2, 6.2, Matrix.OLED, "1080x2400", CPU.EXYNOS_2100, OS.IOS, 8192, 256,
        4000, 1400);

    Phone mobilephone1 = new Mobilephone();
    Mobilephone mobilephone2 = new Mobilephone(Brand.NOKIA, "3310", Color.BLUE, calendarMobilephone,
        2.2, "500x400", false, false, 200);

    Smart smartTV1 = new SmartTV();
    SmartTV smartTV2 = new SmartTV();
    SmartTV.InputOutputPort inputOutputPort = smartTV2.new InputOutputPort(true, true, true, true,
        false, false, true, true, true, false);

    Smart smartwatch1 = new Smartwatch(Brand.APPLE, "Watch 5", Color.white, OS.WATCHOS,
        Matrix.RETINA, CPU.APPLE_A13, 4, 1024, 32, 2000, 500);
    Smartwatch smartwatch2 = new Smartwatch(Brand.APPLE, "Watch 6", Color.BLACK, OS.WATCHOS,
        Matrix.RETINA, CPU.APPLE_A14, 5, 1024, 64, 2500, 600);
    Smartwatch.WatchBand watchBand2 = smartwatch2.new WatchBand(Color.BLACK, "Sport", "rubber", 20);
    Smartwatch.Sensor sensor2 = smartwatch2.new Sensor(true, true, true, true, true, true, true,
        true, true);

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
        (Smartphone) smartphone1,
        (Smartphone) smartphone2,
        smartphone3,
        smartphone4,
        smartphone5,
        smartphone6,
        smartphone7,
        smartphone8,
        smartphone9,
        smartphone10,
        smartphone11,
    };

    Store<Smartphone> products = new Store<>(smartphones);
    products.printProducts();
//    products.setCash(10000);
    System.out.println(products.purchase());
    products.printProducts();
    System.out.println(products.purchase());
    products.printProducts();
    System.out.println(products.purchase());
    products.printProducts();
    System.out.println(products.purchase());
    products.printProducts();
    System.out.println(products.purchase());
    products.printProducts();
    System.out.println(products.getCash());

    products.sell(smartphone10);
    products.printProducts();
    products.sell(smartphone4);
    products.printProducts();
    products.sell(smartphone6);
    products.printProducts();
    System.out.println(products.getCash());


  }

}
