package gmu.cs437.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    /**
     * Returns the list of conversions that the program should feature on its UI
     * @return The list of conversions
     */
    public static List<Conversion> getProgramConversions() {
        List<Conversion> conversions = new ArrayList<>();
        conversions.add(new Conversion("Fahrenheit (Fº)",   "Celsius (Cº)",     Converter::convertF2C,      Converter::convertC2F));
        conversions.add(new Conversion("Inch (in)",         "Centimeter (cm)",  Converter::convertIn2Cm,    Converter::convertCm2In));
        conversions.add(new Conversion("Feet (ft)",         "Meter (m)",        Converter::convertF2M,      Converter::convertM2F));
        conversions.add(new Conversion("Mile (mi)",         "Kilometer (km)",   Converter::convertM2K,      Converter::convertK2M));
        conversions.add(new Conversion("Gallon (gal)",      "Liter (L)",        Converter::convertG2L,      Converter::convertL2G));
        conversions.add(new Conversion("Ounce (oz)",        "Gram (g)",         Converter::convertOz2G,     Converter::convertG2Oz));
        conversions.add(new Conversion("Pound (lb)",        "Kilogram (kg)",    Converter::convertLb2K,     Converter::convertK2Lb));
        conversions.add(new Conversion("Hours (hr)",        "Seconds (s)",      Converter::convertHr2Sec,   Converter::convertSec2Hr));
        conversions.add(new Conversion("Miles per hour (Mph)","Kilometers per hour (Kph)",      Converter::convertMph2Kph,   Converter::convertKph2Mph));
        return conversions;
    }

    /**
     * Converts celsius degrees to kelvin.
     * @param c the degrees in celsius
     * @return Equivalent degrees in kelvin
     */
    public static float convertC2K(float c) {
        return 0;
    }

    /**
     * Converts kelvin degrees to celsius.
     * @param k the degrees in kelvin
     * @return Equivalent degrees in celsius
     */
    public static float convertK2C(float k) {
        return 0;
    }

    /**
     * Converts miles per hour to kilometers per hour.
     * @param mph the speed in miles per hour
     * @return Equivalent speed in kilometres per hour.
     */
    public static float convertMph2Kph(float mph) {
        return mph * 1.60934f;
    }

    /**
     * Converts kilometres per hour to miles per hour.
     * @param kph the speed in kilometres per hour.
     * @return Equivalent speed in miles per hour.
     */
    public static float convertKph2Mph(float kph) {
        return kph * 0.621371f;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * @param f Temperature in Fahrenheit.
     * @return Equivalent temperature in Celsius.
     */
    public static float convertF2C(float f) {
        return (((f - 32.0f) * 5.0f) / 9.0f);
    }

    /**
     * Converts Celsius to Fahrenheit.
     * @param c Temperature in Celsius.
     * @return Equivalent temperature in Fahrenheit.
     */
    public static float convertC2F(float c) {
        return ((c * 9.0f / 5.0f) + 32.0f);
    }

    /**
     * Converts Inches to Centimeters.
     * @param inches Length in inches.
     * @return Equivalent length in centimeters.
     */
    public static float convertIn2Cm(float inches) {
        return inches * 2.54f;
    }

    /**
     * Converts Centimeters to Inches.
     * @param cm Length in centimeters.
     * @return Equivalent length in inches.
     */
    public static float convertCm2In(float cm) {
        return cm * 0.3937f;
    }

    /**
     * Converts Feet to Meters.
     * @param feet Length in feet.
     * @return Equivalent length in meters.
     */
    public static float convertF2M(float feet) {
        return feet * 0.3048f;
    }

    /**
     * Converts Meters to Feet.
     * @param meters Length in meters.
     * @return Equivalent length in feet.
     */
    public static float convertM2F(float meters) {
        return meters / 0.3048f;
    }

    /**
     * Converts Miles to Kilometers.
     * @param miles Distance in miles.
     * @return Equivalent distance in kilometers.
     */
    public static float convertM2K(float miles) {
        return miles * 1.609f;
    }

    /**
     * Converts Kilometers to Miles.
     * @param kilometers Distance in kilometers.
     * @return Equivalent distance in miles.
     */
    public static float convertK2M(float kilometers) {
        return kilometers * 0.6214f;
    }

    /**
     * Converts Gallons to Liters.
     * @param gallons Volume in gallons.
     * @return Equivalent volume in liters.
     */
    public static float convertG2L(float gallons) {
        return gallons * 3.785f;
    }

    /**
     * Converts Liters to Gallons.
     * @param liters Volume in liters.
     * @return Equivalent volume in gallons.
     */
    public static float convertL2G(float liters) {
        return liters / 3.785f;
    }

    /**
     * Converts Ounces to Grams.
     * @param ounces Weight in ounces.
     * @return Equivalent weight in grams.
     */
    public static float convertOz2G(float ounces) {
        return ounces * 28.35f;
    }

    /**
     * Converts Grams to Ounces.
     * @param grams Weight in grams.
     * @return Equivalent weight in ounces.
     */
    public static float convertG2Oz(float grams) {
        return grams / 28.35f;
    }

    /**
     * Converts Pounds to Kilograms.
     * @param pounds Weight in pounds.
     * @return Equivalent weight in kilograms.
     */
    public static float convertLb2K(float pounds) {
        return pounds * 0.4536f;
    }

    /**
     * Converts Kilograms to Pounds.
     * @param kilograms Weight in kilograms.
     * @return Equivalent weight in pounds.
     */
    public static float convertK2Lb(float kilograms) {
        return kilograms * 2.205f;
    }

    /**
     * Converts Hours to seconds.
     * @param hours time in hours.
     * @return Equivalent time in seconds.
     */
    public static float convertHr2Sec(float hours) {
        return hours * 60f * 60f;
    }

    /**
     * Converts seconds to hours.
     * @param seconds time in seconds.
     * @return Equivalent time in hours.
     */
    public static float convertSec2Hr(float seconds) {
        return seconds / 60f / 60f;
    }
}
