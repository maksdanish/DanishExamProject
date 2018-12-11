package login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import parentTest.ParentTest;

public class Login extends ParentTest {

    @Test // Логин на страницу под юзером , с правильным логином и паролем
    public void validLogin(){
        loginPage.logIn();
        checkExpectedResult("Login Successfull", homePage.isLoginSuccessfull());
    }
}
