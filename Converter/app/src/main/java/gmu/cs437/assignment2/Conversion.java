package gmu.cs437.assignment2;

import java.util.function.Function;

public class Conversion {
    String leftUnit;
    String rightUnit;
    Function<Float, Float> conversion;
    Function<Float, Float> swappedConversion;

    public Conversion(String leftUnit, String rightUnit, Function<Float, Float> conversion, Function<Float, Float> swappedConversion) {
        this.leftUnit = leftUnit;
        this.rightUnit = rightUnit;
        this.conversion = conversion;
        this.swappedConversion = swappedConversion;
    }

    @Override
    public String toString() {
        return leftUnit + " -> " + rightUnit;
    }

    public Conversion GetSwap() {
        return new Conversion(rightUnit, leftUnit, swappedConversion, conversion);
    }
}