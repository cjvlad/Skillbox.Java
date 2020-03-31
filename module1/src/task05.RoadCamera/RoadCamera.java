package task05.RoadCamera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera {
    public RoadCamera() {
    }

    public static void main(String[] args) throws IOException {
        int maxOncomingSpeed = 60;
        int speedFineGrade = 20;
        int finePerGrade = 1000;
        int criminalSpeed = 180;
        System.out.println("Введите скорость автомобиля:");
        int oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Вызов полиции...");
        } else if (oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штрафа: " + fine);
        } else {
            System.out.println("Скорость не превышена");
        }

    }
}
