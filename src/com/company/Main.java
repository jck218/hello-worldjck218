package com.company;

import java.util.Random;
public class Main {

    public static int getRandomInRange(int start, int end) {
        Random generator = new Random();
        return (start + generator.nextInt(end - start + 1));
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            int random = getRandomInRange(1, 5);
            System.out.print(random + " ");
        }


    }

}