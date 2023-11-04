package com.epam.mjc.stage0;

public class Bird extends Animal {

    int wings;

    public Bird() {
        super("blue", 2, false);

    }
    {
        wings =2;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Moreover, it has 2 wings and can fly.";
    }
}
