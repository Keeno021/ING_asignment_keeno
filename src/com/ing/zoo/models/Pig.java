package com.ing.zoo.models;

import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;
import com.ing.zoo.interfaces.ITrick;

import java.util.Random;

public class Pig extends Animal implements IGreeting, IEat, ITrick {
    public String trick;

    public Pig(String name) {
        super(name);
    }


//    @Override
//    public String getName() {
//        return "Dora";
//    }

    @Override
    public String getDiet() {
        return "omnivore";
    }

    @Override
    public void sayHello() {
        System.out.println(getName() + "the Pig: "+ "splash");
    }

    @Override
    public void eatLeaves() {
        System.out.println(getName() + "the Pig: "+ "munch munch oink");
    }

    @Override
    public void eatMeat() {
        System.out.println(getName() + "the Pig: " + "nomnomnom oink thx");
    }

    @Override
    public void eat() {
        eatLeaves();
        eatMeat();
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
