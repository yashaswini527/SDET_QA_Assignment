package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
    WebDriver driver;

    private By resultText = By.id("outputText");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
