/*
For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size.
But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a
parameter would not have a fixed length.

4.a create arrays of the following type and assign it at least 3 different values:

    - Integer array

    - String array

    - boolean array

V V4.b Write a function that takes in an array of strings as parameter and prints each string.

V 4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in
the array.

V 4.d Write a function that receives an integer array as a parameter and returns the average value.

V 4.e Consider how you could write a function that takes in an integer array as a parameter and returns the
array sorted from lowest to highest value.
 */
import java.util.Arrays;

class TaskFour
{

    public static void main(String[] args)
    {

        //Print string car names
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int j=cars.length-1;
        for(int i=0;i<=j;i++)
        {
            System.out.println(cars[i]);
        }

        //Print numbers
        int[] num = {1,2,3,4};
        int k=0;
        int l=num.length-1;
        for(k=0;k<=l;k++)
        {
            System.out.println(num[k]);
        }

        //Sum
        int[] numB = new int[4];
        for (int i = 0; i < numB.length; i++) numB[i] = i;
        int sum = 0;
        for (int e : numB) sum += e;
        System.out.println(sum);

        //Gennemsnit/Average
        int[] numA = new int[4];
        for (int i = 0; i < numA.length; i++) numA[i] = i;
        int sumA = 0;
        for (double e : numA) sumA += e;
        System.out.println((double) sumA/numA.length);

        //Sort array
        int[] arr = { 13, 7, 69, 45, 21, 9, 1010, 102 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // java boolean array default value is false
        boolean array[];
        array = new boolean[4];
        array[0] = true;
        array[1] = false;
        array[2] = false;
        array[3] = false;
        for(int m=0; m<array.length;m++)
        {
            System.out.println("boolean array element at : "+ m + " " + array[m]);
        }
    }
}
