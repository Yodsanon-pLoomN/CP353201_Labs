package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.CountWordClumps;

class CountWordClumpsTest {
	CountWordClumps CountWordClumpsTest;

	@BeforeEach
	void setup() {
		CountWordClumpsTest = new CountWordClumps();
	}

	@ParameterizedTest
	@MethodSource("provideArraysForCountClumps")
	void test_Branch_and_Condition_Coverage(int[] nums, int expected) {
		assertEquals(expected, CountWordClumps.countClumps(nums));
	}

	static Stream<Arguments> provideArraysForCountClumps() {
		return Stream.of(
				Arguments.of(null, 0),
				Arguments.of(new int[] {}, 0),
				Arguments.of(new int[] {1}, 0),
				Arguments.of(new int[] {2, 2}, 1),
				Arguments.of(new int[] {3, 4}, 0),
				Arguments.of(new int[] {5, 6, 6}, 1)
		);
	}
}