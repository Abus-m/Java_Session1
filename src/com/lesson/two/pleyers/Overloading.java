package com.lesson.two.pleyers;

public class Overloading {
    public void passin(int x, int y) {
        System.out.println("go to " + x + y);
    }

    public void passin(int x, int y, int z) {
        System.out.println("go to three " + x + y + z);
    }

    public void passin(String a, String b, String c) {
        System.out.println(a +" "+ b +" "+ c);

    }
}
