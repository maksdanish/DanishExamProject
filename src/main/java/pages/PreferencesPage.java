package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreferencesPage extends ParentPage {

    @FindBy(xpath = "//a[@href='/preferences/general'][contains(.,'Content settings')]")
    WebElement contentSettingButton;

    @FindBy(xpath = "//select[@name='ttco']")
    WebElement regionDD;

    @FindBy(xpath = "//select[@name='ttla']")
    WebElement languageDD;

    @FindBy(xpath = "//input[@id='nmdp']")
    WebElement checkBoxCredits;

    @FindBy(xpath = "//select[@name='nmec']")
    WebElement numberToDisplay;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//a[@href='/preferences/reviews'][contains(.,'Privacy settings')]")
    WebElement privacySettingButton;

    @FindBy(xpath = "//input[@name='reviews-share-votes']")
    WebElement ratingCheckBox;

    @FindBy(xpath = "//input[@value='Save']")
    WebElement saveRatingButton;
    private String location;


    public PreferencesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickContentSetting() {
        actionsWithOurElements.clickOnElement(contentSettingButton);
    }

    public void selectDisplayCountry(String TitleCountry) {
        actionsWithOurElements.selectTextInDD(regionDD, TitleCountry);

    }

    public void selectDisplayLanguage(String language) {
        actionsWithOurElements.selectTextInDD(languageDD,language );

    }

    public void checkBoxDisplayCredits() {
        actionsWithOurElements.clickOnElement(checkBoxCredits);
    }

    public void selectEpisodesToDisplayInDD(String quantity) {
        actionsWithOurElements.selectTextInDD(numberToDisplay, quantity);
    }

    public void clickSubmitButton() {
        actionsWithOurElements.clickOnElement(submitButton);
    }

    public void clickPrivacySetting() {
        actionsWithOurElements.clickOnElement(privacySettingButton);
    }

    public void checkRatingHistory() {
        actionsWithOurElements.clickOnElement(ratingCheckBox);
        actionsWithOurElements.clickOnElement(saveRatingButton);
    }

    public boolean isMsgSucssesfullyPresent(){
        return actionsWithOurElements.isElementDisplayed(By.xpath("//h2[contains(.,'Your review profile has been updated, along with any existing reviews.')]"));
    }
    public boolean isTextOnPagePresent(String TitleCountry){
        return actionsWithOurElements.isElementDisplayed(By.xpath(".//*[text()='" + TitleCountry + "']"));
    }

    public void cleanPreviouseUserData(String TitleCountry, String language, String quantity ) {
        selectDisplayCountry(TitleCountry);
        selectDisplayLanguage(language);
        selectEpisodesToDisplayInDD(quantity);
        clickSubmitButton();


    }
}
