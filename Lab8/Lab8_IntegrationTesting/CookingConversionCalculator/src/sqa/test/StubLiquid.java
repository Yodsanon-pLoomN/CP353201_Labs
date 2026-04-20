// นายยศนนท์ ดวงไข 663380021-5 Sec 1
package sqa.test;

import sqa.main.LiquidVolumeConverter;

public class StubLiquid extends LiquidVolumeConverter {
	
	//from cup to ml
	@Override
	public double convert(double liquidValue, String fromUnit, String toUnit) {
		return 1000.0;
	}
	
	//from cup to ml
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 250.0;
	}

}