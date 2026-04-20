import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {
    RomanNumerals converter = new RomanNumerals();

    @Test
    void testI_shouldReturn1() {
        assertEquals(1, converter.convertRomanNumToInt("I"));
    }
    @Test
    void testII_shouldReturn2() {
        assertEquals(2, converter.convertRomanNumToInt("II"));
    }
    @Test
    void testIII_shouldReturn3() {
        assertEquals(3, converter.convertRomanNumToInt("III"));
    }
    @Test
    void testIV_shouldReturn4() {
        assertEquals(4, converter.convertRomanNumToInt("IV"));
    }
    @Test
    void testV_shouldReturn5() {
        assertEquals(5, converter.convertRomanNumToInt("V"));
    }
    @Test
    void testVI_shouldReturn6() {
        assertEquals(6, converter.convertRomanNumToInt("VI"));
    }
    @Test
    void testIX_shouldReturn9() {
        assertEquals(9, converter.convertRomanNumToInt("IX"));
    }
    @Test
    void testX_shouldReturn10() {
        assertEquals(10, converter.convertRomanNumToInt("X"));
    }
    @Test
    void testXX_shouldReturn20() {
        assertEquals(20, converter.convertRomanNumToInt("XX"));
    }
    @Test
    void testXXX_shouldReturn30() {
        assertEquals(30, converter.convertRomanNumToInt("XXX"));
    }
    @Test
    void testXLII_shouldReturn42() {
        assertEquals(42, converter.convertRomanNumToInt("XLII"));
    }
    @Test
    void testLXXIV_shouldReturn74() {
        assertEquals(74, converter.convertRomanNumToInt("LXXIV"));
    }
    @Test
    void testLXXXIV_shouldReturn84() {
        assertEquals(84, converter.convertRomanNumToInt("LXXXIV"));
    }
    @Test
    void testCI_shouldReturn101() {
        assertEquals(101, converter.convertRomanNumToInt("CI"));
    }
    @Test
    void testMCMXCIV_shouldReturn1994() {
        assertEquals(1994, converter.convertRomanNumToInt("MCMXCIV"));
    }
    @Test
    void testEmpty_shouldReturn0() {
        assertEquals(0, converter.convertRomanNumToInt(""));
    }

    @Test
    void testInvalidCharacter_J() {
        assertThrows(NullPointerException.class, () -> converter.convertRomanNumToInt("J"));
    }
    @Test
    void testInvalidCharacter_K() {
        assertThrows(NullPointerException.class, () -> converter.convertRomanNumToInt("K"));
    }

    @Test
    void testWrongRepeatingDigits_VV() {
        assertThrows(IllegalArgumentException.class, () -> converter.convertRomanNumToInt("VV"));
    }
    @Test
    void testWrongRepeatingDigits_LL() {
        assertThrows(IllegalArgumentException.class, () -> converter.convertRomanNumToInt("LL"));
    }

    @Test
    void testMoreThanThreeRepeats_XXXX() {
        assertThrows(IllegalArgumentException.class, () -> converter.convertRomanNumToInt("XXXX"));
    }
    @Test
    void testMoreThanThreeRepeats_IIII() {
        assertThrows(IllegalArgumentException.class, () -> converter.convertRomanNumToInt("IIII"));
    }

    @Test
    void testLowerCaseInput() {
        assertThrows(NullPointerException.class, () -> converter.convertRomanNumToInt("iv"));
    }

    @Test
    void testWrongOrder_XD() {
        assertThrows(IllegalArgumentException.class, () -> converter.convertRomanNumToInt("XD"));
    }
}