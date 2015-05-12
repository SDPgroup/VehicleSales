package com.example.ilia.vehiclesalesapp;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Vector;


public class ActivityCreateAccount extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_create_account);

        TextView error = (TextView)findViewById(R.id.textViewErrorView);
        error.setText("");
    }



    public void backButtonClick(View view) {
        Intent intent = new Intent(this,Activity001.class);
        startActivity(intent);
    }

    public void createAccountButtonClick(View view) {
        //extracting String data from Edit Text fields
        EditText editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        String firstName = editTextFirstName.getText().toString();

        EditText editTextLastName = (EditText) findViewById(R.id.editTextLastName);
        String lastName = editTextLastName.getText().toString();

        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String email = editTextEmail.getText().toString();

        EditText editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        String username = editTextUsername.getText().toString();

        EditText editTextDOB = (EditText) findViewById(R.id.editTextDOB);
        String dOB = editTextDOB.getText().toString();

        EditText editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        String address = editTextAddress.getText().toString();

        EditText editTextSuburb = (EditText) findViewById(R.id.editTextSuburb);
        String suburb = editTextSuburb.getText().toString();

        EditText editTextCity = (EditText) findViewById(R.id.editTextCity);
        String city = editTextCity.getText().toString();

        EditText editTextPostalCode = (EditText) findViewById(R.id.editTextPostalCode);
        String postalCode = editTextPostalCode.getText().toString();

        EditText editTextPhone = (EditText) findViewById(R.id.editTextPhone);
        String phone = editTextPhone.getText().toString();

        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        String password = editTextPassword.getText().toString();

        EditText editTextRePassword = (EditText) findViewById(R.id.editTextRePassword);
        String rePassword = editTextRePassword.getText().toString();

        TextView textViewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        TextView textViewLastName = (TextView) findViewById(R.id.textViewLastName);
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        TextView textViewUsername = (TextView) findViewById(R.id.textViewUsername);
        TextView textViewDOB = (TextView) findViewById(R.id.textViewDOB);
        TextView textViewAddress = (TextView) findViewById(R.id.textViewAddress);
        TextView textViewSuburb = (TextView) findViewById(R.id.textViewSuburb);
        TextView textViewCity = (TextView) findViewById(R.id.textViewCity);
        TextView textViewPostalCode = (TextView) findViewById(R.id.textViewPostalCode);
        TextView textViewPhone = (TextView) findViewById(R.id.textViewPhone);
        TextView textViewPassword = (TextView) findViewById(R.id.textViewPassword);
        TextView textViewRePassword = (TextView) findViewById(R.id.textViewRePassword);

        textViewFirstName.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewLastName.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewEmail.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewUsername.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewDOB.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewAddress.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewSuburb.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewCity.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewPostalCode.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewPhone.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewPassword.setTextColor(getResources().getColor(R.color.noErrorColor));
        textViewRePassword.setTextColor(getResources().getColor(R.color.noErrorColor));

        //field checks

        TextView error = (TextView) findViewById(R.id.textViewErrorView);
        error.setText("");

        if (firstName.equals("") || lastName.equals("") || email.equals("") || username.equals("") || dOB.equals("") || address.equals("") ||
                suburb.equals("") || city.equals("") || postalCode.equals("") || phone.equals("") || password.equals("") || rePassword.equals("")) {
            error.setText("Missing fields");

            if (firstName.equals(""))
                textViewFirstName.setTextColor(getResources().getColor(R.color.errorColor));

            if (lastName.equals(""))
                textViewLastName.setTextColor(getResources().getColor(R.color.errorColor));

            if (email.equals(""))
                textViewEmail.setTextColor(getResources().getColor(R.color.errorColor));

            if (username.equals(""))
                textViewUsername.setTextColor(getResources().getColor(R.color.errorColor));

            if (dOB.equals(""))
                textViewDOB.setTextColor(getResources().getColor(R.color.errorColor));

            if (address.equals(""))
                textViewAddress.setTextColor(getResources().getColor(R.color.errorColor));

            if (suburb.equals(""))
                textViewSuburb.setTextColor(getResources().getColor(R.color.errorColor));

            if (city.equals(""))
                textViewCity.setTextColor(getResources().getColor(R.color.errorColor));

            if (postalCode.equals(""))
                textViewPostalCode.setTextColor(getResources().getColor(R.color.errorColor));

            if (phone.equals(""))
                textViewPhone.setTextColor(getResources().getColor(R.color.errorColor));

            if (password.equals(""))
                textViewPassword.setTextColor(getResources().getColor(R.color.errorColor));

            if (rePassword.equals(""))
                textViewRePassword.setTextColor(getResources().getColor(R.color.errorColor));

        }
        else {
            if (password.length() <= 6) {
                error.setText("Must be longer than 6 chars");
                textViewPassword.setTextColor(getResources().getColor(R.color.errorColor));
                textViewRePassword.setTextColor(getResources().getColor(R.color.errorColor));
            } else {
                if (!password.equals(rePassword)) {
                    error.setText("Passwords Dont Match");
                    textViewPassword.setTextColor(getResources().getColor(R.color.errorColor));
                    textViewRePassword.setTextColor(getResources().getColor(R.color.errorColor));
                }
                else {
                    //creating user

                   try{
                       FileOutputStream fileout = openFileOutput("accounts.txt",MODE_PRIVATE);
                       fileout.write("Outputting to file".getBytes());
                       fileout.close();

                   } catch (FileNotFoundException e) {
                       e.printStackTrace();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }


                }
            }

        }


        Log.d("First Name debug", firstName);
        Log.d("Last Name debug", lastName);


    }
}
