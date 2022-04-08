package com.nirmalbhetwal.vacationplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner countrySpinner;
    ArrayList<Country> countries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countrySpinner = (Spinner) findViewById(R.id.spCountries);
        fillData();

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, countries);
        countrySpinner.setAdapter(adapter);
        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void fillData() {
        countries.add(new Country("Nepal"));
        countries.add(new Country("China"));
    }
}