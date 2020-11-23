package hillel.homework5;

public class Dog extends DomesticAnimal {

    public void dogVoice(String name) {
        super.name = name;
        System.out.println("my name is " + name + ". Woof.");
        System.out.println("Id: " + getId() + "; \nAge: " + getAge() + "; \nWeight: " + getWeight() + "; \nColor: " + getColor() +
                "; \nVaccinated: " + isVaccinated());
    }

}
