package net.comments.ft;

import net.comments.objects.*;
import net.comments.selenium.CommentsDriver;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    private final CommentsDriver driver = new CommentsDriver();

    private final CommentsPage commentsPage;
    private final NewCommentBody newCommentBody;
    private final NewCommentActions newCommentAction;

    public Test1() {
        this.commentsPage = new BCommentsPage(driver);
        this.newCommentBody = new BNewCommentBody(driver);
        this.newCommentAction = new BNewCommentActions(driver);

    }

    @Test
    public void test() {
        commentsPage.open();
        commentsPage.newComment();
        newCommentBody.fillCommentText();
        newCommentBody.fillNumber("888");
        newCommentBody.activateComment();
        newCommentBody.addCategory(1);
        newCommentAction.saveAndReturn();
        commentsPage.commentsFrom(4);

        MatcherAssert.assertThat("New comment is present", commentsPage.currentComments().hasCommentWithId(888));
    }

    @BeforeMethod
    public void createDriver() {
        this.driver.define();
    }
//    @AfterMethod
//    public void closeDriver() {
//        this.driver.close();
//    }


}
