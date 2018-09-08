package com.kheiron;

public class BreadDetails {

    private int nameNumber;
    private double price;
    private String name;

    public BreadDetails (int nameNumber) {
        switch (nameNumber) {
            case 1:
                this.price = 0.12;
                this.name = "White bread";
                break;
            case 2:
                this.price = 0.25;
                this.name = "Brown bread";
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
