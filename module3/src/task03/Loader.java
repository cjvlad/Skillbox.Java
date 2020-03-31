package task03;

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
        System.out.println("Чем занимается Пушок: " + Pushok.getStatus());
        System.out.println("Количество котов: " + Cat.getCount() + " шт.");
        System.out.println("====================");

        // Просто даем попить
        Cat Ivashka = new Cat();

        System.out.println("Изначальный вес Ивашки: " + Ivashka.getWeight());
        Ivashka.drink(+ 123.456 * Math.random());
        System.out.println("Что стало с весом Ивашки после воды: " + Ivashka.getWeight());
        System.out.println("Что случилось с котом: " + Ivashka.getStatus());
        System.out.println("Количество котов: " + Cat.getCount() + " шт.");
        System.out.println("====================");

        // Просто даем поесть
        Cat Tuzik = new Cat();
        System.out.println("Изначальный вес Тузика: " + Tuzik.getWeight());
        Tuzik.feed(+ 123.456 * Math.random());
        System.out.println("Что стало с весом Тузика после еды: " + Tuzik.getWeight());
        System.out.println("Что случилось с котом: " + Tuzik.getStatus());
        System.out.println("Количество котов: " + Cat.getCount() + " шт.");
        System.out.println("====================");

        // Перекормить (Циклом "Do/While")
        Cat Ryzhik = new Cat();
        System.out.println("Изначальный вес Рыжика: " + Ryzhik.getWeight());
        while (Ryzhik.getWeight() < 9000)
        {
            Ryzhik.feed(100 * Math.random());
        }
        System.out.println("Когда Рыжик скушал очень много: " + Ryzhik.getStatus());
        System.out.println("Количество котов: " + Cat.getCount() + " шт.");
        System.out.println("====================");

        // Замяукать (Циклом "While")
        Cat Pirozhok = new Cat();
        System.out.println("Изначальный вес Пирожка: " + Pirozhok.getWeight());
        while (!Pirozhok.getStatus().equals("Dead")) {
            Pirozhok.meow();
        }
        System.out.println("Что случилось с Пирожком: " + Pirozhok.getStatus());
        System.out.println("Что стало с весом Пирожка: " + Pirozhok.getWeight());
        System.out.println("Количество котов: " + Cat.getCount() + " шт.");
        System.out.println("====================");

        // Кот умер от недостатка веса, дадим поесть, попить, маукнуть и сходить в туалет
        System.out.println("Пытаемся покормить мертвого кота  ... ");
        Pirozhok.feed(1000.0); // Кормим мертвого кота
        System.out.println("Что случилось с Пирожком: " + Pirozhok.getStatus()); // Кот не воскреснет
        System.out.println("Что стало с весом Пирожка: " + Pirozhok.getWeight());

        System.out.println();

        System.out.println("Даём попить  ... ");
        Pirozhok.drink(1000.0); // Даём попить
        System.out.println("Что случилось с Пирожком: " + Pirozhok.getStatus()); // Кот не воскреснет
        System.out.println("Что стало с весом Пирожка: " + Pirozhok.getWeight());

        System.out.println();

        System.out.println("Отправляем в туалет ...");
        Pirozhok.pee(); // Отправляем в туалет
        System.out.println("Что случилось с Пирожком: " + Pirozhok.getStatus()); // Кот не воскреснет
        System.out.println("Что стало с весом Пирожка: " + Pirozhok.getWeight());

        System.out.println();

        System.out.println("Пробуем замяукать ... ");
        Pirozhok.meow(); // Кот мяукает
        System.out.println("Что случилось с Пирожком: " + Pirozhok.getStatus()); // Кот не воскреснет
        System.out.println("Что стало с весом Пирожка: " + Pirozhok.getWeight());
        System.out.println("Количество кошек: " + Cat.getCount());
    }
}
