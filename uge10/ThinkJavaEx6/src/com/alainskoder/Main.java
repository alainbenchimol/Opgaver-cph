package com.alainskoder;

public class Main {

    public static void main(String[] args) {
        isDivisible(4,2);
        isTriangle(3,4,4);
    }
    public static boolean isDivisible(int n,int m){
        if(n%m==0) {
            System.out.println("Is divisible");
            return true;
        }else{
            System.out.println("Is not divisible");
            return false;
        }
    }
    public static boolean isTriangle(int a,int b, int c){
        if(a+b>c&&a<b+c&&b<c+a) {
            System.out.println("Is triangle");
            return true;
        }else{
            System.out.println("Is not triangle");
            return false;
        }
    }
}
