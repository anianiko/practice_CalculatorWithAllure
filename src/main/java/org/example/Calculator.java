package org.example;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.Add(3,4));
    }


    public int Add (int a, int b) {
        return a + b;
    }
}

