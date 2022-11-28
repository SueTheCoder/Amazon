package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US02_TC02_InvalidPasswordSignIn extends TestBaseReport {
    BasePage basePage =new BasePage();

    @Test
    public void invalid_Password_SignIn() {
        extentTest=extentReports.createTest("US02_TC02_InValid Email Sign In",
                "User cannot login with a valid username and invalid password");
        basePage.goToHomePage();
        basePage.signInMenuClick();
        basePage.invalid_password_signIn();
        extentTest.pass("User did not logged in with a invalid password ");
        //Driver.closeDriver();
    }
}
