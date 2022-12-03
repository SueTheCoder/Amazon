package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;
import utilities.TestBaseReport;

public class US12_TC01_CheckProductPrice extends TestBaseReport {
    BasePage basePage = new BasePage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US12_TC01_CheckProductPrice Filtered Product Prices ",
                "User can verify that filtered product prices are suitable for filter and price should between $25 and $50");
        basePage.goToHomePage();
        basePage.checkPrice();
        extentTest.pass("User  verified that filtered product prices are suitable for filter and price is between $25 and $50");

    }
}
