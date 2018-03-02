package net.comments.ft;

import net.comments.objects.*;
import net.comments.selenium.CommentsDriver;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
    private final CommentsDriver driver = new CommentsDriver();
    private final CommentsPage commentsPage;
    private final ModifyCommentPage modifyCommentPage;
    private final ModifyCommentActions newCommentAction;

    public Test1() {
        this.commentsPage = new BCommentsPage(driver);
        this.modifyCommentPage = new BModifyCommentPage(driver);
        this.newCommentAction = new BModifyCommentActions(driver);
    }

    @Test(dataProvider = "testData1")
    public void test(String commentText, String commentNumber) {
        commentsPage.open();
        commentsPage.newComment();
        modifyCommentPage.fillCommentText(commentText);
        modifyCommentPage.fillNumber(commentNumber);
        modifyCommentPage.activateComment();
        modifyCommentPage.addCategory(1);
        modifyCommentPage.modifyActions().saveAndReturn();
        commentsPage.navigateToPage(4);
        MatcherAssert.assertThat("New comment is not present", commentsPage.currentComments().hasCommentWithId(Integer.parseInt(commentNumber)));
        MatcherAssert.assertThat("New comment is not present", commentsPage.currentComments().hasCommentWithText(commentText));
    }

    @DataProvider
    public Object[] testData1() {
        return new Object[][]{
                {"New comment text 1", "666"},
                {"New comment text 2", "777"},
                {"New comment text 3", "888"},
        };
    }

    @BeforeMethod
    public void createDriver() {
        this.driver.define();
    }

    @AfterMethod
    public void closeDriver() {
        this.driver.close();
    }
}
