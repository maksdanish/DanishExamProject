package profile;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class EditProfile extends ParentTest {

    @Test // Тест по добавлению биографии,о юзере.
    public void editMyProfileIMDb(){
        loginPage.logIn();
        homePage.clickOnNickName();
        homePage.clickYourAccount();
        profilePage.clickEditProfile();
        profilePage.addBIOtoMyProfile("autoTest- adding to BIO info" + " ");
        profilePage.clickSaveDescription();
        checkExpectedResult("User BIO info has been changed", profilePage.isAccountSetupPagePresent());
    }

    @Test   //Тест для изменения имени/UserID
    public void editUserID(){
        loginPage.logIn();
        homePage.clickOnNickName();
        homePage.clickYourAccount();
        profilePage.clickEditProfile();
        profilePage.clickEditUserID();
        profilePage.inputUserIdName("userTestG37");
        profilePage.clickSaveChanges();
        checkExpectedResult(" User ID changed", profilePage.isUserIdPresent());
    }

    @Test  // Тест по редактированию персональных данных юзера.
    public void editPersonalDetails(){
        loginPage.logIn();
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
