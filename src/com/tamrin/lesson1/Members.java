package com.tamrin.lesson1;

public class Members {
    public static void main(String[] args) {
        /*int numbers[];
        numbers = new int[12];
        numbers[0]=1;
        numbers[2]=5;
        numbers[8]=25;
        System.out.println(numbers[8]);*/

        int numbers[] = {1, 2, 3, 10, 4, 8, 5, 12, 1, 117, 10, 43, 18, 27, 1, 31, 22, 10, 1, 14, 10, 1};
        int num = 1;
        int more = 0;
        for (int a : numbers) {
            if (a == num) {
                more++;
            }
        }
        if (more != 0) {
            System.out.println("true");
            System.out.println(more);
        } else {
            System.out.println("false");
        }
        /*System.out.println(numbers[0]);*/
    }
}
