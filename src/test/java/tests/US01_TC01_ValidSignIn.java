package tests;

import org.testng.annotations.Test;
import pages.Page;
import utilities.Driver;
import utilities.TestBaseReport;

public class US01_TC01_ValidSignIn extends TestBaseReport {

    Page page=new Page();

    @Test
    public void valid_Sign_In()  {
         extentTest=extentReports.createTest("Valid Sign In",
              "User can login with a valid username and password");
        page.goToHomePage();
        page.signInMenuClick();
        page.signIn();
        page.signOut();
        extentTest.pass("User  logged in with a valid username and password");
        Driver.closeDriver();

    }

}
