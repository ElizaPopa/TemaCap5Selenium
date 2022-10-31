package implementation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebdriverManager {

        public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException {
            return new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
        }

        public static ChromeDriver getChromedriver() {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
}
