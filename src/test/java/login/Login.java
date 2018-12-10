package login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import parentTest.ParentTest;

public class Login extends ParentTest {


    @Test
    public void validLogin(){
        loginPage.openLoginPage();
        loginPage.openSubLoginPage();
        loginPage.openSignInWithIMDb();
        loginPage.enterLogin("maksdanish@gmail.com");
        loginPage.enterPassword("Odyssey100");
        loginPage.clickSubmitButton();
        //homePage.isLoginSuccessfull();
        checkExpectedResult("Login Successfull", homePage.isLoginSuccessfull());

    }


}
