package net.comments.ft;

import net.comments.objects.*;
import net.comments.selenium.CommentsDriver;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test18_21 {

    private final CommentsDriver driver;
    private final CommentsPage commentsPage;
    private final ModifyCommentPage modifyCommentPage;
    private final ModifyCommentActions newCommentAction;

    public Test18_21() {
        this.driver = new CommentsDriver();
        this.commentsPage = new BCommentsPage(driver);
        this.modifyCommentPage = new BModifyCommentPage(driver);
        this.newCommentAction = new BModifyCommentActions(driver);
    }

    @Test(dataProvider = "testData18_21")
    public void test(String commentText) {
        commentsPage.open();
        commentsPage.newComment();
        modifyCommentPage.fillCommentText(commentText);
        modifyCommentPage.fillNumber("111");
        modifyCommentPage.activateComment();
        modifyCommentPage.addCategory(1);
        modifyCommentPage.modifyActions().saveAndReturn();
        commentsPage.navigateToPage(4);
        MatcherAssert.assertThat("New comment is not present", commentsPage.currentComments().hasCommentWithText(commentText));
    }

    @DataProvider
    public Object[] testData18_21() {
        return new Object[][]{
                {"New comment with latin characters"},
                {"Новый комментарий с кириллическими символами"},
                {"New comment with digits 1234567890"},
                {"New comment with âãäåçèéêëìíîðñò"},
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
