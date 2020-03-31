package task03;

public class Ages {
    public static void main  (String [] args) {

        int vasyaAge = 20;
        int katyaAge = 18;
        int mishaAge = 26;

        int min = -1;
        int middle = -1;
        int max = -1;

        if(vasyaAge > katyaAge) {
            min = katyaAge;
            max = vasyaAge;
        }
        else {
            min = vasyaAge;
            max = katyaAge;
        }

        if (mishaAge > max) {
            middle = max;
            max = mishaAge;
        }
        else if (mishaAge < min) {
            middle = min;
            min = mishaAge;
        }
        else
            middle = mishaAge;

        System.out.println("Минимальный возраст: " + min);
        System.out.println("Средний возраст: " + middle);
        System.out.println("Максимальный возраст: " + max);

    }





}
