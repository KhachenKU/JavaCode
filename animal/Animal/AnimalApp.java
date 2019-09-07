package Animal;

import Comparator.Data;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Pond", 21);
        animals[1] = new Animal("Fluke", 16);
        animals[2] = new Animal("Hero", 18);
        animals[3] = new Animal("Iaun", 5);
        animals[4] = new Animal("Sob", 3);

        Data.sort(animals);

        for (Animal a : animals) {
            System.out.println(a.getName() + " " + a.getAge());
        }
    }
}
