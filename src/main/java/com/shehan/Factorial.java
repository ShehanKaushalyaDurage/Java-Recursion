package com.shehan;

public class Factorial {
    //5! = 5 × 4 × 3 × 2 × 1

    static int factorial(int n){
        if( n == 0 ){ // base case
            return 1;
        }
        return n * factorial(n-1); // recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
