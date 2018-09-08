package com.kheiron;

import java.util.Scanner;

public class MyScanner {

    Scanner scanner;

    public MyScanner () {
        scanner = new Scanner (System.in);
    }

    public void MyScannerClose () {
        scanner.close ();
        System.out.println ("\nHave a great day.\nScanner has been closed");
    }

    public Integer MyScannerHamburgerOrder (int maximum) {
        int readingInput;

        while (true) {
            if (scanner.hasNextInt ()) {
                    readingInput = scanner.nextInt ();
                    scanner.nextLine ();
                if (readingInput > 0 && readingInput <= maximum) {
                    return readingInput;
                } else {
                    System.out.println ("Please enter a number in the range of 1 and " + maximum);
                }
            } else {
                    System.out.println ("Please insert a number");
                    scanner.nextLine ();
        }
        }
    }
    public Integer MyScannerHamburgerOrderWith0 (int maximum) {
        int readingInput;

        while (true) {
            if (scanner.hasNextInt ()) {
                    readingInput = scanner.nextInt ();
                    scanner.nextLine ();
                if (readingInput >= 0 && readingInput <= maximum) {
                    return readingInput;
                } else {
                    System.out.println ("Please enter a number in the range of 1 and " + maximum);
                }
            } else {
                    System.out.println ("Please insert a number");
                    scanner.nextLine ();
        }
        }
    }

    public Integer MyScannerIngredient (int maximum) {
        int readingInput;

        while (true) {
            if (scanner.hasNextInt ()) {
                    readingInput = scanner.nextInt ();
                    scanner.nextLine ();
                if (readingInput > 0 && readingInput <= maximum) {
                    return readingInput;
                } else {
                    System.out.println ("Please enter a number in the range of 1 and " + maximum);
                }
            } else {
                    System.out.println ("Please insert a number");
                    scanner.nextLine ();
        }
        }
    }
}