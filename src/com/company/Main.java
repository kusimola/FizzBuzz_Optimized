package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Scrie un an");
        Scanner scannerOne = new Scanner(System.in);
        int yourNumber = scannerOne.nextInt();


        if (yourNumber % 3 == 0){
            System.out.print("FIZZ");
        }
        if (yourNumber % 5 == 0){
            System.out.print("BUZZ");
        }
        if(!(yourNumber % 3 == 0 && yourNumber % 5 == 0)){
            System.out.println(yourNumber);
        }


    }
}
