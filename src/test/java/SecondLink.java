import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondLink {
    public static void AlDoileaLink(ChromeDriver driver) {

        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        WebElement paragraph3 = driver.findElement(By.cssSelector("div.centered #domattributes"));
        System.out.println(paragraph3.getText());

        WebElement paragraph4 = driver.findElement(By.id("jsattributes"));
        System.out.println(paragraph4.getText());

        WebElement buttonAttributes = driver.findElement(By.cssSelector("div .centered button"));
        buttonAttributes.click();
        System.out.println(buttonAttributes.getAttribute("nextid"));
        System.out.println(buttonAttributes.getAttribute("custom-1"));




        driver.close();
        driver.quit();
    }
}
