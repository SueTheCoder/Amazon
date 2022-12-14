package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

import java.util.List;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement menu;

    @FindBy(id = "nav-flyout-ya-signin")
    public WebElement signInButton;

    @FindBy(id = "ap_email")
    public WebElement input_email;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement input_password;

    @FindBy(id = "signInSubmit")
    public WebElement signInSubmit;

    @FindBy(id = "auth-error-message-box")
    public WebElement problemText;

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allMenusButton;

    @FindBy(linkText = "Amazon Music")
    public WebElement amazonMusicMenuLink;

    @FindBy(xpath = "//*[text()='stream music']")
    public WebElement streamMusicText;

    @FindBy(linkText = "Kindle E-readers & Books")
    public WebElement amazonBooksMenuLink;

    @FindBy(xpath = "//*[text()='kindle e-readers']")
    public WebElement booksTitleText;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> wirelessMouseProducts;

    @FindBy(xpath = "//*[@class='a-icon a-icon-star-medium a-star-medium-4']")
    public WebElement fiveStarFilter;

    @FindBy(xpath = "//*[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']")
    public List<WebElement> fiveStarFilterProducts;

    @FindBy(xpath = "(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")
    public WebElement wirelessMouseFirstProduct;

    @FindBy(xpath = "(//*[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
    public WebElement babyShoeFirstProduct;

    @FindBy(xpath = "(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")
    public WebElement airHeadPhoneFirstProduct;

    @FindBy(xpath = "//*[text()='$25 to $50']")
    public WebElement priceFilter25to50;

    @FindBy(xpath = "//*[@value='50']")
    public WebElement priceFilter50Value;

    @FindBy(xpath = "//*[text()='Clear']")
    public WebElement priceFilterClear;

    @FindBy(id = "submit.add-to-cart")
    public WebElement addToCartButton;

    @FindBy(id = "nav-cart-count")
    public WebElement showCartButton;

    @FindBy(id = "nav-cart-count-container")
    public WebElement goToCartButton;


    @FindBy(id = "sc-subtotal-label-activecart")
    public WebElement cartItemSubTotalText;

    @FindBy(id = "attach-close_sideSheet-link")
    public WebElement closeCartButton;

    @FindBy(xpath = "//*[text()='Create a List']")
    public WebElement createListLink;

    @FindBy(id = "createList")
    public WebElement createAListButton;

    @FindBy(id = "nav-item-signout")
    public WebElement signOutClick;

    @FindBy(id = "attachSiNoCoverage")
    public WebElement noThanks;

    //List<WebElement> amazonMusicMenuElements=Driver.getDriver().findElements(By.xpath("//*[@class='hmenu-item']"));

    public void goToHomePage() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().navigate().refresh();
    }

    public void signInMenuClick() {
        waitFor(3);
        action.moveToElement(menu).perform();
        waitFor(3);
        jse.executeScript("document.getElementById('nav-flyout-ya-signin').setAttribute('style','border:2x solid red;background:blue');");
        action.click(signInButton).perform();
        waitFor(3);
    }

    public void signIn() {
        Log.startTestCase("valid sign in");
        jse.executeScript("document.getElementById('ap_email').setAttribute('style','border:2x solid red;background:yellow');");
        input_email.sendKeys(ConfigReader.getProperty("validemail"));
        waitFor(4);
        jse.executeScript("document.getElementById('continue').setAttribute('style','border:2x solid red;background:blue');");
        continueButton.click();
        waitFor(4);
        jse.executeScript("document.getElementById('ap_password').setAttribute('style','border:2x solid red;background:yellow');");
        input_password.sendKeys(ConfigReader.getProperty("validpassword"));
        waitFor(3);
        jse.executeScript("document.getElementById('signInSubmit').setAttribute('style','border:2x solid red;background:blue');");
        signInSubmit.click();
        waitFor(3);
        Assert.assertTrue(menu.getText().contains("tester"));
        Log.info("login process is successful");
        Log.endTestCase("valid sign in");

    }

    public void signOut() {
        waitFor(3);
        action.moveToElement(menu).perform();
        waitFor(3);
        jse.executeScript("document.getElementById('nav-item-signout').setAttribute('style','border:2x solid red;background:blue');");
        action.click(signOutClick).perform();
        waitFor(3);
        Log.info("sign out is successful");
    }

    public void invalid_email_signIn() {
        Log.startTestCase("invalid_email_signIn");
        jse.executeScript("document.getElementById('ap_email').setAttribute('style','border:2x solid red;background:red');");
        input_email.sendKeys(ConfigReader.getProperty("invalidemail"));
        waitFor(5);
        continueButton.click();
        waitFor(5);
        Assert.assertTrue(problemText.isDisplayed());
        Log.info("user can not sign in with invalid mail");
        Log.endTestCase("invalid_email_signIn");

    }

    public void invalid_password_signIn() {
        Log.startTestCase("invalid_password_signIn");
        jse.executeScript("document.getElementById('ap_email').setAttribute('style','border:2x solid red;background:red');");
        waitFor(5);
        input_email.sendKeys(ConfigReader.getProperty("validemail"));
        waitFor(5);
        continueButton.click();
        waitFor(5);
        jse.executeScript("document.getElementById('ap_password').setAttribute('style','border:2x solid red;background:red');");
        input_password.sendKeys(ConfigReader.getProperty("invalidpassword"));
        waitFor(5);
        signInSubmit.click();
        waitFor(5);
        Assert.assertTrue(problemText.isDisplayed());
        Log.info("user can not sign in with invalid password");
        Log.endTestCase("invalid_password_signIn");

    }

    public void amazonMusicMenu() {
        Log.startTestCase("amazonMusicMenu");
        waitFor(3);
        jse.executeScript("document.getElementById('nav-hamburger-menu').setAttribute('style','border:2x solid red;background:blue');");
        allMenusButton.click();
        waitFor(3);
        jse.executeScript("document.getElementById('hmenu-content').setAttribute('style','border:2x solid red;background:blue');");
        amazonMusicMenuLink.click();
        waitFor(3);
        Assert.assertTrue(streamMusicText.isDisplayed());
        Log.info("Music menu is OK");
        Log.endTestCase("amazonMusicMenu");

    }

    public void amazonBooksMenu() {
        Log.startTestCase("amazonComputersMenu");
        waitFor(5);
        jse.executeScript("document.getElementById('nav-hamburger-menu').setAttribute('style','border:2x solid red;background:blue');");
        allMenusButton.click();
        waitFor(3);
        jse.executeScript("document.getElementById('hmenu-content').setAttribute('style','border:2x solid red;background:blue');");
        amazonBooksMenuLink.click();
        waitFor(2);
        Assert.assertTrue(booksTitleText.isDisplayed());
        Log.info(" Books Menu is OK");
        Log.endTestCase("amazonBooksMenu");
    }

    public void searchProduct() {
        Log.startTestCase("searchProduct");
        waitFor(4);
        jse.executeScript("document.getElementById('twotabsearchtextbox').setAttribute('style','border:2x solid red;background:yellow');");
        waitFor(4);
        searchBox.click();
        waitFor(4);
        searchBox.sendKeys(ConfigReader.getProperty("firstproductname") + Keys.ENTER);
        waitFor(4);
        List<WebElement> wirelessMouseList = wirelessMouseProducts;

        for (WebElement w : wirelessMouseList) {
            Assert.assertTrue((w.getText().contains(ConfigReader.getProperty("expectedWord_1")))
                    && (w.getText().contains(ConfigReader.getProperty("expectedWord_2"))));
        }
        Log.info(" Search process is OK");
        Log.endTestCase("searchProduct");
    }

    public void filterByRate() {
        Log.startTestCase("filterByRate");
        jse.executeScript("document.getElementById('p_72/1248879011').setAttribute('style','border:2x solid red;background:blue');");
        waitFor(4);
        fiveStarFilter.click();
        waitFor(4);
        List<WebElement> upFourStarProducts = fiveStarFilterProducts;
        waitFor(4);
        for (int i = 0; i < 27; i++) {
            Assert.assertTrue(upFourStarProducts.get(i).isDisplayed());
        }
        Log.info(" Filter by Rate process is OK");
        Log.endTestCase("filterByRate");
    }

    public void addProductsToCart() {
        Log.startTestCase("addProductsToCart");
        searchBox.sendKeys(ConfigReader.getProperty("firstproductname"), Keys.ENTER);
        waitFor(2);
        wirelessMouseFirstProduct.click();
        waitFor(2);
        jse.executeScript("document.getElementById('submit.add-to-cart').setAttribute('style','border:2x solid red;background:red');");
        addToCartButton.click();
        waitFor(2);
        //noThanks.click();
        //closeCartButton.click();
        //waitFor(2);
        searchBox.clear();
        searchBox.sendKeys(ConfigReader.getProperty("secondproductname"), Keys.ENTER);
        babyShoeFirstProduct.click();
        waitFor(2);
        jse.executeScript("document.getElementById('submit.add-to-cart').setAttribute('style','border:2x solid red;background:red');");
        addToCartButton.click();
        waitFor(2);
        searchBox.clear();
        searchBox.sendKeys(ConfigReader.getProperty("thirdproductname"), Keys.ENTER);
        airHeadPhoneFirstProduct.click();
        waitFor(2);
        addToCartButton.click();
        noThanks.click();
        //closeCartButton.click();
        waitFor(2);
        showCartButton.click();
        String expectedCartTotal = ConfigReader.getProperty("cartTotal");
        String actualCartTotal = cartItemSubTotalText.getText();
        Assert.assertEquals(expectedCartTotal, actualCartTotal);
        waitFor(2);
        Log.info("user can add product to cart");
        Log.endTestCase("addProductsToCart");

    }

    public void addOneProductToCart() {
        Log.startTestCase("addProductsToCart");
        searchBox.sendKeys(ConfigReader.getProperty("firstproductname"), Keys.ENTER);
        wirelessMouseFirstProduct.click();
        waitFor(2);
        jse.executeScript("document.getElementById('submit.add-to-cart').setAttribute('style','border:2x solid red;background:blue');");
        waitFor(2);
        addToCartButton.click();
        waitFor(2);
        //noThanks.click();
        goToCartButton.click();
//        closeCartButton.click();
        waitFor(2);
        showCartButton.click();
        String expectedCartTotal = ConfigReader.getProperty("cartTotal1");
        String actualCartTotal = cartItemSubTotalText.getText();
        Assert.assertEquals(expectedCartTotal, actualCartTotal);
        waitFor(2);
        Log.info("user can add product to cart");
        Log.endTestCase("addProductsToCart");

    }


    public void createAList() {
        Log.startTestCase("shopping list");
        action.moveToElement(menu).perform();
        waitFor(2);
        action.click(createListLink).perform();
        waitFor(2);
        action.sendKeys(Keys.ESCAPE).perform();
        Assert.assertTrue(createAListButton.isDisplayed());
        waitFor(2);
        action.moveToElement(menu).click(signOutClick).perform();
        Log.info("user can create own shopping list");
        Log.endTestCase("shopping list");
    }

    public void multiFilters() {
        Log.startTestCase("multiFilters");
        searchBox.sendKeys(ConfigReader.getProperty("filterSearchProductName"), Keys.ENTER);
        waitFor(4);
        jse.executeScript("document.getElementById('p_72/1248879011').setAttribute('style','border:2x solid red;background:red');");
        fiveStarFilter.click();
        waitFor(4);
        jse.executeScript("document.getElementById('p_36/1253504011').setAttribute('style','border:2x solid red;background:red');");
        priceFilter25to50.click();
        waitFor(4);
        Assert.assertTrue(priceFilter50Value.isDisplayed()
                && priceFilterClear.isDisplayed());
        waitFor(4);
        Log.info(" user can use multi filters, while searching");
        Log.endTestCase("multiFilters");
    }


    public void checkPrice() {
        Log.startTestCase("checkingPriceAProduct");
        searchBox.sendKeys(ConfigReader.getProperty("filterSearchProductName"), Keys.ENTER);
        waitFor(2);
        priceFilter25to50.click();
        Assert.assertTrue(priceFilter50Value.isDisplayed());
        waitFor(2);
        int actualFirstProductPrice = Integer.parseInt(Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText());
        System.out.println("actualFirstProductPrice = " + actualFirstProductPrice);
        Assert.assertTrue(actualFirstProductPrice > 25 && actualFirstProductPrice < 50);
        Log.info(" user can validate that filtered product prices are suitable for filter");
        Log.endTestCase("checkingPriceAProduct");
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
