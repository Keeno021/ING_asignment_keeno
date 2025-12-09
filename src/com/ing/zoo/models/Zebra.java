package com.ing.zoo.models;

import com.ing.zoo.interfaces.Greeting;

public class Zebra extends Animal implements Greeting {
    public String eatText;
    public String trick;

    public Zebra() {
    }

    public void sayHello() {
        System.out.println("zebra zebra");
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
