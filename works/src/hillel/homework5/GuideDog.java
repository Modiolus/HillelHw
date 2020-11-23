package hillel.homework5;

public class GuideDog extends DomesticAnimal {
    private boolean isTrained;

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public void GuideDogVoice(String name) {
        super.name = name;
        System.out.println("my name is " + name + ". I can take you home.");
        System.out.println("Id: " + getId() + "; \nAge: " + getAge() + "; \nWeight: " + getWeight() + "; \nColor: " + getColor() +
                "; \nVaccinated: " + isVaccinated());
    }

}
