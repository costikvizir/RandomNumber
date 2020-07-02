package com.company;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3};
        int weigths[] = {1, 1, 1};

        Number num = new Number(numbers, weigths);

        System.out.println(num.randomGenerator());

    }
}
