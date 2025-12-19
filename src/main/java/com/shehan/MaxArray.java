package com.shehan;

public class MaxArray {
    static int max(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxOfRest = max(arr, index + 1);
        return Math.max(arr[index], maxOfRest);
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println(max(arr, 0));
    }
}
