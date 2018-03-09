package tests.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    public boolean hasTextAlphanumericValidationError() {
        try {
            driver.findElement(By.xpath("//*[@id=\"errorfield\" and contains(text(), \"The Comment Text field should contain alphanumeric characters only\")]"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean hasTextMaxLengthValidationError() {
        try {
            driver.findElement(By.xpath("//*[@id=\"errorfield\"]/*/*/span[contains(text(),\"The maximum length of Comment Text field is 50 characters\")]"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean hasTextScriptValidationError() {
        try {
            driver.findElement(By.xpath("//*[@id=\"main\"]/h2[contains(text(),\"Sorry, an error occurred while processing your request.\")]"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean hasAnyTextValidationError() {
        return hasTextAlphanumericValidationError() || hasTextMaxLengthValidationError() || hasTextScriptValidationError();
    }
}

