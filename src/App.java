import Animal.*;
import Dog.*;
import Fish.*;

public class App {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        Dog c = new Dog();
        Fish p = new Fish();
        a[0] = c;
        a[1] = p;
        for (Animal o : a) {
            o.eat();
        }
    }
}
