import implementation.WebdriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GridTests extends Base {

    @Test
    public void firstLinkGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        basicWebPage.getTextFromPage();
    }
}
