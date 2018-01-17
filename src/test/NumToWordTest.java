import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumToWordTest {

    NumToWord numTest;
    @Before
    public void setUp() {
        numTest = new NumToWord();
    }

    @Test
    public void convertNumberToStringEquivalentOneTest() throws Exception {
        String expected = "OneDollar";
        String actual = numTest.convertNumberToStringEquivalent(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToStringEquivalentTwosTest() throws Exception {
        String expected = "EighteenDollars";
        String actual = numTest.convertNumberToStringEquivalent(18);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToStringEquivalentHundredsTest() throws Exception {
        String expected = "ThreeHundredFiftyDollars";
        String actual = numTest.convertNumberToStringEquivalent(350);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToStringEquivalentThousandsTest() throws Exception {
        String expected = "OneThousandFiveHundredDollars";
        String actual = numTest.convertNumberToStringEquivalent(1500);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToStringEquivalentObeThousandTest() throws Exception {
        String expected = "OneThousandFiveHundredDollars";
        String actual = numTest.convertNumberToStringEquivalent(1000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToStringEquivalentTenThousandsTest() throws Exception {
        String expected = "OneMillionDollars";
        String actual = numTest.convertNumberToStringEquivalent(1000000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToStringEquivalentHundredThousandsTest() throws Exception {
        String expected = "OneBillionDollars";
        String actual = numTest.convertNumberToStringEquivalent(1000000000);
        Assert.assertEquals(expected, actual);
    }

}