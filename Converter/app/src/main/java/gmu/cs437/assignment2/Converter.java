package gmu.cs437.assignment2;

public class Converter {

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
