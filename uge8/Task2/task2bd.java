    /*
V 2.b Write a function that receives to integers as parameters and returns the sum of them.

V 2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()".
Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )

V 2.d Write a function that receives a string and returns true if the first letter of the string is uppercase.
 (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
     */

    public class Task2bd
{
    public static void main(String[] args)
    {
        sum();
        upper();
        firstUpper();
    }
    static void sum()
    {
        int a=7;
        int b=3;
        int sum=a+b;
        System.out.println(sum);
    }
    static void upper()
    {
         String t= "Hej!";
         System.out.println(t);
         System.out.println(t.toUpperCase());
    }
    static void firstUpper()
    {
        String u="Hallo!";
        System.out.println(u.charAt(0));
        System.out.println(Character.isUpperCase(u.charAt(0)));
    }
}
