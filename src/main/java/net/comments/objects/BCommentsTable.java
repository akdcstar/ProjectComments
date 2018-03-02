package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BCommentsTable implements CommentsTable {
    private final WebDriver driver;

    public BCommentsTable(WebDriver driver) {
        this.driver = driver;
    }

    public boolean hasCommentWithId(int id) {
        try {
            driver.findElement(By.xpath(String.format("//td[@class=\"numbercolumn\" and text()=\"%s\"]", id)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean hasCommentWithText(String commentText) {
        try {
            driver.findElement(By.xpath(String.format("//td[@class=\"textcolumn\" and text()=\"%s\"]", commentText)));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean selectComment(String commentNumber) {
        try {
            driver.findElement(By.xpath(String.format("//*[@class = \"numbercolumn\" and text()= \"%s\"]/../td[1]", commentNumber))).click();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
