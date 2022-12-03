package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.SignInPage;
import utilities.TestBaseReport;

public class US02_TC02_InvalidPasswordSignIn extends TestBaseReport {
    SignInPage SignInPage =new SignInPage();

    @Test
    public void invalid_Password_SignIn() {
        extentTest=extentReports.createTest("US02_TC02_InValid Email Sign In",
                "User cannot login with a valid username and invalid password");
        SignInPage.goToHomePage();
        SignInPage.signInMenuClick();
        SignInPage.invalid_password_signIn();
        extentTest.pass("User did not logged in with a invalid password ");
        //Driver.closeDriver();
    }
}
