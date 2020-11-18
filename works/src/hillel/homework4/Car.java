package hillel.homework4;

public class Car {
    double capacity;
    double fullTank;
    double reminder; // остаток в баке
    double fuelcons; // расход на 100 км
    double price;

    Car(double capacity, double reminder, double fuelcons) {
        this.capacity = capacity;
        this.reminder = reminder;
        this.fuelcons = fuelcons;
    }

    public double addTankMethod() {

        return fullTank = capacity - reminder;
    }

    public double OstatokMethod(double distance) { // остаток по преодолению distance километров
        return reminder = capacity - fuelcons * distance / 100;

    }

    public double zapravkaMethod(double distance) {

        return fuelcons * distance / 100;
    }
}
