package com.example.hva.aplikasikonversi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.example.hva.aplikasikonversi.R.array.units;

public class Suhu extends AppCompatActivity {

    public Spinner fromSpinnerSuhu, toSpinnerSuhu;
    public Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

    }

    public void convert(View view) {
        Spinner fromSpinnerSuhu, toSpinnerSuhu;
        EditText fromEditTextSuhu, toEditTextSuhu;

        fromSpinnerSuhu = (Spinner) findViewById(R.id.spinnersuhu_from);
        toSpinnerSuhu = (Spinner) findViewById(R.id.spinnersuhu_to);
        fromEditTextSuhu = (EditText) findViewById(R.id.editTextsuhu_from);
        toEditTextSuhu = (EditText) findViewById(R.id.editTextsuhu_to);

        // Get the string from the Spinners and number from the EditText
        String fromStringSuhu = fromSpinnerSuhu.getSelectedItem().toString();
        String toStringSuhu = toSpinnerSuhu.getSelectedItem().toString();
        double inputsuhu = Double.valueOf(fromEditTextSuhu.getText().toString());

        // Convert the strings to something in our Unit enu,
        Konversi.UnitSuhu fromUnit = Konversi.UnitSuhu.fromString(fromStringSuhu);
        Konversi.UnitSuhu toUnit = Konversi.UnitSuhu.fromString(toStringSuhu);

        switch (fromUnit) {
            case CELCIUS:
                if (toUnit == Konversi.UnitSuhu.FAHRENHEIT) {
                    double celcius = inputsuhu;
                    double fahrenheit = (celcius * 1.8) + 32;
                    toEditTextSuhu.setText(String.valueOf(fahrenheit));
                } else if (toUnit == Konversi.UnitSuhu.KELVIN) {
                    double celcius = inputsuhu;
                    double kelvin = celcius + 273.5;
                    toEditTextSuhu.setText(String.valueOf(kelvin));
                } else if (toUnit == Konversi.UnitSuhu.REAMUR) {
                    double celcius = inputsuhu;
                    double reamur = celcius * 0.8;
                    toEditTextSuhu.setText(String.valueOf(reamur));
                }
                break;
            case FAHRENHEIT:
                if (toUnit == Konversi.UnitSuhu.CELCIUS) {
                    double fahrenheit = inputsuhu;
                    double celcius = (fahrenheit - 32) / 1.8;
                    toEditTextSuhu.setText(String.valueOf(celcius));
                } else if (toUnit == Konversi.UnitSuhu.KELVIN) {
                    double fahrenheit = inputsuhu;
                    double kelvin =  (fahrenheit + 459.67) / 1.8;
                    toEditTextSuhu.setText(String.valueOf(kelvin));
                } else if (toUnit == Konversi.UnitSuhu.REAMUR) {
                    double fahrenheit = inputsuhu;
                    double reamur = (fahrenheit - 32) / 2.25;
                    toEditTextSuhu.setText(String.valueOf(reamur));
                }
                break;
            case KELVIN:
                if (toUnit == Konversi.UnitSuhu.CELCIUS) {
                    double kelvin = inputsuhu;
                    double celcius =  kelvin - 273.15;
                    toEditTextSuhu.setText(String.valueOf(celcius));
                } else if (toUnit == Konversi.UnitSuhu.FAHRENHEIT) {
                    double kelvin = inputsuhu;
                    double fahrenheit =   kelvin * 1.8 - 459.67;
                    toEditTextSuhu.setText(String.valueOf(fahrenheit));
                } else if (toUnit == Konversi.UnitSuhu.REAMUR) {
                    double kelvin = inputsuhu;
                    double reamur = (kelvin - 273.15) * 0.8;
                    toEditTextSuhu.setText(String.valueOf(reamur));
                }
                break;
            case REAMUR:
                if (toUnit == Konversi.UnitSuhu.CELCIUS) {
                    double reamur = inputsuhu;
                    double celcius = reamur  / 0.8;
                    toEditTextSuhu.setText(String.valueOf(celcius));
                } else if (toUnit == Konversi.UnitSuhu.FAHRENHEIT) {
                    double reamur = inputsuhu;
                    double fahrenheit = reamur * 2.25 + 32;
                    toEditTextSuhu.setText(String.valueOf(fahrenheit));
                } else if (toUnit == Konversi.UnitSuhu.KELVIN) {
                    double reamur = inputsuhu;
                    double kelvin = reamur / 0.8 + 273.15;
                    toEditTextSuhu.setText(String.valueOf(kelvin));
                }
                break;
        }

    }
}
