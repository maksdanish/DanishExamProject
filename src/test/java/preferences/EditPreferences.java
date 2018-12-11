package preferences;

import org.junit.Test;
import parentTest.ParentTest;

public class EditPreferences extends ParentTest {

    @Test // Тест по редактированию персональных настроек юзера : язык, страна, колличество эпизодов на странице.
    public void editMyPreferences(){
        loginPage.logIn();
        homePage.clickOnNickName();
        homePage.clickYourAccount();
        preferencesPage.clickContentSetting();
        preferencesPage.cleanPreviouseUserData("", "", "None");
        preferencesPage.selectDisplayCountry("Ukraine");
        preferencesPage.selectDisplayLanguage("English");
        preferencesPage.selectEpisodesToDisplayInDD("All");
        preferencesPage.clickSubmitButton();
        checkExpectedResult("My  Preference info was changed", preferencesPage.isTextOnPagePresent("Ukraine"));
    }

}
