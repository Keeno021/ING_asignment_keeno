package com.ing.zoo.models;

import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;

public class Zebra extends Animal implements IGreeting, IEat {

    public Zebra(String name) {
        super(name);
    }

//    @Override
//    public String getName() {
//        return "Marty";
//    }

    @Override
    public String getDiet() {
        return "herbivore";
    }

    @Override
    public void sayHello() {
        System.out.println(getName() + " the Zebra: " + "zebra zebra");
    }

    public void eatLeaves() {
        System.out.println(getName() + " the Zebra: " + "munch munch zank yee bra");
    }

    @Override
    public void eatMeat() {}
}
