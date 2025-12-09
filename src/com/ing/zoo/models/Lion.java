package com.ing.zoo.models;
import com.ing.zoo.interfaces.Eat;
import com.ing.zoo.interfaces.Greeting;

public class Lion extends Animal implements Greeting, Eat {

    public Lion() {
    }

    @Override
    public void sayHello() {
        System.out.println("roooaoaaaaar");
    }

    @Override
    public void eatMeat()
    {
        System.out.println("nomnomnom thx mate");
    }

    @Override
    public void eatLeaves() {
    }
}
