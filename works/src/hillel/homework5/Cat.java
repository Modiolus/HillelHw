package hillel.homework5;

public class Cat extends DomesticAnimal {

    public void catVoice(String name) {
        super.name = name;
        System.out.println("my name is " + name + ". Meow.");
        System.out.println("Id: " + getId() + "; \nAge: " + getAge() + "; \nWeight: " + getWeight() + "; \nColor: " + getColor() +
                "; \nVaccinated: " + isVaccinated());

    }

}
