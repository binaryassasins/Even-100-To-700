/**
 * @author Mohamad Syafiq Asyraf Bin Bharudin
 * @title Displaying all even numbers between 100 to 700 and displaying the sum of even numbers between those two values
 */
public class Even100To700 
{
  public static void main(String[] args) 
  {
    int sum = 0;

    System.out.println("Even numbers between 100 to 700 are:\n");
    
    // Initally i will store 100 as its value, then it will check either the value is less than or equal to 700 
    for (int i = 100; i <= 700; i++)
    {
      if (i%2 == 0) // if i is even no, then display it on console
      {
        System.out.print(+i + " "); // displayed on console
        sum += i; // this is similar to sum = sum + 1
      } // after this block was executed, i will be increased by 1
    }
    
    System.out.println(); // create a newline
    System.out.println("\nSum of even numbers between 100 to 700: " + sum);
  }
}
/*
  1. ALTERNATIVE (USING WHILE CONTROL STRUCTURE)

  int sum = 0, i = 100;

  while (i <= 700)
  {
    if (i%2 == 0) // if i is even no, then display it on console 
    {
      System.out.print(+i + " "); // displayed on console
      sum += i; // this is similar to sum = sum + 1 
    }

    i += 1; // if i is not an even number, then increase i by 1 [100 + 1] and check with the condition again
  }

  System.out.println(); // create a newline
  System.out.println("\nSum of even numbers between 100 and 700: " + sum);

  2. ALTERNATIVE (USING DO-WHILE CONTROL STRUCTURE)

  int sum = 0, i = 100;

  do
  {
    if (i%2 == 0) // if i is even no, then display it on console 
    {
      System.out.print(+i + " "); // displayed on console
      sum += i; // this is similar to sum = sum + 1 
    }

    i += 1; // if i is not an even number, then increase i by 1 [100 + 1] and check with the condition again
  } while (i <= 700)

  System.out.println(); // create a newline
  System.out.println("\nSum of even numbers between 100 and 700: " + sum);
*/