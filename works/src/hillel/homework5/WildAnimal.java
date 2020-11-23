package hillel.homework5;

public class WildAnimal extends Animal {

    protected boolean isPredator;


    public void wildVoice () {
        System.out.print("I am a wild animal ");
    }
    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
