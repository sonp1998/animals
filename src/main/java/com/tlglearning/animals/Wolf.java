package com.tlglearning.animals;

public class Wolf {

  //fields
  private static final int MY_CONSTANT = initializeValue();

  private int data = initializeData();

  static {
    System.out.println("Wolf static initialization block");
  }

  {
    System.out.println("Wolf instance initialization block");
  }

  //constructors
  public Wolf() {
    System.out.println("Wolf constructor");
  }

  //method
  private static int initializeValue() {
    System.out.println("Wolf.initializeValue");
    return -1;
  }

  private int initializeData() {
    System.out.println("Wolf.initializeData");
    return 1;
  }

  public void vocalize() {
    System.out.println("Howl like a wolf");
  }

  public void hunt() {
    System.out.println("Hunt in packs for live prey");
  }

  public static void whoAmI() {
    System.out.println("I am a wolf");
  }
}
