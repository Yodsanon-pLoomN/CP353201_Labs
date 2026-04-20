// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;

import sqa.main.CookingConversionCalculator;

public class StubCooking extends CookingConversionCalculator{
	
	//41, temp, fahrenheit, celsius
	@Override
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		return 5.0;
	}

}