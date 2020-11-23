package hillel.homework5;

public class Wolf extends WildAnimal {

    public void wolfVoice() {
        System.out.println("and i am angry");
        System.out.println("Id: " + getId() + "; \nAge: " + getAge() + "; \nWeight: " + getWeight() + "; \nColor: " + getColor() + "; \nPredator: "
                + isPredator());
    }
}
