import base.TestBase;
import location.PageHomeEmail;
import location.PageLoginEmail;
import location.PageMainTutBy;
import org.testng.Assert;
import org.testng.annotations.*;


public class TC_TutByEmailInboxSmoke extends TestBase {

	private PageHomeEmail pageHomeEmail;
    private PageLoginEmail pageLoginEmail;
    private PageMainTutBy pageMainTutBy;


	@BeforeMethod
	public void login() {
		pageMainTutBy = new PageMainTutBy(driver);
	}

    @Test
    public void doesInboxContainUnreadLetters() {
        pageLoginEmail = pageMainTutBy.openEmailLoginPage();
        pageHomeEmail = pageLoginEmail.openHomeEmailPage();
        Assert.assertTrue(pageHomeEmail.doesInboxContainUnreadLetters(), "There are no unread letters in current inbox");
    }

}
