package com.kheiron;

public class MeatDetails {
    private int nameNumber;
    private double price;
    private String name;

    public MeatDetails(int nameNumber) {
        switch (nameNumber) {
            case 1:
                this.price = 3.33;
                this.name = "Pork meat";
            break;
            case 2:
                this.price = 5.24;
                this.name = "Beef meat";
            break;
            case 3:
                this.price = 4.89;
                this.name = "Chicken meat";
            break;
            default:
                this.price = -1;
                this.name = "Invalid input";
            break;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
