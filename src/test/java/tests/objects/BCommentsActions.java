package tests.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BCommentsActions implements CommentsActions {
    private final WebDriver driver;

    public BCommentsActions(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void duplicate() {
        this.driver.findElement(By.xpath("//*[@class = \"buttonAsLink navigationButton\" and @value = \"Duplicate...\"]")).click();
    }

    public void edit() {
        throw new UnsupportedOperationException("Please implement");
    }

    public void delete() {
        throw new UnsupportedOperationException("Please implement");
    }
}
