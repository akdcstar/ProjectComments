package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BCommentsPage implements CommentsPage {
    private final WebDriver driver;

    public BCommentsPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void open() {
        this.driver.get("http://commentssprintone.azurewebsites.net/");
    }

    public void newComment() {
        this.driver.findElement(By.xpath("//*[@id=\"newbutton\"]")).click();
    }

    public CommentsActions commentsActions() {
        return new BCommentsActions(this.driver);
//        throw new UnsupportedOperationException("Please implement");
    }

    public CommentsTable currentComments() {
        return new BCommentsTable();
//        throw new UnsupportedOperationException("Please implement");
    }

    public CommentsTable commentsFrom(int page) {
        throw new UnsupportedOperationException("Please implement");
    }

    public int commentsPagesSize() {
        throw new UnsupportedOperationException("Please implement");
    }
}
