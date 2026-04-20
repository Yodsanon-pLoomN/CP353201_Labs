package sqa.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.TVPlan.TVPackage;

class TVPlanEEDTTest {
	TVPlan TVPlantest;

	@ParameterizedTest
	@CsvFileSource(files = "src/sqa/main/resources/EEDT.csv", numLinesToSkip = 1)
	void test_Extended_Entry_Decision_Table(String mainPackage, String additionalPackage, boolean discount, double totalPrice) {
		boolean offline_watching = false;
		boolean live_service = false;
		TVPackage selectedPackage = null;
		
		if (mainPackage.equals("M1")) {
			selectedPackage = TVPackage.STANDARD;
		}else if (mainPackage.equals("M2")) {
			selectedPackage = TVPackage.PREMIUM;
		}else if (mainPackage.equals("M3")) {
			selectedPackage = TVPackage.FAMILY;
		}
		
		if (additionalPackage.equals("A1")) {
			offline_watching = true;
		}else if (additionalPackage.equals("A2")) {
			live_service = true;
		}else if (additionalPackage.equals("A3")) {
			offline_watching = true;
			live_service = true;
		}
		
		TVPlantest = new TVPlan(offline_watching, live_service, discount);
		assertEquals(totalPrice, TVPlantest.pricePerMonth(selectedPackage));
	}

}