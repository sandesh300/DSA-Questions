// 1. Write a function that checks if a given number is a multiple of both 3 and 5.

public class CheckMultiple
{
 public static boolean isMultipleThreeOrFive(int no)
 {
   return no%3==0 && no%5==0;
 }

    public static void main(String[] args) {
    int no = 10;
    if(isMultipleThreeOrFive(no))
    {
      System.out.println("Number is multiple to 3 and 5");
    }
    else{
       System.out.println("Number is not multiple to 3 and 5");
    }
    }
} 