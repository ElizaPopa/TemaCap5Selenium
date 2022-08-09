import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        System.out.println(paragraph4.getAttribute("nextid"));
        System.out.println(paragraph4.getAttribute("custom-1"));

//        List<WebElement> attributesList = (List<WebElement>) driver.findElement(By.cssSelector("div .centered button"));
//        for (int i = 0; i < attributesList.size(); i++) {
//            WebElement att = attributesList.get(i);
//        if (i == 0) {
//            System.out.println(attributesList.get(0).getText());
//        } else
//            System.out.println((i + 1) + attributesList.get(1).getText());
//        }


            driver.close();
        driver.quit();
    }
}
