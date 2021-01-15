package com.javacourse.se.task4;

import java.util.Date;

public class Mobilephone extends Phone {

  private int sizeOfDisplay;
  private int screenResolution;
  private boolean camera;
  private boolean colorDisplay;

  public Mobilephone() {
  }



  public void sendSMS() {
    System.out.println("Type a text and then send a message");
  }

  public void sendMMS() {
    System.out.println("Choose a picture for send");
  }



  @Override
  public void call() {
    System.out.println("You call from Mobilephone");
  }

  @Override
  public void answer() {
    System.out.println("Hello, you call me on mobilephone");
  }


}
