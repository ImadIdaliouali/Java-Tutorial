package Fish;

import Animal.*;

public class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("fish eat");
    }

    @Override
    public void sleep() {
        System.out.println("fish sleep");
    }

    public void swim() {
        System.out.println("fish swim");
    }
}
