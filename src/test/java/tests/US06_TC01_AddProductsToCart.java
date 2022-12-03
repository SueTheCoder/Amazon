package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import utilities.TestBaseReport;

public class US06_TC01_AddProductsToCart extends TestBaseReport {
    CartPage CartPage = new CartPage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("US06_TC01_Adding more than one products to the cart and verify that the sum of all products in the cart is equal to the cart total.",
                "User can add three desired products to the cart and verify that the sum of all products in the cart is equal to the cart total.");
        CartPage.goToHomePage();
        CartPage.signInMenuClick();
        CartPage.signIn();
        CartPage.addProductsToCart();
        extentTest.pass("User added three desired products to the cart and verified that the sum of all products in the cart is equal to the cart total.");
        //Driver.closeDriver();
    }
}
