package net.comments.objects;

import org.openqa.selenium.WebDriver;

public class BNewCommentPage implements NewCommentPage {
    public final WebDriver driver;

    public BNewCommentPage(WebDriver webDriver) {
        this.driver = webDriver;
    }
}
