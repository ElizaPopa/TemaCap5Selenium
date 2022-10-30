import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ThirdPoint extends Base {
    @Test
    public void textBoxTest() {
        elementsPage.textBox();
    }
    @Test
    public void checkBoxTest () {
        elementsPage.checkBoxField();

    }
    @Test
    public void RadioButtonTest() {
        elementsPage.radioButtonField();
    }

    @Test
    public void WebTablesTest() {
        elementsPage.webTablesField();
    }
    public static void ButtonsField(ChromeDriver driver) {

        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();
        WebElement afterRightClick = driver.findElement(By.id("rightClickMessage"));
        System.out.println(afterRightClick.getText());

        driver.close();
        driver.quit();
    }

    public static void LinksField(ChromeDriver driver) throws Exception {
        driver.get("https://demoqa.com/links");
//        driver.manage().window().maximize();

        try {
            WebElement badRequest = driver.findElement(By.id("bad-request"));
            badRequest.click();
        } catch (ElementClickInterceptedException ex) {
            System.out.println("Element interceptat");
        }

//        WebElement badRequest = driver.findElement(By.id("bad-request"));
//        badRequest.click();
        WebElement request = driver.findElement(By.id("linkResponse"));
        System.out.println(request.getText());

        WebElement linksButton = driver.findElement(By.linkText("Home"));
        linksButton.click();

        driver.close();
        driver.quit();
    }
}
