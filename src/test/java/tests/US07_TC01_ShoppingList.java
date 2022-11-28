package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US07_TC01_ShoppingList extends TestBaseReport {
    BasePage basePage =new BasePage();
    @Test
    public void test01()
    {
        extentTest=extentReports.createTest("US07_TC01_Create a shopping list.",
                "User can see that there is a create a shopping list link  enable  in amazon basePage.");
        basePage.goToHomePage();
        basePage.signInMenuClick();
        basePage.signIn();
        basePage.createAList();
        extentTest.pass("User saw that there is a create a shopping list link  enable  in amazon basePage.");
    }


}
