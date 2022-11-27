package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseReport;

public class US02_TC02_InvalidPasswordSignIn extends TestBaseReport {
    Page page=new Page();

    @Test
    public void invalid_Password_SignIn() {
        extentTest=extentReports.createTest("US02_TC02_InValid Email Sign In",
                "User cannot login with a valid username and invalid password");
        page.goToHomePage();
        page.signInMenuClick();
        page.invalid_password_signIn();
        extentTest.pass("User did not logged in with a invalid password ");
        Driver.closeDriver();
    }
}
