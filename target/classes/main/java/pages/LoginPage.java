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

    /**
     *
     * @param login
     * @param password
     */
    public void loginToIMDb (String login, String password){
        openLoginPage();
        openSubLoginPage();
        openSignInWithIMDb();
        enterLogin(login);
        enterPassword(password);
        clickSubmitButton();

    }

    // cхлопнутый метод login на страницу IMDb
    public void logIn(){
        loginToIMDb("maksdanish@gmail.com", "Qwerty12345");
    }

}


