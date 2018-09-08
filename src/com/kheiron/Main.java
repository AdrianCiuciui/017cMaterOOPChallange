package com.kheiron;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // This code doesn't use arrays, although it would have been easier, because they weren't learned until this moment in time

        MyScanner scanner = new MyScanner ();
        System.out.println ("    -----------------------------------------------\n" +
                "   --- ===== Hello and welcome to McBurger! ==== ---\n" +
                "--------------------------------------------------------");
        System.out.println ("Please choose a hamburger type: \n1. Regular. You can choose the meat, bread and up to 4 ingredients\n" +
                "2. Healthy. You can choose the meat, and up to 6 ingredients. The bread is brown.\n" +
                "3. Smart Burger Pack. You can choose the meat and bread type. There are only 2 ingredients: cips and drink.");

        int inputForHamburger = scanner.MyScannerHamburgerOrder (3);
        int howManyIngredients = 0;
        MeatDetails inputMeatType =  new MeatDetails (0); // De ce spune ca e redundant?
        BreadDetails inputBreadType = new BreadDetails (0);
        IngredientsDetails ingredient1 = new IngredientsDetails ();
        IngredientsDetails ingredient2 = new IngredientsDetails ();
        IngredientsDetails ingredient3 = new IngredientsDetails ();
        IngredientsDetails ingredient4 = new IngredientsDetails ();
        IngredientsDetails ingredient5 = new IngredientsDetails ();
        IngredientsDetails ingredient6 = new IngredientsDetails ();
        double orderPrice = 0; // total price for the order

        switch (inputForHamburger) {
            case 1:
                howManyIngredients = 4;
                break;
            case 2:
                howManyIngredients = 6;
                break;
            case 3:
                howManyIngredients = 0;
                break;
        }

        // choosing meat type
        System.out.println ("\nPlease choose one of the available meat types for your burger:\n" +
                "1. Beef meat ( "+ new MeatDetails (1).getPrice () +
                " ),\n2. Pork Meat ( " + new MeatDetails (2).getPrice ()+
                " ),\n3. Chicken   ( " +  new MeatDetails (3).getPrice () + " ).");
        inputMeatType =  new MeatDetails (scanner.MyScannerHamburgerOrder (3));

        // choosing bread type, with condition for the Healthy Burger
        if (howManyIngredients != 6) {
            System.out.println ("\nPlease choose one of the available bread types for your burger:\n" +
                    "1. " + new BreadDetails (1).getName () + " for " + new BreadDetails(1).getPrice () +
                    "\n2. " + new BreadDetails (2).getName () + " for " + new BreadDetails (2).getPrice ());
            inputBreadType = new BreadDetails (scanner.MyScannerHamburgerOrder (2));
        } else {
            inputBreadType = new BreadDetails (2);
        }


        // choosing the ingredients
        if (howManyIngredients != 0) {
            System.out.println ("Please choose up to " + howManyIngredients + " to be added from the following list:\n ");
            new IngredientsDetails (0).IngredientsList ();
        }
        for (int i=0; i< howManyIngredients;i++) {
        int input = scanner.MyScannerHamburgerOrderWith0 (7);
        switch (i+1) {   // iau fiecare ingredient in parte, folosind cases
            case 1:
                if (input == 0) { i = howManyIngredients;break;}
                else {
                    ingredient1 = new IngredientsDetails (input);
                } break;
            case 2:
                if (input == 0) { i = howManyIngredients;break;}
                else {
                    ingredient2 = new IngredientsDetails (input);
                } break;
            case 3:
                if (input == 0) { i = howManyIngredients;break;}
                else {
                    ingredient3 = new IngredientsDetails (input);
                } break;
            case 4:
                if (input == 0) { i = howManyIngredients;break;}
                else {
                    ingredient4 = new IngredientsDetails (input);
                } break;
            case 5:
                if (input == 0) { i = howManyIngredients;break;}
                else {
                    ingredient5 = new IngredientsDetails (input);
                } break;
            case 6:
                if (input == 0) { i = howManyIngredients;break;}
                else {
                    ingredient6 = new IngredientsDetails (input);
                } break;
        }
        }





        // Cashing out
        orderPrice = inputMeatType.getPrice () + inputBreadType.getPrice () + ingredient1.getPrice () + ingredient2.getPrice () +
                ingredient3.getPrice () + ingredient4.getPrice () + ingredient5.getPrice () + ingredient6.getPrice ();
        System.out.println ("\nThe total price is: ");
        System.out.printf ("%.2f%n", orderPrice); // Making sure that only 2 decimals are printed
        System.out.print ("... out of which the " + inputMeatType.getName () + " costs: " + inputMeatType.getPrice () +
                ", the " + inputBreadType.getName ()+ " is worth " + inputBreadType.getPrice ());
        for (int i = 1 ; i <= 6; i++) {
            switch (i) {
                case 1:
                    if (ingredient1.getPrice () == 0) break;
                    else System.out.print (", " + ingredient1.getIngredientName () + " for " + ingredient1.getPrice ());
                    break;
                case 2:
                    if (ingredient2.getPrice () == 0) break;
                    else System.out.print (", " + ingredient2.getIngredientName () + " for " + ingredient2.getPrice ());
                    break;
                case 3:
                    if (ingredient3.getPrice () == 0) break;
                    else System.out.print (", " + ingredient3.getIngredientName () + " for " + ingredient3.getPrice ());
                    break;
                case 4:
                    if (ingredient4.getPrice () == 0) break;
                    else System.out.print (", " + ingredient4.getIngredientName () + " for " + ingredient4.getPrice ());
                    break;
                case 5:
                    if (ingredient5.getPrice () == 0) break;
                    else System.out.print (", " + ingredient5.getIngredientName () + " for " + ingredient5.getPrice ());
                    break;
                case 6:
                    if (ingredient6.getPrice () == 0) break;
                    else System.out.print (", " + ingredient6.getIngredientName () + " for " + ingredient6.getPrice ());
                    break;
                case 0:
                    break;
            }
        }

        scanner.MyScannerClose ();
    }
}