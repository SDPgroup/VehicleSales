package com.example.ilia.vehiclesalesapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Activity001 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity001);
    }


    public void loginButtonClick() {
        //check if account exists
        //check if user credentials are correct
        //if credentials are correct, take user to main page
        //if credentials are not correct, take user back to login screen and display 'login failed' message
    }

    public void createAccountButtonClick(View view) {
        Intent intent = new Intent(this,ActivityCreateAccount.class);
        startActivity(intent);
    }
}
