package com.ing.zoo.models;

import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;
import com.ing.zoo.interfaces.ITrick;

import java.util.Random;

public class Tiger extends Animal implements IGreeting, IEat, ITrick {
    public String trick;

    public Tiger() {
    }

    @Override
    public String getName() {
        return "Wally";
    }

   @Override
    public String getDiet() {
        return "carnivore";
    }

    @Override
    public void sayHello() {
        System.out.println(getName() + "the Tiger: " +"rraaarwwss");
    }


    @Override
    public void eatMeat() {

        System.out.println(getName() + "the Tiger: " + "nomnomnom oink wubalubadubdub");
    }

    @Override
    public void eatLeaves() {}

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
