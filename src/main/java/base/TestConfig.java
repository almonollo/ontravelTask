package base;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

@Resource.Classpath("test.properties")
public class TestConfig {

	@Property("environment.url")
	private String environmentUrl;

	@Property("email.username")
	private String emailUsername;

	@Property("email.password")
	private String emailPassword;

	public TestConfig() {
		PropertyLoader.populate(this);
	}

	public String getEnvironmentUrl() {
		return environmentUrl;
	}

	public String getEmailUsername() {
		return emailUsername;
	}

	public String getEmailPassword() {
		return emailPassword;
	}
}
