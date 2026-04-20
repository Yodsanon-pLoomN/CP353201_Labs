package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import sqa.main.Income;

class TestIncome {
	Income test;
	
	@BeforeEach
    void setup() {
        test = new Income();
    }
	
	@ParameterizedTest
	@CsvFileSource(files = "src/sqa/test/resources/EC.csv", numLinesToSkip = 1)
	void test_strong_robust_equivalence(int propeller, int motor, int grille, Double expected) {
		assertEquals(expected, test.calculateIncome(propeller, motor, grille));
	}

}