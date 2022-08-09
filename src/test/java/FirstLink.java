import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLink {
    public static void PrimulLink(ChromeDriver driver) {

        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");

        WebElement paragraph = driver.findElement(By.id("para1"));
        System.out.println(paragraph.getText());
        WebElement paragraph2 = driver.findElement(By.id("para2"));
        System.out.println(paragraph2.getText());

        driver.close();
        driver.quit();
    }
}
