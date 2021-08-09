package com.sksoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in a number between 1 and 5 (1-5) : ");

        String readline = scanner.nextLine();

        int value = Integer.parseInt(readline);

        switch (value){
            case 1:
                System.out.println(value + " entspricht -> \"Sehr gut\"");
                break;
            case 2:
                System.out.println(value + " entspricht -> \"Gut\"");
                break;
            case 3:
                System.out.println(value + " entspricht -> \"Befriedigend\"");
                break;
            case 4:
                System.out.println(value + " entspricht -> \"Genügend\"");
                break;
            case 5:
                System.out.println(value + " entspricht -> \"Nicht Genügend\"");
                break;
            default:
                System.out.println("Bitte einen ganzahligen Wert zwischen 1 und 5 eingeben!");
        }
    }
}



