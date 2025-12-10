package com.ing.zoo.models;

import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;

public class Shark extends Animal implements IGreeting, IEat {
    public Shark(String name) {
        super(name);
    }


//    @Override
//    public String getName() {
//        return "Carl";
//    }

    public String getDiet() {
        return "carnivore";
    }

    @Override
    public void sayHello() { System.out.println(getName() + " the Shark: " + "swoooshs");}

    @Override
    public void eatLeaves() {}

    @Override
    public void eatMeat(){
        System.out.println(getName() + " the Shark: " + "swallow swallow");
    }
}
