import implementation.WebdriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GridTests extends Base {

    String url = "https://demoqa.com/elements";
    @Test
    public void firstLinkGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        basicWebPage.getTextFromPage();
        driver.quit();
    }
    @Test
    public void secondLinkGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        elementAttributesPage.inspectAllElements();
        driver.quit();
    }
    @Test
    public void thirdLinkGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        locatorsPage.findByPlayground();
        driver.quit();
    }
    @Test
    public void fourthLinkGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
        htmlTableTagPage.HTMLTable();
        driver.quit();
    }
    @Test
    public void textBoxGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get(url);
        elementsPage.textBox();
        driver.quit();
    }
    @Test
    public void checkBoxGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get(url);
        elementsPage.checkBoxField();
        driver.quit();
    }
    @Test
    public void RadioButtonGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get(url);
        elementsPage.radioButtonField();
        driver.quit();
    }
    @Test
    public void WebTablesGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get(url);
        elementsPage.webTablesField();
        driver.quit();
    }
    @Test
    public void ButtonsGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://demoqa.com/buttons");
        elementsPage.buttonsField();
        driver.quit();
    }
    @Test
    public void LinksGrid() throws MalformedURLException {
        RemoteWebDriver driver = WebdriverManager.getRemoteWebDriver();
        driver.get("https://demoqa.com/links");
        elementsPage.linksField();
        driver.quit();
    }
}
