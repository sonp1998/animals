package com.tlglearning.animals;

//subclass
public class Dog extends Wolf {

  private static final int MY_CONSTANT = initializeValue();

  private int data = initializeData();
  //static initialization block


  static {
    System.out.println("Dog initialization block");
  }

  {
    System.out.println("Dog instance initialization block");
  }

  {
    System.out.println("Second Dog initialization block");
  }

  //constructor
  public Dog() {
    System.out.println("Dog constructor");
  }

  //methods
  private static int initializeValue() {
    System.out.println("Dog.initializeValue");
    return -2;
  }

  //static method can't be overridden...
  public static void whoAmI() {
    System.out.println("I am a dog");
  }

  private int initializeData() {
    System.out.println("Dog.initializeData");
    return 2;
  }

  //control + o to override these methods (inherited)... delete the super.hunt(); if not invoking the inherited behaviors.
  @Override
  public void vocalize() {
    System.out.println("Bark like a dog");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }

  public void rollOver() {
    System.out.println("I'm rolling over! I'm the best dog!");
  }

}
//for initializers, order can matter