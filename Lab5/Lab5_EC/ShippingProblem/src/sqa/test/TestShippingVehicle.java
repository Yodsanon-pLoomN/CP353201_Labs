package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.ShippingVehicle;

import java.util.List;
import java.util.stream.Stream;

class TestShippingVehicle {
	ShippingVehicle test;

	@BeforeEach
	void setup() {
		test = new ShippingVehicle();
	}

	@ParameterizedTest
	@MethodSource("TC")
	void test_category(int small, int medium, int large, List<Integer> expected) {
		assertEquals(expected, test.calculate(small, medium, large));
	}
	static Stream<Arguments> TC() {
		return Stream.of(
			Arguments.of(0, 0, 0, List.of(0, 0, 0)),
			Arguments.of(0, 0, 99, List.of(99, 0, 0)),
			Arguments.of(0, 199, 0, List.of(0, 199, 0)),
			Arguments.of(499, 0, 0, List.of(0, 0, 499)),
			Arguments.of(0, 99, 49, List.of(49, 99, 0)),
			Arguments.of(249, 99, 0, List.of(0, 99, 249)),
			Arguments.of(149, 69, 34, List.of(34, 69, 149)),
			Arguments.of(0, 0, 101, List.of(-1)),
			Arguments.of(0, 201, 0, List.of(-1)),
			Arguments.of(501, 0, 0, List.of(-1)),
			Arguments.of(0, 101, 50, List.of(-1)),
			Arguments.of(251, 100, 0, List.of(-1)),
			Arguments.of(166, 67, 56, List.of(-1)),
			Arguments.of(0, 0, -1, List.of(-1)),
			Arguments.of(0, -1, 0, List.of(-1)),
			Arguments.of(-1, 0, 0, List.of(-1)),
			Arguments.of(0, -1, -1, List.of(-1)),
			Arguments.of(-1, -1, 0, List.of(-1)),
			Arguments.of(-1, -1, -1, List.of(-1))
		);
	}
}