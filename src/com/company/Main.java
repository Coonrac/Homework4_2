package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a[] = new int[]{7, 0, 6, -1, 8, 10};
        System.out.printf(Arrays.toString(a) + "\n\n");
        for (int k = 0; k < a.length/2; k++) {
            int temp = a[k];
            a[k] = a[a.length-(1+k)];
            a[a.length-(1+k)] = temp;
            System.out.printf(Arrays.toString(a) +"\n");
        }
        System.out.printf("\n" + Arrays.toString(a) + "\n");
    }
}