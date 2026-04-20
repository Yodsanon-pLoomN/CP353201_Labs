// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;

import sqa.main.*;

public class Driver {

    private static double originalValue;
    private static double convertedValue;
    private static String from;
    private static String to;

    public static void main(String[] args) {

        // ตัวอย่างการใช้ CookingConversionCalculator
        CookingConversionCalculator cooking = new CookingConversionCalculator();
        originalValue = 10.0;

        // LiquidVolumeConverter
        String choiceLiquid = "liquid";
        from = "teaspoon";
        to = "ml";
        System.out.println("CookingConversionCalculator");
        System.out.printf("convert from %s to %s by LiquidVolumeConverter\n", from, to);
        convertedValue = cooking.convert(originalValue, choiceLiquid, from, to);
        System.out.printf("%.2f %s = %.2f %s\n", originalValue, from, convertedValue, to);

        // MassConverter
        String choiceMass = "mass";
        from = "oz";
        to = "gram";
        System.out.println("\nconvert from " + from + " to " + to + " by MassConverter");
        convertedValue = cooking.convert(originalValue, choiceMass, from, to);
        System.out.printf("%.2f %s = %.2f %s\n", originalValue, from, convertedValue, to);

        // TemperatureConverter
        String choiceTemp = "temperature";
        from = "celsius";
        to = "fahrenheit";
        System.out.println("\nconvert from " + from + " to " + to + " by TemperatureConverter");
        convertedValue = cooking.convert(originalValue, choiceTemp, from, to);
        System.out.printf("%.2f %s = %.2f %s\n", originalValue, from, convertedValue, to);
        // ทดสอบกับ LiquidVolumeConverter โดยตรง
        LiquidVolumeConverter liquid = new LiquidVolumeConverter();
        originalValue = 10.0;
        from = "pint";
        to = "ml";
        System.out.println("\nLiquidVolumeConverter");
        System.out.printf("convert from %s to %s\n", from, to);
        convertedValue = liquid.convert(originalValue, from, to);
        System.out.printf("%.2f %s = %.2f %s\n", originalValue, from, convertedValue, to);

        System.out.println("-----------------------------------------------------------------");

        // ทดสอบกับ MassConverter โดยตรง
        MassConverter mass = new MassConverter();
        originalValue = 50.0;
        from = "kilogram";
        to = "pound";
        System.out.println("\nMassConverter");
        System.out.printf("convert from %s to %s\n", from, to);
        convertedValue = mass.convert(originalValue, from, to);
        System.out.printf("%.2f %s = %.2f %s\n", originalValue, from, convertedValue, to);

        System.out.println("-----------------------------------------------------------------");

     // ทดสอบกับ TemperatureConverter โดยตรง
        TemperatureConverter temp = new TemperatureConverter();
        originalValue = 50.0;
        from = "celsius";
        to = "fahrenheit";
        System.out.println("\nTemperatureConverter");
        System.out.printf("convert from %s to %s\n", from, to);
        convertedValue = temp.convert(originalValue, from, to);
        System.out.printf("%.2f %s = %.2f %s\n", originalValue, from, convertedValue, to);
    }
}