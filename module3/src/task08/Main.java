package task08;
import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        airport.getAllAircrafts(); // Список самолетов в аэропорту
        System.out.println(airport.getAllAircrafts());

        System.out.println();

        airport.getTerminals(); // Количество (число) самолётов в аэропорту
        System.out.println(airport.getTerminals());

        System.out.println();

        System.out.println("В данный момент общее количество самолетов в " + airport.getTerminals().size() + " терминалах: " + airport.getAllAircrafts().size());
    }
}


