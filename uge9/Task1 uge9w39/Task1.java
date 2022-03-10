//package com.alainskoder;
import java.util.*;
/*
- 1.a Create an integer array with the values
{ 8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2 }

- 1.b implement your own sorting algorithm for the int[] array, by creating a method that takes in the
int[] array and loops through it with a for loop. for every step in the for loop, you must compare the
values of array[i] and array[i + 1] and swap them if [i] is greater than [i + 1].

1.c call the method created in 1.b in a while loop from setup(), until the list is sorted.

1.d Add a boolean to keep track of when the list is sorted to avoid creating an infinite loop.
*/
class Task1{

    public static void main(String[] args)
    {
        int[] array={8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int temp;
        for (int i = 1; i < array.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (array[j] < array [j - 1])
                {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
