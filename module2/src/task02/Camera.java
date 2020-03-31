package task02;

public class Camera
{
    public static Car getNextCar()
    {
        String randomNumber = Double.toString(Math.random()).substring(2, 5); // Переменная типа String
        int randomHeight = (int) (1000 + 3500. * Math.random()); //Переменная типа int
        double randomWeight = 600 + 10000 * Math.random(); //Переменная типа double

        Car car = new Car();
        car.number = randomNumber; //Переменная типа String
        car.height = randomHeight; //Переменная типа
        car.weight = randomWeight; //Переменная типа double
        car.hasVehicle = Math.random() > 0.5; //Переменная типа boolean
        car.isSpecial = Math.random() < 0.15; //Переменная типа boolean

        return car;
    }
}