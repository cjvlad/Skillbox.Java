package common;

public class Cat
{
    private double originWeight;
    private double weight;
    private double feed; // Урок 2. Метод, параметры, return
    private double foodAmount; // Урок 2. Метод, параметры, return
    private static int count; // Урок 3. Статические методы и переменные
    private boolean catIsLive = true; // Урок 3. Статические методы и переменные
    public static final double MIN_WEIGHT_COUNT = 1000.0; // Урок 4. Константы и Enum
    public static final double MAX_WEIGHT_COUNT = 9000.0; // Урок 4. Константы и Enum
    public static final int EYES_NUMBER_COUNT = 2; // Урок 4. Константы и Enum
    private ColorsCat colour;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        foodAmount = 0.0;
        count++;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT_COUNT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT_COUNT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // Урок 2. Метод, параметры, return
    public Double getWeight()
    {
        return weight;
    }

    public double eatenFood() { return foodAmount; }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // Урок 3. Статические методы и переменные
    public static int getCount() {
        return count;
    }

    public void meow() {
        if (catIsLive) {
            weight = weight - 1;
            //System.out.println("Meow");
            checkLifeCat(weight);
        }
    }

    public void feed(Double amount) {
        if (catIsLive) {
            foodAmount += amount;
            weight = weight + amount;
            checkLifeCat(weight);
        }
    }

    public void drink(Double amount) {
        if (catIsLive) {
            foodAmount += amount;
            weight = weight + amount;
            checkLifeCat(weight);
        }
    }

    public void pee() {
        if (catIsLive) {
            weight -= 0.05 * weight;
            System.out.println("Toilet");
            checkLifeCat(weight);
        }
    }

    private void checkLifeCat(Double weightCatNow) {
        if (weightCatNow > MAX_WEIGHT_COUNT || weightCatNow < MIN_WEIGHT_COUNT) {
            ifDead();
        }
    }

    private void ifDead() {
        // Вызывается в Условии что кошка жива, Если без условия то может умирать несколько раз
        // Условие не прописывается здесь, чтобы не допустить кормления или мяуканься умершей кошки
        count -= 1;
        catIsLive = false;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // Урок 4. Константы и Enum
    public int getEyesNumberCount() {
        return EYES_NUMBER_COUNT;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // Урок 5. Создание объектов и конструктор (Создаем метод, чтобы вес передавал в конструктор в классе Loader)
    public Cat(double weight) {
        this.weight = weight;
        this.originWeight = weight;
        count++;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // Урок 6. Инкапсуляция, геттеры и сеттеры
    public void setColour(ColorsCat colour) {
        this.colour = colour;
    }

    public ColorsCat getColour() {
        return colour;
    }

    public boolean isAlive() {
        if (weight >= MIN_WEIGHT_COUNT && weight <= MAX_WEIGHT_COUNT) {
            // System.out.println("Кот всё еще живой!");
            return true;
        }
        else {
            System.out.println("Кот умер!");
            return false;
        }
    }

    public boolean hasTail() {
        if (weight >= MIN_WEIGHT_COUNT && weight <= MAX_WEIGHT_COUNT) {
            System.out.println("У кота хвост на месте! ");
            return true;
        } else {
            System.out.println("Хвост отвалился! ");
            return false;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // Создали метод у кота для создания его “глубокой” копии
    // Урок 7. Копирование объектов
    public Cat CopyCat() {
        Cat copy = new Cat();
        copy.weight = this.weight;
        copy.foodAmount = this.foodAmount;
        copy.colour = this.colour;
        return copy;
    }
}