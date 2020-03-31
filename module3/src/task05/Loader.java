package task05;

import common.Cat;

public class Loader {
    public static void main(String[] args) {
        Cat Ivashka = new Cat(4321);
        System.out.println("Вес кота Ивашки: " + Ivashka.getWeight());
        System.out.println("Количество котов: " + Cat.getCount() + " шт.");

        Cat kitten = getKitten();
        System.out.println("Вес сгенерированного котенка: " + kitten.getWeight());
        System.out.println("Количество котов: " + Cat.getCount() + " шт.");
    }

    private static Cat getKitten() {
        double weight = 1100.00;
        Cat kitten = new Cat(weight);
        return kitten;
    }
}
