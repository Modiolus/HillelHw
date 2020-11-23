package hillel.homework5;

public class DomesticAnimal extends Animal {
    protected String name;

    protected boolean isVaccinated;

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
}
