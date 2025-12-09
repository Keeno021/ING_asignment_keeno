package com.ing.zoo.models;

import com.ing.zoo.interfaces.Greeting;

import java.util.Random;

public class Pig extends Animal implements Greeting {
    public String helloText;
    public String eatText;
    public String trick;

    public Pig() {
    }

    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

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
