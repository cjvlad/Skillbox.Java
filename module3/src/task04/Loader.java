package task04;

import common.Cat;
import common.ColorsCat;

public class Loader {
    public static void main(String[] args)
    {
        Cat Ivashka = new Cat();
        System.out.println("Изначальный вес Ивашки: " + Ivashka.getWeight());
        Ivashka.setColour(ColorsCat.REDHEAD);
        System.out.println("Цвет кота: " + Ivashka.getColour());
        System.out.println("Кол-во глаз: " + Ivashka.getEyesNumberCount());
    }
}
