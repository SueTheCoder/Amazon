package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.SignInPage;
import utilities.Driver;
import utilities.TestBaseReport;

public class US01_TC01_ValidSignIn extends TestBaseReport {

    SignInPage SignInPage =new SignInPage();

    @Test
    public void valid_Sign_In()  {
         extentTest=extentReports.createTest("Valid Sign In",
              "User can login with a valid username and password");
        SignInPage.goToHomePage();
        SignInPage.signInMenuClick();
        SignInPage.signIn();
        SignInPage.signOut();
        extentTest.pass("User  logged in with a valid username and password");
        Driver.closeDriver();

    }

}
