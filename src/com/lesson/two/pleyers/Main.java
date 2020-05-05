package com.lesson.two.pleyers;

public class Main {
    public static void main(String[] args) {
        Players halfback = new Players();
        Players forward = new Players();
        forward.family = "vahid";
        Players.age = 32;
        System.out.println(Players.age);
        System.out.println(forward.family);
        System.out.println(halfback.name);
        /*
        halfback.name= "Khodadad";
        halfback.pass();



        forward.family= "Daei";



        System.out.println(halfback.name);

        System.out.println(forward.family);*/

        Overloading overloading = new Overloading();
        /*overloading.passin();*/
    }
}
