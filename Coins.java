public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(12368);
  }

  public static void coinConverter(int dinero)
  {
    int dollarBills = dinero/100;
    dinero %= 100;

    int quarters = dinero/25;
    dinero %= 25;

    int dimes = dinero/10;
    dinero %= 10;

    int nickels = dinero/10;
    dinero %= 5;

    System.out.println("Dollar Bills: " + dollarBills);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + dinero);
  }

}
