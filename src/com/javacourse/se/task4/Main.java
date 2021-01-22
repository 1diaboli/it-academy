package com.javacourse.se.task4;

import com.javacourse.se.task4.enums.Brand;
import com.javacourse.se.task4.enums.CPU;
import com.javacourse.se.task4.enums.Matrix;
import com.javacourse.se.task4.enums.OS;
import java.awt.Color;

public class Main {

  public static void main(String[] args) {

//    Phone smartPhone1 = new Smartphone();
//    smartPhone1.answer();
//    smartPhone1.call();
//
//    System.out.println();
//
//    Phone mobilePhone = new Mobilephone();
//    mobilePhone.answer();
//    mobilePhone.call();
//
//    System.out.println();
//
//    Smart smartPhone2 = new Smartphone();
//    smartPhone2.installApp();
//    smartPhone2.getOS();
//
//    System.out.println();
//
//    Smart smartTV = new SmartTV();
//    smartTV.installApp();
//    smartTV.getOS();
//
//    System.out.println();
//
//    Smart smartWatch = new Smartwatch();
//    smartWatch.installApp();
//    smartWatch.getOS();
//
//    System.out.println();

    SmartTV smartTV1 = new SmartTV(Brand.SAMSUNG, "SADas", Color.BLACK, Matrix.IPS, 13, OS.WEBOS, CPU.APPLE_A9,123,true);
    System.out.println(smartTV1.toString());




  }

}
