package parentTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
       public WebDriver webDriver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected WatchListPage watchListPage;
    protected ProfilePage profilePage;
    protected PreferencesPage preferencesPage;


    @Before
    public void setUp() {
        File file = new File("./src/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        watchListPage = new WatchListPage(webDriver);
        profilePage = new ProfilePage(webDriver);
        preferencesPage = new PreferencesPage(webDriver);

    }

   @After
    public void tearDown() {
       webDriver.quit();
    }

    public void checkExpectedResult(String message, boolean actualResult, boolean expectedResult){
        Assert.assertEquals(message,expectedResult, actualResult );
    }
    public void checkExpectedResult(String message, boolean actualResult){
        checkExpectedResult(message, actualResult , true);
    }
}
