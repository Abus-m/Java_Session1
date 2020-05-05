package com.tamrin.lesson1;

public class Max_number {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 10, 4, 8, 5, 12, 1, 117, 10, 43, 18, 27, 1, 31, 22, 10, 1, 14, 10, 1};
        int b=0;
        for (int a : numbers){
            if (b < a){
                b = a;
            }
        }
        System.out.println(b);
    }
}
