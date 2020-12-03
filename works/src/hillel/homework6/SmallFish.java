package hillel.homework6;

import hillel.homework6.interfaces.Voice;

public class SmallFish extends Animal implements Voice {
    @Override
    public void sayHello() {
        System.out.println("Hello, .....");
    }
}
