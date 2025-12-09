package com.ing.zoo;

import com.ing.zoo.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Hippo());
        animals.add(new Lion());
        animals.add(new Pig());
        animals.add(new Tiger());
        animals.add(new Zebra());

        String[] commands = {"hello", "give leaves", "give meat", "perform trick", "give both"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert command: ");
        String input = scanner.nextLine();

        if (input.equals(commands[0])) {
            // hello
            for (Animal a : animals) {
                a.sayHello();
            }

        } else if (input.startsWith("hello ")) {
            // hello + name of animal(Elsa, Henk, Dora, Wally, Marty)
            String name = input.substring(6).toLowerCase();

            animals.stream()
                    .filter(a -> a.getName().equalsIgnoreCase(name))
                    .findFirst()
                    .ifPresentOrElse(
                            Animal::sayHello,
                            () -> System.out.println("No animal found with name: " + name)
                    );

        } else if (input.equals(commands[1])) {
            // give leaves
            animals.stream()
                    .filter(a -> "herbivore".equals(a.getDiet()))
                    .forEach(Animal::eatLeaves);

        } else if (input.equals(commands[2])) {
            // give meat
            animals.stream()
                    .filter(a -> "carnivore".equals(a.getDiet()))
                    .forEach(Animal::eatMeat);

        } else if (input.equals(commands[3])) {
            // perform trick
            animals.forEach(Animal::performTrick);

        } else if(input.equals(commands[4])) {
            animals.stream()
                    .filter(a -> "omnivore".equals(a.getDiet()))
                    .forEach(Animal::eat);
        }
        else {
            System.out.println("Unknown command" + input);
        }
    }
}
