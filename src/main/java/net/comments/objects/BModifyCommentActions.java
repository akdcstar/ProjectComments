package net.comments.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BModifyCommentActions implements ModifyCommentActions {
    private final WebDriver driver;

    public BModifyCommentActions(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void refresh() {
        throw new UnsupportedOperationException("Please implement");
    }

    public void save() {
        throw new UnsupportedOperationException("Please implement");
    }

    public void saveAndReturn() {
        this.driver.findElement(By.xpath("//*[@id=\"editor-navigation\"]/input[2]")).click();
    }
}
