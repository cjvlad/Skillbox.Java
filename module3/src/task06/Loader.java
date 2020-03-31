package task06;

import common.Cat;
import common.ColorsCat;

public class Loader
{
    public static void main(String[] args)
    {
        Cat Ivashka = new Cat ();
        Ivashka.setColour(ColorsCat.WHITE);
        System.out.println("Цвет кота Ивашки: " + Ivashka.getColour());
        System.out.println("Изначальный вес Ивашки: " + Ivashka.getWeight());

        System.out.println();

        Ivashka.drink(+ 999.999 * Math.random());
        System.out.println("Что стало с весом Ивашки после воды: " + Ivashka.getWeight());
        Ivashka.isAlive();
        Ivashka.hasTail();
        Ivashka.setColour(ColorsCat.REDHEAD);
        System.out.println("Что случилось с котом: " + Ivashka.getStatus());

        System.out.println();

        Ivashka.feed(+ 9999.999 * Math.random());
        System.out.println("Что стало с весом Ивашки после еды: " + Ivashka.getWeight());
        Ivashka.isAlive();
        Ivashka.hasTail();
        Ivashka.setColour(ColorsCat.REDHEAD);
        System.out.println("Что случилось с котом: " + Ivashka.getStatus());
    }
}
