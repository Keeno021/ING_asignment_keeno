package com.ing.zoo.models;
import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;

public class Lion extends Animal implements IGreeting, IEat {

    public Lion() {
    }

    @Override
    public String getName() {
        return "Henk";
    }

    public String getDiet() {
        return "carnivore";
    }

    @Override
    public void sayHello() {
        System.out.println(getName() + " the Lion: " + "roooaoaaaaars");
    }

    @Override
    public void eatMeat()
    {
        System.out.println(getName() + " the Lion " +"nomnomnom thx mate");
    }

    @Override
    public void eatLeaves() {
    }
}
