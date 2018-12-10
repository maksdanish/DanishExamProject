package preferences;

import org.junit.Test;
import parentTest.ParentTest;

public class EditPreferences extends ParentTest {

    @Test
    public void editMyPreferences(){
        loginPage.loginToIMDb("maksdanish@gmail.com", "Odyssey100");
        homePage.clickOnNickName();
        homePage.clickYourAccount();
        preferencesPage.clickContentSetting();
        preferencesPage.cleanPreviouseUserData("", "", "None");
        preferencesPage.selectDisplayCountry("Ukraine");
        preferencesPage.selectDisplayLanguage("English");
        preferencesPage.selectEpisodesToDisplayInDD("All");
        preferencesPage.clickSubmitButton();
        checkExpectedResult("my  Preference info was changed", preferencesPage.isTextOnPagePresent());

    }

}
