package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US05_TC01_FilterByRate extends TestBaseReport {

    @Test
    public void test01() {
        BasePage basePage =new BasePage();
        extentTest=extentReports.createTest("US05_TC01_Filter the searching product by rate, verify that the listed products are suitible for the filter",
                "User can filter the searched product by rate and verify that the listed products are suitable for the filter.");
        basePage.goToHomePage();
        basePage.searchProduct();
        basePage.filterByRate();
        extentTest.pass("User  filtered the searched product by rate and verified that the listed products are suitable for the filter.");
        //Driver.closeDriver();

    }


}
