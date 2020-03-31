package task07;

import common.Cat;
import common.ColorsCat;

public class Loader
{
    public static void main(String[] args)
    {
        Cat Murzik = new Cat(); // Оригинал
        Murzik.setColour(ColorsCat.WHITE);
        System.out.println("Цвет: " + Murzik.getColour());
        Murzik.feed(+ 123.456 * Math.random());
        System.out.println("Масса съеденного корма: " + Murzik.eatenFood());
        System.out.println("Мурзик: " + Murzik.getStatus() + ", вес = " + Murzik.getWeight());

        System.out.println();
        Cat copyMurzik = Murzik.CopyCat(); // Копия
        System.out.println("Цвет копии: " + copyMurzik.getColour());
        System.out.println("Масса съеденного корма копии: " + copyMurzik.eatenFood());
        System.out.println("Копия Мурзика: " + copyMurzik.getStatus() + ", вес = " + copyMurzik.getWeight());
    }
}