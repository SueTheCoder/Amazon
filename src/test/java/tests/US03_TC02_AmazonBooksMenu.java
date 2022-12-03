package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.MenuPage;
import utilities.TestBaseReport;

public class US03_TC02_AmazonBooksMenu extends TestBaseReport {
    MenuPage menuPage = new MenuPage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US03_TC01_Verify the number of menus under each category",
                "User can verify the number of menus under Books title.");
        menuPage.goToHomePage();
        menuPage.amazonBooksMenu();
        extentTest.pass("User saw that there are fourteen sub-titles under 'Books' title");
        //Driver.closeDriver();
    }
}
