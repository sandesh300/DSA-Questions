// 7. Write a function that finds the factorial of a given number.

public class FactorialNumber
{
    public static int findFactorial(int no)
    {
        if (no == 0 || no == 1) {
            return 1;
        }
        else
        {
      return no * findFactorial(no-1);
        }
    }

   public static void main(String[] args) {
    int num  = 5;
    System.out.println(findFactorial(num));
   }
}
