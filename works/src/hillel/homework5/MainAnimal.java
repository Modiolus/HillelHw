package hillel.homework5;

public class MainAnimal {
    public static void main(String[] args) {
        SmallFish fish = new SmallFish();
        fish.setId(4);
        fish.setAge((byte) 1);
        fish.setWeight(0.2d);
        fish.setColor("Grey");
        fish.setVaccinated(false);
        fish.voice();
        fish.FishVoice();
        System.out.println("============================");

        Cat cat = new Cat();
        cat.setId(1);
        cat.setAge((byte) 3);
        cat.setWeight(3.5d);
        cat.setColor("White");
        cat.setVaccinated(true);
        cat.voice();
        cat.catVoice("Funtik");
        System.out.println("============================");

        Dog dog = new Dog();
        dog.setId(2);
        dog.setAge((byte) 4);
        dog.setWeight(4.5d);
        dog.setColor("Braun");
        dog.setVaccinated(true);
        dog.voice();
        dog.dogVoice("Bim");
        System.out.println("============================");

        Crocodile crocodile = new Crocodile();
        crocodile.setId(5);
        crocodile.setAge((byte) 3);
        crocodile.setWeight(250d);
        crocodile.setColor("Green");
        crocodile.setPredator(true);
        crocodile.voice();
        crocodile.wildVoice();
        crocodile.crocodileVoice();
        System.out.println("==============================");

        Wolf wolf = new Wolf();
        wolf.setId(6);
        wolf.setAge((byte) 4);
        wolf.setWeight(80d);
        wolf.setColor("Grey");
        wolf.setPredator(true);
        wolf.voice();
        wolf.wildVoice();
        wolf.wolfVoice();
        System.out.println("========================");

        Lion lion = new Lion();
        lion.setId(7);
        lion.setAge((byte) 5);
        lion.setWeight(170d);
        lion.setColor("Yellow");
        lion.setPredator(true);
        lion.voice();
        lion.wildVoice();
        lion.lionVoice();
        System.out.println("========================");

        Giraffe giraffe = new Giraffe();
        giraffe.setId(8);
        giraffe.setAge((byte) 6);
        giraffe.setWeight(800d);
        giraffe.setColor("Redhead");
        giraffe.voice();
        giraffe.wildVoice();
        giraffe.giraffeInfo();
        System.out.println("========================");

        Hamster hamster = new Hamster();
        hamster.setId(9);
        hamster.setAge((byte) 2);
        hamster.setWeight(0.025d);
        hamster.setColor("Yellow");
        hamster.voice();
        hamster.wildVoice();
        hamster.hamsterInfo();
        System.out.println("========================");

        GuideDog guideDog = new GuideDog();
        guideDog.setId(2);
        guideDog.setAge((byte) 4);
        guideDog.setWeight(4.5d);
        guideDog.setColor("Braun");
        guideDog.setVaccinated(true);
        guideDog.voice();
        guideDog.GuideDogVoice("Jack");
        guideDog.setTrained(true);
        System.out.println("Trained: " + guideDog.isTrained());

    }
}
