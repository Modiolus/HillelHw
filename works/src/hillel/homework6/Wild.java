package hillel.homework6;

import hillel.homework6.interfaces.Predator;
import hillel.homework6.interfaces.Voice;

public class Wild extends Animal implements Voice, Predator {
    @Override
    public boolean isPredator() {
        return false;
    }

    @Override
    public void sayHello() {
        System.out.print("Hello i am a wild animal");
        if (isPredator()) {
            System.out.println(" and i am angry");
        }
    }
}
