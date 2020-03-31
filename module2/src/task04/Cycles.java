package task04;

public class Cycles {
    public static void main(String[] args) {
        printWithForCycle(200000, 210001);
        printWithForCycle(220000, 235001);

        printWithWhileCycle(200000, 210001);
        printWithWhileCycle(220000, 235001);
    }


    private static void printWithForCycle(int startValue, int endValue)
    {
        for (int ticket = startValue; ticket < endValue; ticket++)
        {
            System.out.println("Билет №: " + ticket + " - сгенерирован циклом 'For'");
        }
    }


    private static void printWithWhileCycle(int startValue, int endValue)
    {
        int ticket = startValue;
        while (ticket != endValue)
        {
            System.out.println("Билет №: " + ticket + " - сгенерирован циклом 'While'");
            ticket++;
        }
    }


}