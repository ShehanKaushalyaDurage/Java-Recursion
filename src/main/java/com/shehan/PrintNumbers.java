package com.shehan;

public class PrintNumbers {

    static void printNumbers(int n) {
        if(n == 0){
            System.out.println("return");
            return;
        }
        printNumbers(n - 1); // recursive call
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
