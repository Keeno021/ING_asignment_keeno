package com.ing.zoo;

import com.ing.zoo.models.*;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.setName("henk");
        henk.setDiet("carnivore");

        Hippo elsa = new Hippo();
        elsa.setName("henk");
        elsa.setDiet("herbivore");

        Pig dora = new Pig();
        dora.setName("dora");
        dora.setDiet("carnivore");
        dora.setDiet("herbivore");

        Tiger wally = new Tiger();
        wally.setName("wally");
        wally.setDiet("carnivore");

        Zebra marty = new Zebra();
        marty.setName("marty");
        marty.setDiet("herbivore");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        if(input.equals(commands[0] ))
        {
            henk.sayHello();
            elsa.sayHello();
            dora.sayHello();
            wally.sayHello();
            marty.sayHello();
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
