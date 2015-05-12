package com.example.ilia.vehiclesalesapp;

/**
 * Created by Ilia on 6/05/2015.
 */
public class Listing {
    private int listingID;
    private String category;
    private String make;
    private String model;
    private int year;
    private int price;
    private String color;
    private int odometer;
    private String description;
    private String[] imageDir;

    public Listing(int listingID, String category, String make, String model,
                   int year, int price, String color,
                   int odometer, String description, String[] imageDir) {
        this.listingID = listingID;
        this.category = category;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.odometer = odometer;
        this.description = description;
        this.imageDir = imageDir;
    }
    int getListingID() { return this.listingID; }

    String getCategory(){
        return this.category;
    }

    String getMake() {
        return this.make;
    }

    String getModel() {
        return this.model;
    }

    int getYear() {
        return this.year;
    }

    int getPrice() {
        return this.price;
    }

    String getColor() {
        return this.color;
    }

    int getOdometer() {
        return this.odometer;
    }

    String getDescription() {
        return this.description;
    }

    String[] getImageDir() {
        return this.imageDir;
    }
}
