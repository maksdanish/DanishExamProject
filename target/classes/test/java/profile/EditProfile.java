package profile;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class EditProfile extends ParentTest {
    @Test
    public void editMyProfileIMDb(){
        loginPage.loginToIMDb("maksdanish@gmail.com", "Odyssey100");
        homePage.clickOnNickName();
        homePage.clickYourAccount();
        profilePage.clickEditProfile();
        profilePage.addBIOtoMyProfile("autoTest- adding to BIO info" + " ");
        profilePage.clickSaveDescription();
        checkExpectedResult("User BIO info has been changed", profilePage.isAccountSetupPagePresent());

    }
    @Test
    public void editUserID(){
        loginPage.loginToIMDb("maksdanish@gmail.com","Odyssey100" );
        homePage.clickOnNickName();
        homePage.clickYourAccount();
        profilePage.clickEditProfile();
        profilePage.clickEditUserID();
        profilePage.inputUserIdName("userTestG37");
        profilePage.clickSaveChanges();
        checkExpectedResult(" User ID changed", profilePage.isUserIdPresent());

    }

    @Test
    public void editPersonalDetails(){
        loginPage.loginToIMDb("maksdanish@gmail.com","Odyssey100" );
        homePage.clickOnNickName();
        homePage.clickYourAccount();
        profilePage.clickYourAccountSetting();
        profilePage.clickPersonalDetails();
        profilePage.eraseSelectedDayMonthYearOfBirth("-", "-", "-", "", "-");
        profilePage.clickSubmitPersonalDetails();
        checkExpectedResult("User personal info full erased", profilePage.isSuccessfullyMsgPresent());
        profilePage.selectGenderInDD("Male");
        profilePage.selectDateOfBirth("17");
        profilePage.selectMonthOfBirth("May");
        profilePage.inputYearOfBirth("1986");
        profilePage.selectCountry("Ukraine");
        profilePage.clickSubmitPersonalDetails();
        checkExpectedResult("User personal details is changed",  profilePage.isSuccessfullyMsgPresent());


    }
}
