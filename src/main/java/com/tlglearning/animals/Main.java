package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //creating instance (instance type is ArrayList, which is being created)
    List<Wolf> wolves = new ArrayList<>();
    //creating dogs and wolves and inputting them in list.
    //can crete Dog because Dog IS-A wolf (extends)
    //List is an ordered Collection. 1.2.3.4... unless we deliberately change it.
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    //shuffling list so order is different (random)
    Collections.shuffle(wolves);
    // for loop... declaration of local variable ReferenceType + variableName : what we are iterating over
    // read it as : for each Wolf, in the list wolves, refer in turn as each as w... do the code in {}
    for (Wolf w : wolves) {
      System.out.println();
      System.out.println(w.getClass().getSimpleName());
      //invoke the methods
      w.hunt();
      w.vocalize();
      if (w instanceof Dog) {
        Dog d = (Dog) w;
        d.rollOver();
      }
    }
  }

}
