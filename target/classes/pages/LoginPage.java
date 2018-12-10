package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {


    @FindBy(xpath = "//input[@id='ap_email']")
    WebElement inputLogin;

    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement inputPassword;


    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement submit;

    @FindBy(xpath = "//a[@id='nblogin']")
    WebElement otherSignIn;
    
    @FindBy(xpath = "//span[contains(.,'Sign in with IMDb')]")
    WebElement signInWithIMDb;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void openLoginPage() {
        try {
            webDriver.get("https://www.imdb.com");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.info("Can not open Login Page");
            Assert.fail("Can not open Login Page");
        }
    }

    public void openSubLoginPage() {
        actionsWithOurElements.clickOnElement(otherSignIn);

    }

    
    public void openSignInWithIMDb() {
        actionsWithOurElements.clickOnElement(signInWithIMDb);
    }

    public void enterLogin(String login) {
        actionsWithOurElements.enterTextInToElement(inputLogin, login);
    }

    public void enterPassword(String password) {
        actionsWithOurElements.enterTextInToElement(inputPassword, password);
    }

    public void clickSubmitButton() {
        actionsWithOurElements.clickOnElement(submit);
    }

    public void loginToIMDb (String login, String password){
        openLoginPage();
        openSubLoginPage();
        openSignInWithIMDb();
        enterLogin(login);
        enterPassword(password);
        clickSubmitButton();



    }


//    public void enterLogin(String login) {
//        actionsWithOurElements.enterTextInToElement(inputLogin, login);
//    }
//
//    public void enterPassword(String password) {
//        actionsWithOurElements.enterTextInToElement(inputPassword, password);
//    }
//
//
//    public void clickOnElement(WebElement element) {
//        try {
//            element.click();
//            logger.info("Element was clicked");
//
//        }catch (Exception e){
//            logger.error("Cannot work with element" + e);
//            Assert.fail("Cannot work with element" + e);
//
//        }
//
//    }
//    public void loginInToApp(String login, String password){
//        openLoginPage();
//        enterLogin(login);
//        enterPassword(password);
//        clickSubmitButton();
//
//    }
//
//   public void clickSubmitButton() {
//       actionsWithOurElements.clickOnElement(submit);
//    }


    //    public boolean isButtonVhodDisplayed(){
//        return actionsWithOurElements.isElementDisplayed(submit);
//    }
//    public void validLoginInToApp(){
//        loginInToApp("Student", "909090");
//        HomePage homePage = new HomePage(webDriver);
//        homePage.isAvatarDisplayed();
//
//
//    }




}
//end

