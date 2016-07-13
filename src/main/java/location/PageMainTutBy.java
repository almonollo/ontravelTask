package location;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageMainTutBy extends BasePage {

    @FindBy(xpath = "//a[@class='topbar-burger']/span")
    private WebElement allSectionsBtn;

    @FindBy(xpath = "//a[contains(@href, 'http://mail.tut.by') and ancestor::*[contains(@class, 'topbarmore')]]")
    private WebElement sectionMailBtn;

    public PageMainTutBy(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PageLoginEmail openEmailLoginPage() {
        allSectionsBtn.click();
        sectionMailBtn.click();
        return new PageLoginEmail(driver);
    }
}
