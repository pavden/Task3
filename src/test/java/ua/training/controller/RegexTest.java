
package ua.training.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testCommonFirstName() {
        assertTrue("John".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testFirstNameWithTwoWords() {
        assertTrue("Anna-Maria".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testIncorrectFirstName() {
        Assert.assertFalse("William5".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testCommonLastName() {
        Assert.assertTrue("Smith".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testSingleQuoteLastName() {
        Assert.assertTrue("O'Reilly".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testScottishLastName() {
        Assert.assertTrue("McCarny".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testDutchLastName() {
        Assert.assertTrue("Van den Berg".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testCorrectNickname() {
        Assert.assertTrue("peter.pan-junior".matches(Regex.NICKNAME));
    }

    @Test
    public void testIncorrectNickname() {
        Assert.assertFalse("peter@pan".matches(Regex.NICKNAME));
    }

    @Test
    public void testCorrectComment() {
        Assert.assertTrue("Great man!".matches(Regex.COMMENT));
    }

    @Test
    public void testIncorrectComment() {
        Assert.assertFalse("Yo".matches(Regex.COMMENT));
    }

    @Test
    public void testCorrectGroup() {
        Assert.assertTrue("Family".matches(Regex.GROUP));
    }

    @Test
    public void testIncorrectGroup() {
        Assert.assertFalse("Other".matches(Regex.GROUP));
    }

    @Test
    public void testCorrectPhoneNumber() {
        Assert.assertTrue("+380445102030".matches(Regex.PHONE));
    }

    @Test
    public void testIncorrectPhoneNumberWithoutPlus() {
        Assert.assertFalse("1-541-754-3010".matches(Regex.PHONE));
    }

    @Test
    public void testIncorrectPhoneNumberWithParenthesesOrHyphens() {
        Assert.assertFalse("+1(425)555-1212".matches(Regex.PHONE));
    }

    @Test
    public void testCorrectEmail() {
        Assert.assertTrue("john_smith@gmail.com".matches(Regex.EMAIL));
    }

    @Test
    public void testIncorrectEmailWithoutAt() {
        Assert.assertFalse("bob.marley_reggae.com".matches(Regex.EMAIL));
    }

    @Test
    public void testIncorrectEmailStartingWithDot() {
        Assert.assertFalse(".jackson@pop.us".matches(Regex.EMAIL));
    }

    @Test
    public void testCorrectSkype() {
        Assert.assertTrue("donald_trump".matches(Regex.SKYPE));
    }

    @Test
    public void testIncorrectSkypeStartingWithDot() {
        Assert.assertFalse(".albert-gore".matches(Regex.SKYPE));
    }

    @Test
    public void testIncorrectSkypeWithSpace() {
        Assert.assertFalse("george bush".matches(Regex.SKYPE));
    }

    @Test
    public void testCorrectZipCode() {
        Assert.assertTrue("02090".matches(Regex.ZIP_CODE));
    }

    @Test
    public void testIncorrectZipCodeWithLetter() {
        Assert.assertFalse("a0420".matches(Regex.ZIP_CODE));
    }

    @Test
    public void testIncorrectZipCodeLessThenFiveDigits() {
        Assert.assertFalse("0501".matches(Regex.ZIP_CODE));
    }

    @Test
    public void testCorrectCity() {
        String town = "New York";
        Assert.assertTrue(town.matches(Regex.PROPER_NAME));
    }

    @Test
    public void testCorrectCityWithSeveralWords() {
        Assert.assertTrue("Frankfurt am Main".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testIncorrectCityWithNumber() {
        Assert.assertFalse("Dallas7".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testCorrectStreet() {
        Assert.assertTrue("Broadway".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testAnotherCorrectStreet() {
        Assert.assertTrue("Maiden Lane".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testIncorrectStreetWithNumber() {
        Assert.assertFalse("Bowery9".matches(Regex.PROPER_NAME));
    }

    @Test
    public void testCorrectBuilding() {
        Assert.assertTrue("12A".matches(Regex.BUILDING));
    }

    @Test
    public void testAnotherCorrectBuilding() {
        Assert.assertTrue("8/14".matches(Regex.BUILDING));
    }

    @Test
    public void testIncorrectBuildingWithThousandNumber() {
        Assert.assertFalse("1000".matches(Regex.BUILDING));
    }

    @Test
    public void testIncorrectBuildingStartingWithLetter() {
        Assert.assertFalse("B38".matches(Regex.BUILDING));
    }

    @Test
    public void testCorrectApartment() {
        Assert.assertTrue("120".matches(Regex.APARTMENT));
    }

    @Test
    public void testIncorrectApartmentWithLetter() {
        Assert.assertFalse("85C".matches(Regex.APARTMENT));
    }

    @Test
    public void testIncorrectApartmentWithThousandNumber() {
        Assert.assertFalse("1000".matches(Regex.APARTMENT));
    }

    @Test
    public void testIncorrectApartmentWithDot() {
        Assert.assertFalse("22.".matches(Regex.APARTMENT));
    }

}
