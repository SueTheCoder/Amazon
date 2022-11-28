package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US09_TC01_SignAndSearchProduct extends TestBaseReport {
    BasePage basePage = new BasePage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US04_TC01_Searching a product and verify the all listed products contain searching keyword",
                "User can search a product and verify the all listed products contain searched keyword.");
        basePage.goToHomePage();
        basePage.signInMenuClick();
        basePage.signIn();
        basePage.searchProduct();
        extentTest.pass("User searched a product and verified the all listed products contain searched keyword.");
        //Driver.closeDriver();
    }


}
