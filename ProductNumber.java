// 4. Write a function that finds the product of all numbers from 1 to a given number. 

public class ProductNumber {
        public static long calculateProduct(int no)
        {
            if(no < 0)
            {
                System.out.println("Number is negative");
                return 0;
            }
            else if(no == 0)
            {
                return 1;  //product of numbers from 1 to 0 is 1
            }else{
                long product = 1;
                for(int i=1; i<=no; i++)
                {
                    product = product * i;
                }
                return product;
            }
        }
    public static void main(String[] args) {
        int no = 5;
        long product = calculateProduct(no);

        if(product != -1)
        {
            System.out.println("producta of numbers from 1 to "+no+" is ="+product);
        }
    }
}
