package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US08_TC01_MultiFilters extends TestBaseReport {
    BasePage basePage = new BasePage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US08_TC01_Verify multiple filters related to the searched product are working at the same time.",
                "User can verify multiple filters related to the searched product are working at the same time.");
        basePage.goToHomePage();
        basePage.multiFilters();
        extentTest.pass("User  verified multiple filters related to the searched product are working at the same time.");

    }
}
