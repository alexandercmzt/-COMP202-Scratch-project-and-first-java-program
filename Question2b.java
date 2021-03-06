import java.util.Scanner;

public class Question2b
{
  public static void main(String[] args)
  {
    System.out.println("Hal: How many laws of predictions are there according to Arthur C. Clarke?" ); //display question
    
    Scanner sc = new Scanner(System.in); //ask for input
    
    String NumberOfLaws = sc.next();
    
    String numberlaws = NumberOfLaws.toLowerCase(); //so that Three is not incorrect due to case sensitivity
      
    if (numberlaws.equals ("three"))
    {
      System.out.println("Hal: There are indeed three laws of prediction" ); 
    }
    else if (NumberOfLaws.equals ("3"))
    {
      System.out.println("Hal: There are indeed three laws of prediction" ); 
    }
    else 
    {
      System.out.println("Hal: That is incorrect. There are 3 laws of prediction, which are the following:" );
      System.out.println("1. When a distinguished but elderly scientist states that something is possible, he is almost certainly right. When he states that something is impossible, he is very probably wrong." );
      System.out.println("2. The only way of discovering the limits of the possible is to venture a little way past them into the impossible." );
      System.out.println("3. Any sufficiently advanced technology is indistinguishable from magic." );
    }
  } 
}