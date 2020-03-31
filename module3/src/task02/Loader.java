package task02;

import common.Cat;

public class Loader
{
    public static void main(String[] args)
    {
        Cat Ivashka = new Cat();
        System.out.println("Изначальный вес Ивашки: " + Ivashka.getWeight());

        // Метод, который возвращает сумму съеденной еды текущей кошки
        Ivashka.feed(150.0);
        System.out.println("Вес Ивашки после принятия пищи: " + Ivashka.getWeight());

        // Значение съеденного корма
        System.out.println("Масса съеденного корма: " + Ivashka.eatenFood());

        // Метод “сходить в туалет” pee(), который будет уменьшать вес кошки.
        Ivashka.pee();
        System.out.println("Кот сходил в туалет и стал весом: " + Ivashka.getWeight());
        Ivashka.pee();
        System.out.println("Кот сходил в туалет и стал весом: " + Ivashka.getWeight());

    }
}