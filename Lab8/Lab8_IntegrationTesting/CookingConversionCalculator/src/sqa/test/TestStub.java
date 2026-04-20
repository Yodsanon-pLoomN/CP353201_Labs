// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestStub {


    @Test
    void test01_Cooking_convert() {
        StubCooking stub = new StubCooking();
        double expectedResult = 5.0;
        assertEquals(expectedResult, stub.convert(41, "temperature", "fahrenheit", "celsius"));
    }

    @Test
    void test02_Liquid_convert() {
        StubLiquid stub = new StubLiquid();
        double expectedResult = 1000.0;
        assertEquals(expectedResult, stub.convert(4, "cup", "ml"));
    }

    @Test
    void test03_Liquid_convert_and_getFactor() {
        StubLiquid stub = new StubLiquid();
        double expectedConvert = 1000.0;
        double expectedFactor = 250.0;

        assertEquals(expectedConvert, stub.convert(4, "cup", "ml"));
        assertEquals(expectedFactor, stub.getConversionFactor("cup", "ml"));
    }

    @Test
    void test04_Liquid_getConversionFactor() {
        StubLiquid stub = new StubLiquid();
        double expectedResult = 250.0;
        assertEquals(expectedResult, stub.getConversionFactor("cup", "ml"));
    }

    @Test
    void test05_Mass_convert() {
        StubMass stub = new StubMass();
        double expectedResult = 80.0;
        assertEquals(expectedResult, stub.convert(10, "tablespoon", "gram"));
    }

    @Test
    void test06_Mass_convert_and_getFactor() {
        StubMass stub = new StubMass();
        double expectedConvert = 80.0;
        double expectedFactor = 8.0;

        assertEquals(expectedConvert, stub.convert(10, "tablespoon", "gram"));
        assertEquals(expectedFactor, stub.getConversionFactor("tablespoon", "gram"));
    }

    @Test
    void test07_Mass_getConversionFactor() {
        StubMass stub = new StubMass();
        double expectedResult = 8.0;
        assertEquals(expectedResult, stub.getConversionFactor("tablespoon", "gram"));
    }

    @Test
    void test08_Temperature_convert() {
        StubTemperature stub = new StubTemperature();
        double expectedResult = 10.0;
        assertEquals(expectedResult, stub.convert(50.0, "fahrenheit", "celsius"));
    }


}
