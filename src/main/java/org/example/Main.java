package org.example;

import td.TestData;

public class Main extends TestData {
    public static void main(String[] args) {

        TestData td = new TestData();

        System.out.println(td.setFirstName());
        System.out.println(td.setLastName());
        System.out.println(td.setFullName());
        System.out.println(td.setAddress());

        System.out.println(td.setPasword());
        System.out.println(td.setEmail());


    }
}