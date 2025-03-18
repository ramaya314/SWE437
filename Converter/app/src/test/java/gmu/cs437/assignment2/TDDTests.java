package gmu.cs437.assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;

public class TDDTests {

    @Test
    public void testConvertMphToKph() {
        assertEquals(1.609f, Converter.convertMph2Kph(1.0f), 0.001);
        assertEquals(0.0f, Converter.convertMph2Kph(0.0f), 0.001);
        assertEquals(-1.609f, Converter.convertMph2Kph(-1.0f), 0.001);
    }

    @Test
    public void testConvertKphToMph() {
        assertEquals(0.621f, Converter.convertKph2Mph(1.0f), 0.001);
        assertEquals(0.0f, Converter.convertKph2Mph(0.0f), 0.001);
        assertEquals(-0.621f, Converter.convertKph2Mph(-1.0f), 0.001);
    }

    @Test
    public void testMphToKphConversionExists() {

        String leftUnit = "Miles per hour (Mph)";
        String rightUnit = "Kilometers per hour (Kph)";
        List<Conversion> conversions = Converter.getProgramConversions();

        boolean found = conversions.stream().anyMatch(conv ->
                conv.toString().equals(leftUnit + " -> " + rightUnit) ||
                conv.toString().equals(rightUnit + " -> " + leftUnit)
        );

        assertTrue(found);
    }

}
