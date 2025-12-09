package com.ing.zoo.models;

import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;

public class Hippo extends Animal implements IGreeting, IEat {

    public Hippo(String name) {
        super(name);
    }

//    @Override
//    public String getName() {
//        return "Elsa";
//    }

    public String getDiet() {
        return "herbivore";
    }

    @Override
    public void sayHello() { System.out.println(getName() + "the Hippo: " + "splash");}

    @Override
    public void eatLeaves() {System.out.println(getName() + "the Hippo: " + "munch munch lovely");}

    @Override
    public void eatMeat(){}
}
