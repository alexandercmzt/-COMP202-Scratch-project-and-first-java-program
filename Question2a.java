import java.util.Scanner;

public class Question2a
{
  public static void main(String[] args)
  {
    System.out.println("Hal: How many laws of predictions are there according to Arthur C. Clarke?" ); //display question
    
    Scanner sc = new Scanner(System.in); //ask for input
    
    String NumberOfLaws = sc.next();
    
    if (NumberOfLaws.equals("one"))
    {
      System.out.println("Hal: There is indeed one law of prediction" ); //this is for grammar eg. "is" and "law"
    }
    else 
    {
      System.out.println("Hal: There are indeed " + NumberOfLaws + " laws of prediction" );
    }
  } 
}