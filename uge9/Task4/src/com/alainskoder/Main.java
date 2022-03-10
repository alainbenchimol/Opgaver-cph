package com.alainskoder;
import java.util.*;
/*
- 4.a Write a method that takes in an integer as a parameter and prints all values between 0 and 100 that
are divisible by the parameter received.

- 4.b add the following array to your code:
int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }

- 4.c Write a method that returns a random element from the above array.

- 4.d Write a function that takes an integer as a parameter and prints the number. After that, it subtracts
one from the input and calls itself again (recursion). If the input is less than zero, it should no longer
 call itself.

- 4.e Write a function that takes two integers as parameters and prints both of them seperated by a
tab ( \t ). Then have the function calculate and print the fibunacci sequence by calling itself.
If the input is greater than 10000, then stop. Start the function by calling it from setup with the input
(1, 1). (hint: fibunacci sequence: https://i.pinimg.com/236x/98/82/d5/9882d569f7e0b5665fe3b2edd5069b06.jpg)

 */
public class Main
{

    static int[] array = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

    public static void main(String[] args)
    {
        //oneToHundred();
        //System.out.println(randomArr(array));
        //subtraction(10);
        fibunacci();
    }
    static void oneToHundred()
    {
        int oneHundred=0;
        for(int i=0;i<100;i++)
        {
            oneHundred++;
            System.out.print(oneHundred+" ");
        }
    }

    public static int randomArr(int[] arr)
    {
        Random rnd = new Random();
        int x = rnd.nextInt(21);
        return arr[x];
    }

    public static int subtraction(int s)
    {
        while (s>=0){
            System.out.println(s);
            s=s-1;
        }
        return s;
    }
    public static int fibunacci()
    {
        int n1 = 0, n2 = 1, n3 = 0, i, count = 21;

        System.out.print(n1 + " " + n2);//printing 0 and 1

            for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
            {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
            return i;
    }
}


