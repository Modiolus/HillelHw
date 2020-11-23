package hillel.homework5;

public class SmallFish extends DomesticAnimal {

    public void FishVoice() {
        super.name = name;
        System.out.println(" ....");
        System.out.println("Id: " + getId() + "; \nAge: " + getAge() + "; \nWeight: " + getWeight() + "; \nColor: " + getColor() +
                "; \nVaccinated: " + isVaccinated());
    }

}
