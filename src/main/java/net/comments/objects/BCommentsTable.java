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
}
