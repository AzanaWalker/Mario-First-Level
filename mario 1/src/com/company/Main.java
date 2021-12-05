package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int pin;
        pin = kb.nextInt();
        int pins[] = new int [pin];
        for (int i = 0; i < pins.length + 1; i++) {

            for(int j = 0; j < i + 1; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
