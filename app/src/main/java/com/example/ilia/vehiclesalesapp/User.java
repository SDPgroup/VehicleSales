package com.example.ilia.vehiclesalesapp;

import java.util.Date;

/**
 * Created by Ilia on 6/05/2015.
 */
public class User {
    Listing[] watchlist;
    Listing[] selling;

    int userID;
    String firstName;
    String lastName;
    Date dOB;
    Date accountCreated;

    //Address
    String streetNumberName;
    String suburb;
    String City;
    int postalCode;

    int phone;
    String emailAddress;


}
