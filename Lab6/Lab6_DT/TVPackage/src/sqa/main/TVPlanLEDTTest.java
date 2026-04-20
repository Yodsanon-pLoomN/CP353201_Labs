package sqa.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.TVPlan.TVPackage;

class TVPlanLEDTTest {
	TVPlan TVPlantest;

	@ParameterizedTest
	@CsvFileSource(files = "src/sqa/main/resources/LEDT.csv", numLinesToSkip = 1)
	void test_Limited_Entry_Decision_Table(boolean standard, boolean premium, boolean family, boolean offline_watching, boolean live_service, boolean discount, double totalPrice) {
	    TVPackage selectedPackage = null;
	    
		if (standard == true) {
			selectedPackage = TVPackage.STANDARD;
		}else if (premium == true) {
			selectedPackage = TVPackage.PREMIUM;
		}else if (family == true) {
			selectedPackage = TVPackage.FAMILY;
		}
		
		TVPlantest = new TVPlan(offline_watching, live_service, discount);
		assertEquals(totalPrice, TVPlantest.pricePerMonth(selectedPackage));
	}

}