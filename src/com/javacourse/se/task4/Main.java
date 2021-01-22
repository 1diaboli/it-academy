package com.javacourse.se.task4;

import com.javacourse.se.task4.enums.Brand;
import com.javacourse.se.task4.enums.CPU;
import com.javacourse.se.task4.enums.Matrix;
import com.javacourse.se.task4.enums.OS;
import com.javacourse.se.task4.smart_interface.Smart;
import java.awt.Color;
import java.util.Calendar;

public class Main {


  public static void main(String[] args) {
    Calendar calendarSmartphone1 = Calendar.getInstance();
    calendarSmartphone1.set(2019, Calendar.DECEMBER, 25);
    Calendar calendarSmartphone2 = Calendar.getInstance();
    calendarSmartphone2.set(2020, Calendar.OCTOBER, 19);
    Calendar calendarMobilephone = Calendar.getInstance();
    calendarMobilephone.set(2005, Calendar.JANUARY, 5);

    Phone smartphone1 = new Smartphone(Brand.HUAWEI, "P20", Color.CYAN, calendarSmartphone1, 500, 6,
        Matrix.IPS, "1200x1080", CPU.EXYNOS_990, OS.ANDROID, 4000, 256, 50, 5000);
    Smart smartphone2 = new Smartphone();
    Smartphone smartphone3 = new Smartphone(Brand.APPLE, "IPhone 12", Color.BLACK,
        calendarSmartphone2, 1200, 5.5, Matrix.OLED, "2500x1900", CPU.APPLE_A12, OS.IOS, 2048, 128,
        15,
        3000);
    Phone mobilephone1 = new Mobilephone();
    Mobilephone mobilephone2 = new Mobilephone(Brand.NOKIA, "3310", Color.BLUE, calendarMobilephone,
        200, 2.2, "500x400", false, false);
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


  }

}
