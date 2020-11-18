package hillel.homework4;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(70, 20, 8);

        car.price = 24.5;
        System.out.println("Залить до полного на Одесса - Киев: " + car.addTankMethod() + " л");
        double refuelingСost1 = car.addTankMethod() * car.price; // стоимость заправки до полного бака из Одессы до Киева
        System.out.println("Стоимость заправки: " + refuelingСost1 + " грн");

        car.OstatokMethod(200);
        System.out.println("Заправка в Кривом Озере: " + car.addTankMethod() + " л");
        double refuelingСost2 = car.addTankMethod() * car.price; // стоимость заправки до полного бака из Кривого Озера до Киева

        car.OstatokMethod(100);
        System.out.println("Запрвка в Жашкове: " + car.addTankMethod() + " л");
        double refuelingСost3 = car.addTankMethod() * car.price; // стоимость заправки до полного бака из Жашкова до Киева

        System.out.println("Стоимость полной поездки при трёх заправках: " + (refuelingСost1 + refuelingСost2 + refuelingСost3) + " грн");
        System.out.println("Остаток топлива по приезду в Киев: " + (car.capacity - car.zapravkaMethod(500)) + " л");

    }
}
