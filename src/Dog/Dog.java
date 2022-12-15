package Dog;

import Animal.*;

public class Dog extends Animal {
    private String name;

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep");
    }

    public void play() {
        System.out.println("dog play");
    }
}
