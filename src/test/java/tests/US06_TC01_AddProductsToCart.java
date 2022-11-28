package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US06_TC01_AddProductsToCart extends TestBaseReport {
    BasePage basePage =new BasePage();
    @Test
    public void test01()  {
        extentTest=extentReports.createTest("US06_TC01_Adding more than one products to the cart and verify that the sum of all products in the cart is equal to the cart total.",
                "User can add three desired products to the cart and verify that the sum of all products in the cart is equal to the cart total.");

        basePage.goToHomePage();
        basePage.addProductsToCart();
        extentTest.pass("User added three desired products to the cart and verified that the sum of all products in the cart is equal to the cart total.");
        //Driver.closeDriver();
    }
}
