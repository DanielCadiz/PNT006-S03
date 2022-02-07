package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner appScanner1 = new Scanner(System.in);

        System.out.println("Input year to be checked if a leap year:");
        int year = appScanner1.nextInt();
        if (year % 4 == 0)
            if (year % 400 == 0)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is NOT a leap year.");
        else
            System.out.println(year + " is NOT a leap year");


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mickey", "Donald", "Goofy", "Minnie", "Daisy"));
        String search = "";
        Scanner appScanner2 = new Scanner(System.in);

        while (search.isBlank()) {
            System.out.println("Provide a string to filter current users:");
            System.out.println(names);
            search = appScanner2.nextLine().trim().toLowerCase();
            for (String name : names)
                if (name.toLowerCase().contains(search))
                    System.out.println(name);
        }
    }
}
