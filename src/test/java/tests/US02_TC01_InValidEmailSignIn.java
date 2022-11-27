package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseReport;

public class US02_TC01_InValidEmailSignIn extends TestBaseReport {
    Page page=new Page();

    @Test
    public void invalid_Sign_In()  {
        extentTest=extentReports.createTest("US02_TC_01_InValid Email Sign In",
                "User cannot login with a invalid username ");
        page.goToHomePage();
        page.signInMenuClick();
        page.invalid_email_signIn();
        extentTest.pass("User did not logged in with a invalid username ");
        Driver.closeDriver();

    }
}
