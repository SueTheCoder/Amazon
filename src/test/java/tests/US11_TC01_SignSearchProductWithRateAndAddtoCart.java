package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import utilities.TestBaseReport;

public class US11_TC01_SignSearchProductWithRateAndAddtoCart extends TestBaseReport {

    CartPage CartPage = new CartPage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US11_TC01_SignSearchProductWithRateAndAddtoCart a product and verify the all listed products contain searching keyword",
                "User can search a product and verify the all listed products contain searched keyword and user can add to their cart.");
        CartPage.goToHomePage();
        CartPage.signInMenuClick();
        CartPage.signIn();
        CartPage.searchProduct();
        extentTest.pass("User searched a product and verified the all listed products contain searched keyword.");
        CartPage.filterByRate();
        extentTest.pass("User filtered the searched product by rate and verified that the listed products are suitable for the filter.");
        CartPage.addOneProductToCart();
        extentTest.pass("User added one desired products to the cart and verified that the sum of all products in the cart is equal to the cart total.");
        //Driver.closeDriver();
    }


}
