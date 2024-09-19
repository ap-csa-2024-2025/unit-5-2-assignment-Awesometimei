public class Clock
{
  public static void main(String[] args)
  {
    timeOfDay(0);
    timeOfDay(12);
    timeOfDay(18);
    timeOfDay(1);
    timeOfDay(13);
    timeOfDay(19);
  }

public static void timeOfDay(int hour)
{
  if (hour == 0)
  {
    System.out.println("It is midnight");
  }
  else if (hour > 0 && hour < 12)
  {
    System.out.println("It is the morning");
  }
  else if (hour == 12)
  {
    System.out.println("It is noon");
  }
  else if (hour > 12 && hour < 18)
  {
    System.out.println("It is the afternoon");
  }
  else if (hour == 18)
  {
    System.out.println("It is dusk");
  }
  else if (hour > 18 && hour < 24)
  {
    System.out.println("It is the evening");
  }
}
}
