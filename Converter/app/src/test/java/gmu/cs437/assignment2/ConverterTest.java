package gmu.cs437.assignment2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    /**
     * Tests Fahrenheit to Celsius conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertF2C() {
        assertEquals(-12.222f, Converter.convertF2C(10.0f), 0.001);
        assertEquals(-17.778f, Converter.convertF2C(0.0f), 0.001);
        assertEquals(-23.333f, Converter.convertF2C(-10.0f), 0.001);
    }

    /**
     * Tests Celsius to Fahrenheit conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertC2F() {
        assertEquals(50.0f, Converter.convertC2F(10.0f), 0.001);
        assertEquals(32.0f, Converter.convertC2F(0.0f), 0.001);
        assertEquals(14.0f, Converter.convertC2F(-10.0f), 0.001);
    }

    /**
     * Tests Inches to Centimeters conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertIn2Cm() {
        assertEquals(25.4f, Converter.convertIn2Cm(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertIn2Cm(0.0f), 0.001);
        assertEquals(-25.4f, Converter.convertIn2Cm(-10.0f), 0.001);
    }

    /**
     * Tests Centimeters to Inches conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertCm2In() {
        assertEquals(3.937f, Converter.convertCm2In(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertCm2In(0.0f), 0.001);
        assertEquals(-3.937f, Converter.convertCm2In(-10.0f), 0.001);
    }

    /**
     * Tests Feet to Meters conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertF2M() {
        assertEquals(3.048f, Converter.convertF2M(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertF2M(0.0f), 0.001);
        assertEquals(-3.048f, Converter.convertF2M(-10.0f), 0.001);
    }

    /**
     * Tests Meters to Feet conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertM2F() {
        assertEquals(32.808f, Converter.convertM2F(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertM2F(0.0f), 0.001);
        assertEquals(-32.808f, Converter.convertM2F(-10.0f), 0.001);
    }

    /**
     * Tests Miles to Kilometers conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertM2K() {
        assertEquals(16.09f, Converter.convertM2K(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertM2K(0.0f), 0.001);
        assertEquals(-16.09f, Converter.convertM2K(-10.0f), 0.001);
    }

    /**
     * Tests Kilometers to Miles conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertK2M() {
        assertEquals(6.214f, Converter.convertK2M(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertK2M(0.0f), 0.001);
        assertEquals(-6.214f, Converter.convertK2M(-10.0f), 0.001);
    }

    /**
     * Tests Gallons to Liters conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertG2L() {
        assertEquals(37.85f, Converter.convertG2L(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertG2L(0.0f), 0.001);
        assertEquals(-37.85f, Converter.convertG2L(-10.0f), 0.001);
    }

    /**
     * Tests Liters to Gallons conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertL2G() {
        assertEquals(2.642f, Converter.convertL2G(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertL2G(0.0f), 0.001);
        assertEquals(-2.642f, Converter.convertL2G(-10.0f), 0.001);
    }

    /**
     * Tests Pounds to Kilograms conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertLb2K() {
        assertEquals(4.536f, Converter.convertLb2K(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertLb2K(0.0f), 0.001);
        assertEquals(-4.536f, Converter.convertLb2K(-10.0f), 0.001);
    }

    /**
     * Tests Kilograms to Pounds conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertK2Lb() {
        assertEquals(22.05f, Converter.convertK2Lb(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertK2Lb(0.0f), 0.001);
        assertEquals(-22.05f, Converter.convertK2Lb(-10.0f), 0.001);
    }

    /**
     * Tests Hours to Seconds conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertHr2Sec() {
        assertEquals(36000.0f, Converter.convertHr2Sec(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertHr2Sec(0.0f), 0.001);
        assertEquals(-36000.0f, Converter.convertHr2Sec(-10.0f), 0.001);
    }

    /**
     * Tests Seconds to Hours conversion.
     * Observability: The test is checking that the conversion obtains the expected value for the target conversions, as well as negative values in the parameters, and zero.
     * Controllability: assertEquals only allows numeric values as inputs and the conversion method only allows numeric values as inputs and will only output numeric values. We do not need to test non-numeric values.
     */
    @Test
    public void testConvertSec2Hr() {
        assertEquals(0.002778f, Converter.convertSec2Hr(10.0f), 0.001);
        assertEquals(0.0f, Converter.convertSec2Hr(0.0f), 0.001);
        assertEquals(-0.002778f, Converter.convertSec2Hr(-10.0f), 0.001);
    }
}
