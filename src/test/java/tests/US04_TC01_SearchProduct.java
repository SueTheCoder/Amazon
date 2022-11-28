package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US04_TC01_SearchProduct extends TestBaseReport {
    BasePage basePage = new BasePage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US04_TC01_Searching a product and verify the all listed products contain searching keyword",
                "User can search a product and verify the all listed products contain searched keyword.");

        basePage.goToHomePage();
        basePage.searchProduct();
        extentTest.pass("User  searched a product and verified the all listed products contain searched keyword.");
        //Driver.closeDriver();
    }


}
