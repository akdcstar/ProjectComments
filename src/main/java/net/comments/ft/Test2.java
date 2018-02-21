package net.comments.ft;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test2 {
    private final WebDriver[] driver = new WebDriver[1];

    @Test
    public void test() {
        this.driver().get("http://commentssprintone.azurewebsites.net");
        this.driver().findElements(By.name("SelectedId")).get(3).click();
        this.driver().findElement(By.xpath("//*[@id=\"command-navigation\"]/input[1]")).click();
        this.driver().findElement(By.xpath("//*[@id=\"Text\"]")).clear();
        this.driver().findElement(By.xpath("//*[@id=\"Text\"]")).sendKeys("New Duplicated Comment");
        this.driver().findElement(By.xpath("//*[@id=\"Number\"]")).clear();
        this.driver().findElement(By.xpath("//*[@id=\"Number\"]")).sendKeys("399");
        this.driver().findElement(By.xpath("//*[@id=\"editor-navigation\"]/input[2]")).click();
        this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tfoot/tr/td/a[3]")).click();
        final String page = this.driver().getPageSource();
        MatcherAssert.assertThat("New duplicated comment text is not shown", page.contains("New Duplicated Comment"));
        MatcherAssert.assertThat(this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tbody/tr/td[2]")).getText(), Matchers.is("399"));

    }

    @BeforeMethod
    public void createDriver() {
        driver[0] = new ChromeDriver();
    }

    @AfterMethod
    public void closeDriver() {
        driver[0].close();
    }

    private WebDriver driver() {
        return this.driver[0];
    }
}
