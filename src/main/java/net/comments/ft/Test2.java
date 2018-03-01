package net.comments.ft;

import net.comments.objects.*;
import net.comments.selenium.CommentsDriver;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
    private final CommentsDriver driver = new CommentsDriver();
    private final CommentsPage commentsPage;
    private final CommentsTable commentsTable;
    private final CommentsActions commentsActions;
    private final ModifyCommentPage modifyComment;
    private final ModifyCommentActions modifyCommentAction;

    public Test2() {
        this.commentsPage = new BCommentsPage(driver);
        this.commentsTable = new BCommentsTable(driver);
        this.commentsActions = new BCommentsActions(driver);
        this.modifyComment = new BModifyCommentPage(driver);
        this.modifyCommentAction = new BModifyCommentActions(driver);
    }

    @Test
    public void test() {
        commentsPage.open();
        commentsTable.selectComment("5");
        commentsActions.duplicate();
        String commentNumber = "555";
        modifyComment.fillNumber(commentNumber);
        modifyCommentAction.saveAndReturn();
        commentsPage.commentsFrom(4);
        MatcherAssert.assertThat("New duplicated comment is not found", commentsPage.currentComments().hasCommentWithId(Integer.parseInt(commentNumber)));
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
