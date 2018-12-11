package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy(xpath = "//a[contains(.,'DanishTest')]")
    WebElement nickName;

    @FindBy(xpath = "//textarea[@id='list-create-name']")
    WebElement listTitle;

    @FindBy(xpath = "//a[@href='/user/ur95111316/lists'][contains(.,'Lists')]")
    WebElement ourList;

    @FindBy(xpath = "//a[contains(.,'Your Account')]")
    WebElement yourAccountButton;

    @FindBy(xpath = "(//a[contains(.,'Watchlist')])[1]")
    WebElement watchListButton;

    @FindBy(xpath = "//input[contains(@id,'navbar-query')]")
    WebElement searchBar;

    @FindBy(xpath = "//button[@id='navbar-submit-button']")
    WebElement lookupButton;



    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isLoginSuccessfull () {
        return actionsWithOurElements.isElementDisplayed(nickName);
    }


    public void clickOnNickName() {
        actionsWithOurElements.clickOnElement(nickName);

    }

    public void clickOnOurList() {
        actionsWithOurElements.clickOnElement(ourList);
    }

    public void clickYourAccount() {
        actionsWithOurElements.clickOnElement(yourAccountButton);
    }

    public void clickWatchList() {
        actionsWithOurElements.clickOnElement(watchListButton);
    }

    public void searchMovie(String movie) {
        actionsWithOurElements.enterTextInToElement(searchBar, movie);
    }

    public void clickLookUp() {
        actionsWithOurElements.clickOnElement(lookupButton);
    }
}
