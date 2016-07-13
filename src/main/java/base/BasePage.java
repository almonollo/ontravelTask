package base;


import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected DriverUtils driverUtils;

    public BasePage() {
        driverUtils = new DriverUtils(driver);
    }

}
