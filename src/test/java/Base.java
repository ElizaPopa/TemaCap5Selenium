import org.example.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.xml.sax.Locator;

public class Base {

    static ChromeDriver driver;
    BasicWebPage basicWebPage;
    ElementAttributesPage elementAttributesPage;
    LocatorsPage locatorsPage;
    HTMLTableTagPage htmlTableTagPage;
    ElementsPage elementsPage;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver");
        driver = new ChromeDriver();
        basicWebPage = new BasicWebPage(driver);
        elementAttributesPage = new ElementAttributesPage(driver);
        locatorsPage = new LocatorsPage(driver);
        htmlTableTagPage = new HTMLTableTagPage(driver);
        elementsPage = new ElementsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void quitThePage() {
        if (driver != null) {
            driver.quit();
        }
    }
}
