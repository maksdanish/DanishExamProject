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



    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
//    public boolean isSignInButtonNotPresent(){
//        return actionsWithOurElements.isElementDisplayed(avatar);
//    }
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
}
