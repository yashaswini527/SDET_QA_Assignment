package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage {
    private WebDriver driver;
    private By inputField = By.id("inputText");
    private By submitButton = By.id("submitBtn");

    public FirstPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }
}
