package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US11_TC01_SignSearchProductWithRateAndAddtoCart extends TestBaseReport {
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
        basePage.filterByRate();
        extentTest.pass("User filtered the searched product by rate and verified that the listed products are suitable for the filter.");
        basePage.addOneProductToCart();
        extentTest.pass("User added one desired products to the cart and verified that the sum of all products in the cart is equal to the cart total.");
        //Driver.closeDriver();
    }


}
