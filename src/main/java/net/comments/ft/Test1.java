package net.comments.ft;

import net.comments.objects.*;
import net.comments.selenium.CommentsDriver;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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

    @Test
    public void test() {
        commentsPage.open();
        commentsPage.newComment();
        modifyCommentPage.fillCommentText("New comment Text");
        String commentNumber = "888";
        modifyCommentPage.fillNumber(commentNumber);
        modifyCommentPage.activateComment();
        modifyCommentPage.addCategory(1);
        modifyCommentPage.modifyActions().saveAndReturn();
        commentsPage.commentsFrom(4);

        MatcherAssert.assertThat("New comment is not present", commentsPage.currentComments().hasCommentWithId(Integer.parseInt(commentNumber)));
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
