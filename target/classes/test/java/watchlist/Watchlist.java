package watchlist;

import org.junit.Before;
import org.junit.Test;
import parentTest.ParentTest;

public class Watchlist extends ParentTest {
     String myListName = "myVideo";
     String myDescriptionName = "G37testExam";
     String movieName = "Iнтeрстеллар";

    @Test  // Тест по добавлению нового листа в список листов. После успешного добавления - созданный лист удаляем.
    public void addNewList()  {
        loginPage.logIn();
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
        checkExpectedResult("List  deleted from my Lists", true, watchListPage.listisNotPresent(myListName));
    }

    /**
     * Тест по добавление фильма в watch list  и после успешного добавление , удалить watchlist
     */
    @Test
    public void addNewWatchList()  {
        loginPage.logIn();
        homePage.searchMovie(movieName);
        homePage.clickLookUp();
        watchListPage.clickOnMovieName();
        watchListPage.clickAddToWatchList();
        homePage.clickWatchList();
        checkExpectedResult("movie added to my watchList", watchListPage.movieInMyListPresent());
        watchListPage.clickEditList();
        watchListPage.deleteCreatedWatchList();
        checkExpectedResult("movie  removed from my watchList", watchListPage.movieIsNotPresentonList());
    }

}
