package tests.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class CommentsDriver implements WebDriver {
    private final WebDriver[] driver = new WebDriver[1];

    private WebDriver driver() {
        return this.driver[0];
    }

    public void define(WebDriver webDriver) {
        this.driver[0] = webDriver;
    }

    public void define() {
        this.define(new ChromeDriver());
    }

    public void get(String s) {
        this.driver().get(s);
    }

    public String getCurrentUrl() {
        return this.driver().getCurrentUrl();
    }

    public String getTitle() {
        return this.driver().getTitle();
    }

    public List<WebElement> findElements(By by) {
        return this.driver().findElements(by);
    }

    public WebElement findElement(By by) {
        return this.driver().findElement(by);
    }

    public String getPageSource() {
        return this.driver().getPageSource();
    }

    public void close() {
        this.driver().close();
    }

    public void quit() {
        this.driver().quit();
    }

    public Set<String> getWindowHandles() {
        return this.driver().getWindowHandles();
    }

    public String getWindowHandle() {
        return this.driver().getWindowHandle();
    }

    public TargetLocator switchTo() {
        return this.driver().switchTo();
    }

    public Navigation navigate() {
        return this.driver().navigate();
    }

    public Options manage() {
        return this.driver().manage();
    }
}
