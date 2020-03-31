package task06.roadcontroller.core;

public class Car {
    private String number; // Переменная типа String
    private int height; // Переменная типа int
    private double weight; // Переменная типа double
    private boolean hasVehicle; // Переменная типа boolean
    private boolean isSpecial; // Переменная типа boolean

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }
    public boolean isHasVehicle() {
        return hasVehicle;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }
    public boolean isSpecial() {
        return isSpecial;
    }


    public String toString() {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : ""; // Переменная типа String
        return "\n=========================================\n" +
                special + "Автомобиль с номером " + number +
                ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }

}