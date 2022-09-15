package com.tlglearning.animals;
//subclass
public class Dog extends Wolf{
//control + o to override these methods (inherited)... delete the super.hunt(); if not invoking the inherited behaviors.
  @Override
  public void vocalize() {
    System.out.println("Bark like a dog");
  }
  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }
  //static method can't be overridden...
  public static void whoAmI() {
    System.out.println("I am a dog");
  }
  public void rollOver() {
    System.out.println("I'm rolling over! I'm the best dog!");
  }

}
