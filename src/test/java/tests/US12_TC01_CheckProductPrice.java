package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.Driver;
import utilities.TestBaseReport;

public class US12_TC01_CheckProductPrice extends TestBaseReport {
    BasePage basePage =new BasePage();
    @Test
    public void test01()  {
        extentTest = extentReports.createTest("US08_TC01_Verify multiple filters related to the searched product are working at the same time.",
                "User can verify multiple filters related to the searched product are working at the same time.");
        basePage.goToHomePage();
        basePage.checkPriceBetween25to50();
        extentTest.pass("User  verified multiple filters related to the searched product are working at the same time.");
        Driver.closeDriver();
    }
}
