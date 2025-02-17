package gmu.cs437.assignment2;

public class Converter {

    /**
     * Utility function to round a float value to two decimal places.
     * @param num The float number to round.
     * @return The rounded float number.
     */
    public static float round(float num) {
        return Math.round(num * 100.0f) / 100.0f;
    }

    /**
     * Converts Fahrenheit to Celsius.
     * @param f Temperature in Fahrenheit.
     * @return Equivalent temperature in Celsius.
     */
    public static float convertF2C(float f) {
        f = round(f);
        float c = (((f - 32.0f) * 5.0f) / 9.0f);
        return round(c);
    }

    /**
     * Converts Celsius to Fahrenheit.
     * @param c Temperature in Celsius.
     * @return Equivalent temperature in Fahrenheit.
     */
    public static float convertC2F(float c) {
        c = round(c);
        float f = ((c * 9.0f / 5.0f) + 32.0f);
        return round(f);
    }

    /**
     * Converts Inches to Centimeters.
     * @param inches Length in inches.
     * @return Equivalent length in centimeters.
     */
    public static float convertIn2Cm(float inches) {
        inches = round(inches);
        float cm = inches * 2.54f;
        return round(cm);
    }

    /**
     * Converts Centimeters to Inches.
     * @param cm Length in centimeters.
     * @return Equivalent length in inches.
     */
    public static float convertCm2In(float cm) {
        cm = round(cm);
        float inches = cm * 0.3937f;
        return round(inches);
    }

    /**
     * Converts Feet to Meters.
     * @param feet Length in feet.
     * @return Equivalent length in meters.
     */
    public static float convertF2M(float feet) {
        feet = round(feet);
        float meters = feet * 0.3048f;
        return round(meters);
    }

    /**
     * Converts Meters to Feet.
     * @param meters Length in meters.
     * @return Equivalent length in feet.
     */
    public static float convertM2F(float meters) {
        meters = round(meters);
        float feet = meters / 0.3048f;
        return round(feet);
    }

    /**
     * Converts Miles to Kilometers.
     * @param miles Distance in miles.
     * @return Equivalent distance in kilometers.
     */
    public static float convertM2K(float miles) {
        miles = round(miles);
        float km = miles * 1.609f;
        return round(km);
    }

    /**
     * Converts Kilometers to Miles.
     * @param kilometers Distance in kilometers.
     * @return Equivalent distance in miles.
     */
    public static float convertK2M(float kilometers) {
        kilometers = round(kilometers);
        float miles = kilometers * 0.6214f;
        return round(miles);
    }

    /**
     * Converts Gallons to Liters.
     * @param gallons Volume in gallons.
     * @return Equivalent volume in liters.
     */
    public static float convertG2L(float gallons) {
        gallons = round(gallons);
        float liters = gallons * 3.785f;
        return round(liters);
    }

    /**
     * Converts Liters to Gallons.
     * @param liters Volume in liters.
     * @return Equivalent volume in gallons.
     */
    public static float convertL2G(float liters) {
        liters = round(liters);
        float gallons = liters / 3.785f;
        return round(gallons);
    }

    /**
     * Converts Ounces to Grams.
     * @param ounces Weight in ounces.
     * @return Equivalent weight in grams.
     */
    public static float convertOz2G(float ounces) {
        ounces = round(ounces);
        float grams = ounces * 28.35f;
        return round(grams);
    }

    /**
     * Converts Grams to Ounces.
     * @param grams Weight in grams.
     * @return Equivalent weight in ounces.
     */
    public static float convertG2Oz(float grams) {
        grams = round(grams);
        float ounces = grams / 28.35f;
        return round(ounces);
    }

    /**
     * Converts Pounds to Kilograms.
     * @param pounds Weight in pounds.
     * @return Equivalent weight in kilograms.
     */
    public static float convertLb2K(float pounds) {
        pounds = round(pounds);
        float kg = pounds * 0.4536f;
        return round(kg);
    }

    /**
     * Converts Kilograms to Pounds.
     * @param kilograms Weight in kilograms.
     * @return Equivalent weight in pounds.
     */
    public static float convertK2Lb(float kilograms) {
        kilograms = round(kilograms);
        float pounds = kilograms * 2.205f;
        return round(pounds);
    }
}
