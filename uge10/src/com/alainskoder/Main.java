//Torsdagsopgave5

package com.alainskoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;//enkelte ord i teksten

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/alainskoder/data.txt");
        scan = new Scanner(file);
        String inputFromFile = "";
        while (scan.hasNextLine())// checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();// adds each line to the inputFromFile string.
        }
        text = inputFromFile.split(" |\\ ");//Creates and array of strings, where each element is a single word from the file.

        System.out.println(text.length);
        //printWordsStartingWith("Ø");
        //printWordsOfLength(3);

        //test dine metoder ved at kalde dem her:
        printLongestWord();
        //printFirstHalfOfEachWord();
        //String f = new String("src/com/alainskoder/data.txt");
        //System.out.println("Max occurring character is: "+printMostFrequentLetter(f));
    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;
        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }
                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }


    //skriv dine metoder herunder:
    /*
Task 1:
Create a method called printLongestWord() that prints the longest of all the words in the text variable.
Hints:
Have it loop through each word in the text variable (see implementation of the two methods mentioned above
for reference).
Have a counter that counts the length of each word and resets afterwards.
Have a String variable called "longestWord", that has its value overwritten in case of a longer word found.
printWordsWithLessThanTwoVocals();
 */
    private static String printLongestWord() throws FileNotFoundException {
        /*String longest_temp = "";
        for (String s : text) {
            if (s.length() > longest_temp.length()) {
                longest_temp = s;
            }
        }
        System.out.println(longest_temp);
        return longest_temp;*/

        File file = new File("src/com/alainskoder/data.txt");
        scan = new Scanner(file);
        String longestWord = "";
        String current;
        while (scan.hasNext()){
            current = scan.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        System.out.println(longestWord);
        return longestWord;
    }

    /*
    Task2
    Create a method called printFirstHalfOfEachWord() that uses substring to print the first half
    of all words in the text variable.
    Hints: Use the .substring() method along with the s.length
     */
    private static String printFirstHalfOfEachWord() throws FileNotFoundException {
            File file = new File("src/com/alainskoder/data.txt");
            scan = new Scanner(file);
            String halfWord = "";
            String current;

            while (scan.hasNext()) {
                current = scan.next();
                halfWord = current.substring(0,current.length()/2);
                System.out.println(halfWord);
            }
            return halfWord;
    }
    /*
    Task 3:
Create a method called printMostFrequentLetter() that prints the most frequent found letter in the text variable.
The method must print both the actual letter as well as the times it occurred.
Bonus for printing a top 10.
    */

    // Driver Method
    // Java program to output the maximum occurring character in a string

    public static char printMostFrequentLetter(String str) {
        // Create array to keep the count of individual characters and initialize the array as 0
        int count[] = new int[8212];

        // Construct character count array from the input string.
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;  //Initialize max count
        int sum = 0;
        char result = ' ';   //Initialize result

        // Traversing through the string and maintaining the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
            sum += max;
        }
        System.out.println("Number of times occurring: " +sum);
        return result;
    }
}




