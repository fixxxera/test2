package com.company;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("hello");
        list2.add("hello2");
        if (list.containsAll(list2)){
            System.out.println("Ima go");
        }else {
            System.out.println("Nqma go");
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        for (String each : list) {
            System.out.println(each);
        }

    }
}
