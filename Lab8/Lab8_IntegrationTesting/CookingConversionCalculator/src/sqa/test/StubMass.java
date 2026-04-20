// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;

import sqa.main.MassConverter;

public class StubMass extends MassConverter {

	//from tablespoon to gram
	@Override
	public double convert(double massValue, String fromUnit, String toUnit) {
		return 80.0;
	}
	
	//from tablespoon to gram
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 8.0;
	}

}