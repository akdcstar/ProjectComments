package net.comments.objects;

import org.openqa.selenium.WebDriver;

public class BCommentsActions implements CommentsActions {
    private final WebDriver driver;

    public BCommentsActions(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void duplicate() {
        throw new UnsupportedOperationException("Please implement");
    }

    public void edit() {
        throw new UnsupportedOperationException("Please implement");
    }

    public void delete() {
        throw new UnsupportedOperationException("Please implement");
    }
}
