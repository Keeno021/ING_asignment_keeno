package com.ing.zoo.models;

import com.ing.zoo.interfaces.Greeting;

public class Animal implements Greeting {
    private String name;
    private String diet;

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

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
}
