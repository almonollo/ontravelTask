package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {

	public WebDriver driver;
	TestConfig testConfig;

	public TestBase() {
		testConfig = new TestConfig();
	}

	@BeforeSuite
	public void initDriver() {
		driver = new FirefoxDriver();
		driver.get(testConfig.getEnvironmentUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}



