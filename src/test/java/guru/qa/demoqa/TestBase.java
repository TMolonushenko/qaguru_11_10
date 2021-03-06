package guru.qa.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.baseUrl = " https://demoqa.com/";
        Configuration.browserSize = "1920x1080";

        DesiredCapabilities capabilities  = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability(" enableVideo", false);
        Configuration.browserCapabilities = capabilities;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screnshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }
}
