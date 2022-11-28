package tests;

import org.testng.annotations.Test;
import pages.BasePage;
import utilities.TestBaseReport;

public class US03_TC01_AmazonMusicMenu  extends TestBaseReport {
    BasePage basePage =new BasePage();
    @Test
    public void test01()  {
        extentTest=extentReports.createTest("US03_TC01_Verify the number of menus under each category",
                "User can verify the number of menus under Amazon Music menu ");
        basePage.goToHomePage();
        basePage.amazonMusicMenu();
        extentTest.pass("User  saw there are two sub-menus as Stream Music and Buy Music under 'Amazon Music'  menu ");
        //Driver.closeDriver();
    }


}
