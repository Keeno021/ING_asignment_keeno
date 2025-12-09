package com.ing.zoo.models;

import com.ing.zoo.interfaces.Eat;
import com.ing.zoo.interfaces.Greeting;

public class Hippo extends Animal implements Greeting, Eat {

    public Hippo() {
    }

    @Override
    public void sayHello() { System.out.println("splash");}

    @Override
    public void eatLeaves() {System.out.println("munch munch lovely");}

    @Override
    public void eatMeat(){}
}
