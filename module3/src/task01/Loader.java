package task01;

import common.Cat;

public class Loader
{
    public static void main(String[] args)
    {
        // Просто даем мяукнуть
        Cat Pushok = new Cat();
        System.out.println("Изначальный вес Пушка: " + Pushok.getWeight());
        Pushok.meow();
        System.out.println("Вес Пушка после мяуканья: " + Pushok.getWeight());
        System.out.println("Что случилось с котом: " + Pushok.getStatus());
        System.out.println("====================");

        // Просто даем попить
        Cat Ivashka = new Cat();
        System.out.println("Изначальный вес Ивашки: " + Ivashka.getWeight());
        Ivashka.drink(+ 123.456 * Math.random());
        System.out.println("Что стало с весом Ивашки после воды: " + Ivashka.getWeight());
        System.out.println("Что случилось с котом: " + Ivashka.getStatus());
        System.out.println("====================");

        // Просто даем поесть
        Cat Tuzik = new Cat();
        System.out.println("Изначальный вес Тузика: " + Tuzik.getWeight());
        Tuzik.feed(+ 123.456 * Math.random());
        System.out.println("Что стало с весом Тузика после еды: " + Tuzik.getWeight());
        System.out.println("Что случилось с котом: " + Tuzik.getStatus());
        System.out.println("====================");

        // Перекормить (Циклом "Do/While")
        Cat Ryzhik = new Cat();
        System.out.println("Изначальный вес Рыжика: " + Ryzhik.getWeight());
        do {
            Ryzhik.feed(Math.random());
        }
        while (Ryzhik.getStatus() != "Exploded");
        System.out.println("Что стало с весом Рыжиком после еды: " + Ryzhik.getWeight());
        System.out.println("Когда Рыжик скушал очень много: " + Ryzhik.getStatus());
        System.out.println("====================");

        // Замяукать (Циклом "While")
        Cat Pirozhok = new Cat();
        System.out.println("Изначальный вес Пирожка: " + Pirozhok.getWeight());
        while (!Pirozhok.getStatus().equals("Dead")) {
            Pirozhok.meow();
        }
        System.out.println("Что стало с весом Пирожка после мауканья: " + Pirozhok.getWeight());
        System.out.println("Что случилось с Пирожком: " + Pirozhok.getStatus());
    }
}