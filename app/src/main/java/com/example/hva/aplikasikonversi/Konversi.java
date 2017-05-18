package com.example.hva.aplikasikonversi;

import java.util.Enumeration;

/**
 * Created by HVA on 5/15/2017.
 */

public class Konversi {
    public enum UnitPanjang {
        INCH,
        CENTIMETER,
        FOOT,
        YARD,
        METER,
        MILE,
        KILOMETER;

        // Helper method to convert text to one of the above constants
        public static UnitPanjang fromString(String text) {
            if (text != null) {
                for (UnitPanjang unitp : UnitPanjang.values()) {
                    if (text.equalsIgnoreCase(unitp.toString())) {
                        return unitp;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;

    public Konversi(UnitPanjang from, UnitPanjang to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case INCH:
                if (to == UnitPanjang.CENTIMETER) {
                    constant = 2.54;
                } else if (to == UnitPanjang.FOOT) {
                    constant = 0.0833333;
                } else if (to == UnitPanjang.YARD) {
                    constant = 0.0277778;
                } else if (to == UnitPanjang.METER) {
                    constant = 0.0254;
                } else if (to == UnitPanjang.MILE) {
                    constant = 1.5783e-5;
                } else if (to == UnitPanjang.KILOMETER) {
                    constant = 2.54e-5;
                }
                break;
            case CENTIMETER:
                if (to == UnitPanjang.INCH) {
                    constant = 0.393701;
                } else if (to == UnitPanjang.FOOT) {
                    constant = 0.0328084;
                } else if (to == UnitPanjang.YARD) {
                    constant = 0.0109361;
                } else if (to == UnitPanjang.METER) {
                    constant = 0.01;
                } else if (to == UnitPanjang.MILE) {
                    constant = 6.2137e-6;
                } else if (to == UnitPanjang.KILOMETER) {
                    constant = 1e-5;
                }
                break;
            case FOOT:
                if (to == UnitPanjang.INCH) {
                    constant = 12;
                } else if (to == UnitPanjang.CENTIMETER) {
                    constant = 30.48;
                } else if (to == UnitPanjang.YARD) {
                    constant = 0.333333;
                } else if (to == UnitPanjang.METER) {
                    constant = 0.3048;
                } else if (to == UnitPanjang.MILE) {
                    constant = 0.000189394;
                } else if (to == UnitPanjang.KILOMETER) {
                    constant = 0.0003048;
                }
                break;
            case YARD:
                if (to == UnitPanjang.INCH) {
                    constant = 36;
                } else if (to == UnitPanjang.CENTIMETER) {
                    constant = 91.44;
                } else if (to == UnitPanjang.FOOT) {
                    constant = 3;
                } else if (to == UnitPanjang.METER) {
                    constant = 0.9144;
                } else if (to == UnitPanjang.MILE) {
                    constant = 0.000568182;
                } else if (to == UnitPanjang.KILOMETER) {
                    constant = 0.0009144;
                }
                break;
            case METER:
                if (to == UnitPanjang.INCH) {
                    constant = 39.3701;
                } else if (to == UnitPanjang.CENTIMETER) {
                    constant = 100;
                } else if (to == UnitPanjang.FOOT) {
                    constant = 3.28084;
                } else if (to == UnitPanjang.YARD) {
                    constant = 1.09361;
                } else if (to == UnitPanjang.MILE) {
                    constant = 0.000621371;
                } else if (to == UnitPanjang.KILOMETER) {
                    constant = 0.001;
                }
                break;
            case MILE:
                if (to == UnitPanjang.INCH) {
                    constant = 63360;
                } else if (to == UnitPanjang.CENTIMETER) {
                    constant = 160934;
                } else if (to == UnitPanjang.FOOT) {
                    constant = 5280;
                } else if (to == UnitPanjang.YARD) {
                    constant = 1760;
                } else if (to == UnitPanjang.METER) {
                    constant = 1609.34;
                } else if (to == UnitPanjang.KILOMETER) {
                    constant = 1.60934;
                }
                break;
            case KILOMETER:
                if (to == UnitPanjang.INCH) {
                    constant = 39370.1;
                } else if (to == UnitPanjang.CENTIMETER) {
                    constant = 100000;
                } else if (to == UnitPanjang.FOOT) {
                    constant = 3280.84;
                } else if (to == UnitPanjang.YARD) {
                    constant = 1093.61;
                } else if (to == UnitPanjang.METER) {
                    constant = 1000;
                } else if (to == UnitPanjang.MILE) {
                    constant = 0.621371;
                }
                break;
        }

        multiplier = constant;
    }

    // Convert the unit!
    public double convert(double input) {return input * multiplier;}


    //KONVERSI SUHU
    public enum UnitSuhu {
        CELCIUS,
        FAHRENHEIT,
        KELVIN,
        REAMUR;

        // Helper method to convert text to one of the above constants
        public static UnitSuhu fromString(String text) {
            if (text != null) {
                for (UnitSuhu unitSuhu : UnitSuhu.values()) {
                    if (text.equalsIgnoreCase(unitSuhu.toString())) {
                        return unitSuhu;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    //KONVERSI BERAT
    public enum UnitBerat {
        TON,
        KWINTAL,
        KILOGRAM,
        GRAM,
        PON,
        ONS;

        // Helper method to convert text to one of the above constants
        public static UnitBerat fromString(String text) {
            if (text != null) {
                for (UnitBerat unitb : UnitBerat.values()) {
                    if (text.equalsIgnoreCase(unitb.toString())) {
                        return unitb;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

}
