package com.example.hva.aplikasikonversi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Bilangan extends AppCompatActivity{
    int bil;
    String hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilangan);
    }

    public void convert(View view) {
        Spinner fromSpinnerBilangan, toSpinnerBilangan;
        EditText fromEditTextBilangan, toEditTextBilangan;

        fromSpinnerBilangan = (Spinner) findViewById(R.id.spinnerbilangan_from);
        toSpinnerBilangan = (Spinner) findViewById(R.id.spinnerbilangan_to);
        fromEditTextBilangan = (EditText) findViewById(R.id.editTextbilangan_from);
        toEditTextBilangan = (EditText) findViewById(R.id.editTextbilangan_to);

        // Get the string from the Spinners and number from the EditText
        String fromStringBilangan = fromSpinnerBilangan.getSelectedItem().toString();
        String toStringBilangan = toSpinnerBilangan.getSelectedItem().toString();
        double inputBilangan = Double.valueOf(fromEditTextBilangan.getText().toString());

        // Convert the strings to something in our Unit enu,
        Konversi.UnitBilangan fromUnit = Konversi.UnitBilangan.fromString(fromStringBilangan);
        Konversi.UnitBilangan toUnit = Konversi.UnitBilangan.fromString(toStringBilangan);

        switch (fromUnit) {
            case BINER:
                if (toUnit == Konversi.UnitBilangan.DESIMAL) {
                    bil = Integer.parseInt(fromStringBilangan, 2);
                    hasil = String.format("%d", bil);
                    toEditTextBilangan.setText(hasil);
                }else if (toUnit == Konversi.UnitBilangan.HEXADESIMAL) {
                    bil = Integer.parseInt(fromStringBilangan, 2);
                    hasil = Integer.toHexString(bil);
                    toEditTextBilangan.setText(hasil);
                }else if (toUnit == Konversi.UnitBilangan.OCTAL) {
                    bil = Integer.parseInt(fromStringBilangan, 2);
                    hasil = Integer.toOctalString(bil);
                    toEditTextBilangan.setText(hasil);
                }else {
                    String awal = (fromStringBilangan);
                    hasil = awal;
                    toEditTextBilangan.setText(hasil);
                }
                break;
            case DESIMAL:
                if (toUnit == Konversi.UnitBilangan.BINER) {
                    bil = Integer.parseInt(fromStringBilangan);
                    hasil = Integer.toBinaryString(bil);
                    toEditTextBilangan.setText(hasil);
                }else if (toUnit == Konversi.UnitBilangan.HEXADESIMAL) {
                    bil = Integer.parseInt(fromStringBilangan);
                    hasil = Integer.toHexString(bil);
                    toEditTextBilangan.setText(hasil);
                }else if (toUnit == Konversi.UnitBilangan.OCTAL) {
                    bil = Integer.parseInt(fromStringBilangan);
                    hasil = Integer.toOctalString(bil);
                    toEditTextBilangan.setText(hasil);
                }else {
                    String awal = (fromStringBilangan);
                    hasil = awal;
                    toEditTextBilangan.setText(hasil);
                }
                break;
            case HEXADESIMAL:
                if (toUnit == Konversi.UnitBilangan.BINER) {
                    bil = Integer.parseInt(fromStringBilangan, 16);
                    hasil = Integer.toBinaryString(bil);
                    toEditTextBilangan.setText(hasil);
                } else if (toUnit == Konversi.UnitBilangan.DESIMAL) {
                    bil = Integer.parseInt(fromStringBilangan, 16);
                    hasil = Integer.toString(bil);
                    toEditTextBilangan.setText(hasil);
                } else if (toUnit == Konversi.UnitBilangan.OCTAL) {
                    bil = Integer.parseInt(fromStringBilangan, 16);
                    hasil = Integer.toOctalString(bil);
                    toEditTextBilangan.setText(hasil);
                }else {
                    String awal = (fromStringBilangan);
                    hasil = awal;
                    toEditTextBilangan.setText(hasil);
                }
                break;
            case OCTAL:
                if (toUnit == Konversi.UnitBilangan.BINER) {
                    bil = Integer.parseInt(fromStringBilangan, 8);
                    hasil = Integer.toBinaryString(bil);
                    toEditTextBilangan.setText(hasil);
                } else if (toUnit == Konversi.UnitBilangan.DESIMAL) {
                    bil = Integer.parseInt(fromStringBilangan, 8);
                    hasil = String.format("%d", bil);
                    toEditTextBilangan.setText(hasil);
                } else if (toUnit == Konversi.UnitBilangan.HEXADESIMAL) {
                    bil = Integer.parseInt(fromStringBilangan, 8);
                    hasil = Integer.toHexString(bil);
                    toEditTextBilangan.setText(hasil);
                }else {
                    String awal = (fromStringBilangan);
                    hasil = awal;
                    toEditTextBilangan.setText(hasil);
                }
                break;
        }

    }
}
