package com.company;

import java.util.Random;

public class Number {
    int numbers[] = new int[3];
    int weigths[] = new int[3];

    public Number(int[] num, int[] w){
        this.weigths = w;
        this.numbers = num;
    }

    public int randomGenerator(){
        int totalCases = 0;
        int currentSum = 0;
        int randomNumberFromArr = 0;
        Random rand = new Random();

        //calculate total weight
        for (int i = 0; i < weigths.length; i++) {
            totalCases += weigths[i];
        }

        //generate a random number from total weight
        int randomNum = rand.nextInt(totalCases + 1);

        //sum weights sequentially compare with randomNum and retrieve the index where randomNum
        //is less than or equal  current sum and exit from the loop
        for (int j = 0; j < weigths.length; j++) {
            currentSum += weigths[j];
            if(randomNum <= currentSum){
                randomNumberFromArr = numbers[j];
                break;
            }
        }
        return randomNumberFromArr;
    }
}
