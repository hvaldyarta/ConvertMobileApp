package com.example.hva.aplikasikonversi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Berat extends AppCompatActivity {
    public Spinner fromSpinnerBerat, toSpinnerBerat;
    public Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berat);

    }

    public void convert(View view) {
        Spinner fromSpinnerBerat, toSpinnerBerat;
        EditText fromEditTextBerat, toEditTextBerat;

        fromSpinnerBerat = (Spinner) findViewById(R.id.spinnerberat_from);
        toSpinnerBerat = (Spinner) findViewById(R.id.spinnerberat_to);
        fromEditTextBerat = (EditText) findViewById(R.id.editTextberat_from);
        toEditTextBerat = (EditText) findViewById(R.id.editTextberat_to);

        // Get the string from the Spinners and number from the EditText
        String fromStringBerat = (String) fromSpinnerBerat.getSelectedItem();
        String toStringBerat = (String) toSpinnerBerat.getSelectedItem();
        double inputberat = Double.valueOf(fromEditTextBerat.getText().toString());

        // Convert the strings to something in our Unit enu,
        Konversi.UnitBerat fromUnit = Konversi.UnitBerat.fromString(fromStringBerat);
        Konversi.UnitBerat toUnit = Konversi.UnitBerat.fromString(toStringBerat);

        // Set the multiplier, else if fromUnit = toUnit, then it is 1
            switch (fromUnit) {
                case TON:
                    if (toUnit == Konversi.UnitBerat.KWINTAL) {
                        double ton = inputberat;
                        double kwintal = ton * 10;
                        toEditTextBerat.setText(String.valueOf(kwintal));
                    } else if (toUnit == Konversi.UnitBerat.KILOGRAM) {
                        double ton = inputberat;
                        double kg = ton * 1000;
                        toEditTextBerat.setText(String.valueOf(kg));
                    } else if (toUnit == Konversi.UnitBerat.GRAM) {
                        double ton = inputberat;
                        double gram = ton * 1000000;
                        toEditTextBerat.setText(String.valueOf(gram));
                    } else if (toUnit == Konversi.UnitBerat.PON) {
                        double ton = inputberat;
                        double pon = ton * 2000;
                        toEditTextBerat.setText(String.valueOf(pon));
                    } else if (toUnit == Konversi.UnitBerat.ONS) {
                        double ton = inputberat;
                        double ons = ton * 35273.94;
                        toEditTextBerat.setText(String.valueOf(ons));
                    }
                    break;
                case KWINTAL:
                    if (toUnit == Konversi.UnitBerat.TON) {
                        double kwintal = inputberat;
                        double ton = kwintal * 0.1;
                        toEditTextBerat.setText(String.valueOf(ton));
                    } else if (toUnit == Konversi.UnitBerat.KILOGRAM) {
                        double kwintal = inputberat;
                        double kg = kwintal * 0.01;
                        toEditTextBerat.setText(String.valueOf(kg));
                    } else if (toUnit == Konversi.UnitBerat.GRAM) {
                        double kwintal = inputberat;
                        double gram = kwintal * 0.00001;
                        toEditTextBerat.setText(String.valueOf(gram));
                    } else if (toUnit == Konversi.UnitBerat.PON) {
                        double kwintal = inputberat;
                        double pon = kwintal * 0.005 ;
                        toEditTextBerat.setText(String.valueOf(pon));
                    } else if (toUnit == Konversi.UnitBerat.ONS) {
                        double kwintal = inputberat;
                        double ons = kwintal * 0.001;
                        toEditTextBerat.setText(String.valueOf(ons));
                    }
                    break;
            }
    }
}

