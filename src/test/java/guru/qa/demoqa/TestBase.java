package guru.qa.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = " https://demoqa.com/";
        Configuration.browserSize = "1920x1080";
        DesiredCapabilities capabilities  = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability(" enableVideo", false);
        Configuration.browserCapabilities = capabilities;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}
