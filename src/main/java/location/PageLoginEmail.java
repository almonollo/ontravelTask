package location;


import base.BasePage;
import base.TestConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLoginEmail extends BasePage {

    @FindBy(xpath = "//input[@id='Username']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[contains(@class, 'loginButton')]")
    private WebElement loginBtn;

    TestConfig testConfig;

    public PageLoginEmail(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PageHomeEmail openHomeEmailPage(){
        testConfig = new TestConfig();
        driverUtils.clearAndType(userNameInput, testConfig.getEmailUsername());
        driverUtils.clearAndType(passwordInput, testConfig.getEmailPassword());
        loginBtn.click();
        return new PageHomeEmail(driver);
        }
}
