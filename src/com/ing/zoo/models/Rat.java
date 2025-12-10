package com.ing.zoo.models;

import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;

import java.util.Random;

public class Rat extends Animal implements IGreeting, IEat {
    public Rat(String name) {
        super(name);
    }


//    @Override
//    public String getName() {
//        return "Spencer";
//    }

    public String getDiet() {
        return "omnivore";
    }

    @Override
    public void sayHello() { System.out.println(getName() + " the Rat: " + "squeeeksqueek");}

    @Override
    public void eatLeaves() {System.out.println(getName() + " the Rat: " + "seeds seeds seeds lovely");}

    @Override
    public void eatMeat(){System.out.println(getName() + " the Rat: " + "nom nom nom");}

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick;

        if(rnd == 0) {
            trick = "search for cheese";
        }
        else {
            trick = "turn in circles";
        }
        System.out.println(trick);
    }

}
