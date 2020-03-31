package task03;

public class Booleans {

  public static void main(String[] args)
  {
    int milkAmount = 1000; // ml
    int powderAmount = 400; // g
    int eggsCount = 5; // items
    int sugarAmount = 10; // g
    int oilAmount = 30; // ml
    int appleCount = 3;
    boolean cookAnything = false;

    if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30){
      //powder - 400, sugar - 10, milk - 1, oil - 30
      System.out.println("Pancakes");
      cookAnything = true;


    }
    if(milkAmount >= 300  && powderAmount >= 5 && eggsCount >= 5){
      //milk - 300, powder - 5, eggs - 5
      System.out.println("Omelette");
      cookAnything= true;
    }
    if(appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4){
      //apples - 3, milk - 100, powder - 300, eggs - 4
      System.out.println("Apple pie");
      cookAnything = true;
    }

  }
}


