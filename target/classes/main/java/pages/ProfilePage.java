package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage {
    ProfilePage profilePage;

    @FindBy(xpath = "//a[@href='/activity/editprofile'][contains(.,'Edit profile')]")
    WebElement editProfileButton;

    @FindBy(xpath = "//textarea[@name='bio']")
    WebElement inputMyBIO;

    @FindBy(xpath = "//div[@class='auth-button-link auth-button--primary'][contains(.,'Save Description')]")
    WebElement saveDescriptionButton;

    @FindBy(xpath = "//a[@href='/registration/changenick'][contains(.,'Edit')]")
    WebElement editUserIDbutton;

    @FindBy(xpath = "//input[@name='nick']")
    WebElement inputUserID;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement saveChangesButton;

    @FindBy(xpath = "//a[contains(.,'Your Account Settings')]")
    WebElement yourAccountSettingButton;

    @FindBy(xpath = "//a[contains(.,'Personal details')]")
    WebElement personalDetailsButton;

    @FindBy(xpath = "//select[@id='genderSel']")
    WebElement genderDD;

    @FindBy(xpath = "//select[@id='dayOfBirth']")
    WebElement selectDay;

    @FindBy(xpath = "//select[@id='monthOfBirth']")
    WebElement selectMonth;

    @FindBy(xpath = "//input[@id='yearOfBirth']")
    WebElement selectYear;

    @FindBy(xpath = "//select[@id='countryOfResidence']")
    WebElement selectCountry;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement clickSubmit;

    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickEditProfile() {
        actionsWithOurElements.clickOnElement(editProfileButton);
    }

    public void addBIOtoMyProfile(String myBio) {
        actionsWithOurElements.enterTextInToElement(inputMyBIO, myBio);

    }

    public void clickSaveDescription() {
        actionsWithOurElements.clickOnElement(saveDescriptionButton);
    }

    public void clickEditUserID() {
        actionsWithOurElements.clickOnElement(editUserIDbutton);
    }

    public void inputUserIdName(String userID) {
        actionsWithOurElements.enterTextInToElement(inputUserID, userID);

    }

    public void clickSaveChanges() {
        actionsWithOurElements.clickOnElement(saveChangesButton);
    }

    public void clickYourAccountSetting() {
        actionsWithOurElements.clickOnElement(yourAccountSettingButton);
    }

    public void clickPersonalDetails() {
        actionsWithOurElements.clickOnElement(personalDetailsButton);
    }

    public void selectGenderInDD( String genderType) {
        actionsWithOurElements.selectTextInDD(genderDD, genderType);
    }

    public void selectDateOfBirth(String day) {
        actionsWithOurElements.selectTextInDD(selectDay, day);
    }

    public void selectMonthOfBirth(String month) {
        actionsWithOurElements.selectTextInDD(selectMonth, month);
    }

    public void inputYearOfBirth(String year) {
        actionsWithOurElements.enterTextInToElement(selectYear, year);
    }

    public void selectCountry(String country) {
        actionsWithOurElements.selectTextInDD(selectCountry, country);
    }

    public void clickSubmitPersonalDetails() {
        actionsWithOurElements.clickOnElement(clickSubmit);
    }

    public void eraseSelectedDayMonthYearOfBirth(String genderType, String day, String month,String year, String country){
        selectGenderInDD(genderType);
        selectDateOfBirth(day);
        selectMonthOfBirth(month);
        inputYearOfBirth(year);
        selectCountry(country);
    }

    public boolean isUserIdPresent() {
        return actionsWithOurElements.isElementDisplayed(By.xpath("//h2[contains(.,'You have successfully changed your User ID to userTestG37')]"));
    }

    public boolean isSuccessfullyMsgPresent() {
        return actionsWithOurElements.isElementDisplayed(By.xpath("//h2[contains(.,'You have successfully updated your account details!')]"));
    }

    public boolean isAccountSetupPagePresent() {
        return actionsWithOurElements.isElementDisplayed(By.xpath("//h1[contains(.,'Account Settings')]"));
    }
}
