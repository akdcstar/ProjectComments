package tests.ft;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
    private final WebDriver[] driver = new WebDriver[1];

    @Test
    public void test() {
        this.driver().get("http://commentssprintone.azurewebsites.net");
        this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tbody/tr[6]/td[1]/input[1]")).click();
        this.driver().findElement(By.xpath("//*[@id=\"command-navigation\"]/input[2]")).click();
        this.driver().findElement(By.xpath("//*[@id=\"Text\"]")).clear();
        this.driver().findElement(By.xpath("//*[@id=\"Text\"]")).sendKeys("New Edited Comment 5");
        this.driver().findElement(By.name("AllUnSelectBtn")).click();
        this.driver().findElement(By.name("AllSelect")).click();
        this.driver().findElement(By.xpath("//*[@id=\"editor-navigation\"]/input[2]")).click();

        MatcherAssert.assertThat("Number value is not correct", this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tbody/tr[6]/td[2]")).getText(), Matchers.is("5"));
        MatcherAssert.assertThat("Comment Text is not correct", this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tbody/tr[6]/td[3]")).getText(), Matchers.is("New Edited Comment 5"));
        MatcherAssert.assertThat("Inactive status is not correct", this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tbody/tr[6]/td[4]")).getText(), Matchers.is("V"));
        MatcherAssert.assertThat("Categories value is not  correct", this.driver().findElement(By.xpath("//*[@id=\"main\"]/div/div[5]/form/table/tbody/tr[6]/td[5]")).getText(), Matchers.is("Cat0; Cat1; Cat2; Cat3; Cat4; Cat5; "));
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
