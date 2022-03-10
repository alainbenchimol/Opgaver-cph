package com.alainskoder;

public class Main //Person i stedet for Main
{
    public static void main(String[] args)
    {
        System.out.println("Hallo World!");
        Person alain=new Person("Alain","Benchimol","123456-1234");//Person i stedet for Main
        System.out.println("Hej"+" "+alain.getFullName()+", cpr "+alain.getCpr());
    }

}
