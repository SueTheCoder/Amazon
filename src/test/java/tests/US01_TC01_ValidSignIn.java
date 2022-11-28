package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US01_TC01_ValidSignIn extends TestBaseReport {

    BasePage basePage =new BasePage();

    @Test
    public void valid_Sign_In()  {
         extentTest=extentReports.createTest("Valid Sign In",
              "User can login with a valid username and password");
        basePage.goToHomePage();
        basePage.signInMenuClick();
        basePage.signIn();
        basePage.signOut();
        extentTest.pass("User  logged in with a valid username and password");
        //Driver.closeDriver();

    }

}
