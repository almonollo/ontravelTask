package location;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageHomeEmail extends BasePage {

	@FindBy(xpath = "//a[contains(@href, 'only_new')]")
	private WebElement numberOfUnreadInboxLetters;

	@FindBy(xpath = "//span[@class='b-messages__subject' and ancestor::*[@data-action='mail.message.show-or-select']]")
	private List<WebElement> subjectColumnItems;

	public PageHomeEmail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public int getNumberOfUnreadLetters() {
		return Integer.parseInt(numberOfUnreadInboxLetters.getText());
	}

	public boolean doesInboxContainUnreadLetters() {
		return getNumberOfUnreadLetters() != 0;
	}














}
