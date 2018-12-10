package watchlist;

import org.junit.Test;
import pages.WatchListPage;
import parentTest.ParentTest;

public class Watchlist extends ParentTest {
     String myListName = "myVideo";
     String myDescriptionName = "G37testExam";
    @Test
    public void addNewList() throws InterruptedException {
        loginPage.loginToIMDb("maksdanish@gmail.com","Odyssey100" );
        homePage.clickOnNickName();
        homePage.clickOnOurList();
        watchListPage.clickCreateNewList();
        watchListPage.inputListTitle(myListName);
        watchListPage.inputListDescription(myDescriptionName);
        watchListPage.selectTitleTypeInDD("People");
        watchListPage.clickCompleteCreateList();
        checkExpectedResult("New List added to my Lists", watchListPage.listIsCompleteAdded());
        watchListPage.clickUserName();
        homePage.clickOnNickName();
        homePage.clickOnOurList();
        watchListPage.deleteWatchListFromList(myListName);
        checkExpectedResult("list del from acc", watchListPage.listisNotPresent(myListName));
        //checkExpectedResult("List  deleted from my Lists", watchListPage.listisNotPresent);  // find by text:Showing 0  of 0  lists


    }

    @Test
    public void addNewWatchList()  {
        loginPage.loginToIMDb("maksdanish@gmail.com","Odyssey100" );
        homePage.clickWatchList();
        watchListPage.clickPopularMovies();
        watchListPage.selectTopRateMovies();
        watchListPage.clickAddToWatchList();
        homePage.clickWatchList();
        checkExpectedResult("movie added to my watchList", watchListPage.movieInMyListPresent());
        watchListPage.clickEditList();
        watchListPage.deleteCreatedWatchList();
        checkExpectedResult("movie  removed from my watchList", watchListPage.movieIsNotPresentonList());

    }


}
