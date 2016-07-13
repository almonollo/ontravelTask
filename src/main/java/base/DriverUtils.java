package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DriverUtils {
    private WebDriver driver;

    public DriverUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void clearAndType(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
}
