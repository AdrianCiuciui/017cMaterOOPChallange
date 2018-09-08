package com.kheiron;

public class IngredientsDetails {
    private int name;
    private String ingredientName;
    private double price;

    public IngredientsDetails () {
        this.ingredientName = "";
        this.price = 0;
    }

    public IngredientsDetails(int name) {
        switch (name) {
            case 1:
                this.ingredientName = "French fries";
                this.price = 0.99;
                break;
            case 2:
                this.ingredientName = "Drink";
                this.price = 0.49;
                break;
            case 3:
                this.ingredientName = "Salad";
                this.price = 0.67;
                break;
            case 4:
                this.ingredientName = "Tomatoes";
                this.price = 0.46;
                break;
            case 5:
                this.ingredientName = "Onion";
                this.price = 0.34;
                break;
            case 6:
                this.ingredientName = "Carrots";
                this.price = 0.21;
                break;
            case 7:
                this.ingredientName = "Cabbage";
                this.price = 0.09;
                break;
            case 0:
                this.ingredientName = "Stop adding ingredients";
                this.price = 0;
            default:
                break;
        }
    }

    // prints a soft coded list with all the ingredient's name and price
    public void IngredientsList () {
        System.out.println ("1. " + new IngredientsDetails (1).ingredientName + " for " + new IngredientsDetails (1).price);
        System.out.println ("2. " + new IngredientsDetails (2).ingredientName + " for " + new IngredientsDetails (2).price);
        System.out.println ("3. " + new IngredientsDetails (3).ingredientName + " for " + new IngredientsDetails (3).price);
        System.out.println ("4. " + new IngredientsDetails (4).ingredientName + " for " + new IngredientsDetails (4).price);
        System.out.println ("5. " + new IngredientsDetails (5).ingredientName + " for " + new IngredientsDetails (5).price);
        System.out.println ("6. " + new IngredientsDetails (6).ingredientName + " for " + new IngredientsDetails (6).price);
        System.out.println ("7. " + new IngredientsDetails (7).ingredientName + " for " + new IngredientsDetails (7).price);
        System.out.println ("0. " + new IngredientsDetails (0).ingredientName + " for " + new IngredientsDetails (0).price);
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public double getPrice() {
        return price;
    }
}