package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchListPage extends ParentPage {

    WatchListPage watchListPage;
    WebDriverWait wait3;

    @FindBy(xpath = "((//div[@class='vertical-ellipsis'])[1]//*)[1]")
    private Object MouseClass;


    public WatchListPage(WebDriver webDriver) {
        super(webDriver);
        wait3 = new WebDriverWait(webDriver, 3);
    }

    @FindBy(xpath = "//textarea[@id='list-create-name']")
    WebElement listTitleInput;

    @FindBy(xpath = "//a[contains(.,'See all lists by you')]")
    WebElement buttonEditList;

    @FindBy(xpath = "//button[@type='button'][contains(.,'create a new list')]")
    WebElement createNewList;

    @FindBy(xpath = "//textarea[@id='list-create-description']")
    WebElement createListDesc;

    @FindBy(xpath = "//select[@id='list-create-type']")
    WebElement listTypeDD;

    @FindBy(xpath = "//button[@type='button'][contains(.,'CREATE')]")
    WebElement buttonCreateNewList;

    @FindBy(xpath = "(//div[@class='vertical-ellipsis'])[1]")
    WebElement clickOnList;

    @FindBy(xpath = "(//a[@class='pop-up-menu-list-item-link delete-list'])[1]")
    WebElement deleteThisList;

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Delete')])[1]")
    WebElement deleteListButton;

    @FindBy(xpath = "//a[contains(.,'DanishTest')]")
    WebElement nick;

    @FindBy(xpath = "//a[@href='/chart/top/?ref_=wl_expl_1'][contains(.,'Browse Popular Movies')]")
    WebElement popMovieButton;

    @FindBy(xpath = "//a[contains(.,'Втеча з Шоушенка')]")
    WebElement topMovie1;

    @FindBy(xpath = "//div[@title='Click to add to watchlist']")
    WebElement addtoWatchListButton;

    @FindBy(xpath = "//a[@title='Edit']")
    WebElement editButton;

    @FindBy(xpath = ".//*[@id='main']/div[2]/div[3]/div[1]/span[1]/div")
    WebElement checkBoxMovie;

    @FindBy(xpath = "//a[@id='delete_items']")
    WebElement deleteButton;

    @FindBy(xpath = "//input[@value='DELETE']")
    WebElement confirmDelete;

    @FindBy(xpath = "//span[@id='num-filtered-lists']")
    WebElement showingOfList;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Done')]")
    WebElement buttoneDone;


    public void inputListTitle(String myListName) {
        actionsWithOurElements.enterTextInToElement(listTitleInput, myListName );
    }

    public void ckickEditList() {
        actionsWithOurElements.clickOnElement(buttonEditList);
    }

        public void clickCreateNewList() {
        actionsWithOurElements.clickOnElement(createNewList);
    }

    public void inputListDescription(String myDescriptionName) {
        actionsWithOurElements.enterTextInToElement(createListDesc, myDescriptionName);
    }

    public void selectTitleTypeInDD(String people) {
        actionsWithOurElements.selectTextInDD(listTypeDD, people);
    }

    public void clickCompleteCreateList() {
        actionsWithOurElements.clickOnElement(buttonCreateNewList);
    }

    public void deleteWatchListFromList(String myListName)  {

        actionsWithOurElements.clickOnElement(clickOnList);
        wait3.until(ExpectedConditions.elementToBeClickable(deleteThisList));
        actionsWithOurElements.clickOnElement(deleteThisList);

        actionsWithOurElements.clickOnElement(deleteListButton);
    }

    public void clickUserName() {
        actionsWithOurElements.clickOnElement(nick);
        //wait3.until(ExpectedConditions.elementToBeClickable(nick));
    }

    public void clickPopularMovies() {
        actionsWithOurElements.clickOnElement(popMovieButton);
    }

    public void selectTopRateMovies() {
        actionsWithOurElements.clickOnElement(topMovie1);
    }

    public void clickAddToWatchList() {
        actionsWithOurElements.clickOnElement(addtoWatchListButton);
    }

    public boolean movieInMyListPresent() {
        return actionsWithOurElements.isElementDisplayed(By.xpath("//a[contains(.,'Втеча з Шоушенка')]"));
    }

    public void clickEditList() {
        actionsWithOurElements.clickOnElement(editButton);
    }

    public void deleteCreatedWatchList() {
        actionsWithOurElements.clickOnElement(checkBoxMovie);
        actionsWithOurElements.clickOnElement(deleteButton);
        actionsWithOurElements.clickOnElement(confirmDelete);

    }

    public boolean movieIsNotPresentonList() {
        return actionsWithOurElements.isElementDisplayed(buttoneDone);
    }

    public boolean listisNotPresent() {
        //return actionsWithOurElements.isElementDisplayed(By.xpath(".//*[text()='Showing   of  lists']"));
        return actionsWithOurElements.isElementDisplayed(showingOfList);

        //actionsWithOurElements.textToBePresentInElement(showingOfList, "Showing 0  of 0 lists");
    }



    public boolean listIsCompleteAdded() {
        return actionsWithOurElements.isElementDisplayed(buttoneDone);
    }


    //""Showing 0  of 0 lists"");






}
