package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BNewCommentBody implements NewCommentBody {
    private final WebDriver driver;

    public BNewCommentBody(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void fillCommentText() {
        this.driver.findElement(By.id("Text")).clear();
        this.driver.findElement(By.id("Text")).sendKeys("This is new comment");
    }

    public void fillNumber() {
        this.driver.findElement(By.id("Number")).clear();
        this.driver.findElement(By.id("Number")).sendKeys("888");
    }

    public void activateComment() {
        if (!this.driver.findElement(By.id("Active")).isSelected()) {
            this.driver.findElement(By.id("Active")).click();
        }
    }

    public void addCategory(int categoryNumber) {
        this.driver.findElements(By.id("Categories")).get(categoryNumber).click();
        this.driver.findElement(By.name("CurSelect")).click();
    }
}
