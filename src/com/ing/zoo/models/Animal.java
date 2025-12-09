package com.ing.zoo.models;

import com.ing.zoo.interfaces.IEat;
import com.ing.zoo.interfaces.IGreeting;
import com.ing.zoo.interfaces.ITrick;

public class Animal implements IGreeting, IEat, ITrick{
    private String name;
    private String diet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void eatLeaves() {
    }

    @Override
    public void eatMeat() {
    }
    @Override
    public void performTrick() {
    }

    @Override
    public void eat() {}
}
