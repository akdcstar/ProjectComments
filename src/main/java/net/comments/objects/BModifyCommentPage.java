package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BModifyCommentPage implements ModifyCommentPage {
    private final WebDriver driver;

    public BModifyCommentPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public BModifyCommentActions modifyActions() {
        return new BModifyCommentActions(driver);
    }

    public void fillCommentText(String text) {
        this.driver.findElement(By.id("Text")).clear();
        this.driver.findElement(By.id("Text")).sendKeys(text);
    }

    public void fillNumber(String number) {
        this.driver.findElement(By.id("Number")).clear();
        this.driver.findElement(By.id("Number")).sendKeys(number);
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
