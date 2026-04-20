// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;

import sqa.main.TemperatureConverter;

public class StubTemperature extends TemperatureConverter {

	//from fahrenheit to celsius
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return 10.0;
	}

}