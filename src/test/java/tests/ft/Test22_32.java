package tests.ft;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.objects.BCommentsPage;
import tests.objects.BModifyCommentPage;
import tests.objects.CommentsPage;
import tests.objects.ModifyCommentPage;
import tests.selenium.CommentsDriver;

public class Test22_32 {
    private final CommentsDriver driver;
    private final CommentsPage commentsPage;
    private final ModifyCommentPage modifyCommentPage;

    public Test22_32() {
        this.driver = new CommentsDriver();
        this.commentsPage = new BCommentsPage(driver);
        this.modifyCommentPage = new BModifyCommentPage(driver);
    }

    @Test(dataProvider = "testData22_32")
    public void test(String commentText) {
        commentsPage.open();
        commentsPage.newComment();
        modifyCommentPage.fillCommentText(commentText);
        modifyCommentPage.fillNumber("111");
        modifyCommentPage.activateComment();
        modifyCommentPage.addCategory(1);
        modifyCommentPage.modifyActions().saveAndReturn();
        MatcherAssert.assertThat("Validation error is not shown", modifyCommentPage.hasAnyTextValidationError());
    }

    @DataProvider
    public Object[] testData22_32() {
        return new Object[][]{
                {"Special characters !@#$%^&*()"},
                {"\"Нdsfsdfdfdsfgd \""},
                {"\"fdsfsd fdfdsfgd\""},
                {"\"Ndsfsdfdfdsfgd \""},
                {"<form action=\"http://commentssprintone.azurewebsites.net\"><input type=\"submit\"></form>"},
                {"<input onclick=\"javascript:alert('xss');\">"},
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
