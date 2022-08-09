import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;

import static org.bouncycastle.asn1.cmc.CMCFailInfo.badRequest;

public class ThirdLink {
    public static void AlTreileaLink(ChromeDriver driver) {
        driver.get("https://demoqa.com/elements");
        WebElement textBox = driver.findElement(By.className("text"));
        textBox.click();
        WebElement insertName = driver.findElement(By.cssSelector("#userName"));
        insertName.sendKeys("Eliza Popa");
        WebElement insertEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        insertEmail.sendKeys("adresaElizei@gmail.com");
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        submitButton.click();
//        WebElement detailsAdded = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
//        System.out.println(detailsAdded.getText());

        driver.close();
        driver.quit();
    }

    public static void checkBoxField (ChromeDriver driver) {
        driver.get("https://demoqa.com/elements");
        WebElement checkBox = driver.findElement(By.xpath("//span[normalize-space()='Check Box']"));
        checkBox.click();
        WebElement box1 = driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']"));
        box1.click();
        WebElement box2 = driver.findElement(By.xpath("//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']"));
        box2.click();
        WebElement box3 = driver.findElement(By.id("result"));
        System.out.println(box3.getText());

        driver.close();
        driver.quit();
    }

    public static void RadioButtonField(ChromeDriver driver) {
        driver.get("https://demoqa.com/elements");
        WebElement radioButton = driver.findElement(By.xpath("//span[normalize-space()='Radio Button']"));
        radioButton.click();
        WebElement yesButton = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        yesButton.click();
        WebElement yesAgain = driver.findElement(By.className("text-success"));
        System.out.println("I have selected: " + yesAgain.getText());

        driver.close();
        driver.quit();
    }

    public static void WebTablesField(ChromeDriver driver) {
        driver.get("https://demoqa.com/webtables");
        WebElement addNewButton = driver.findElement(By.id("addNewRecordButton"));
        addNewButton.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Lexie");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Grey");
        WebElement ageField = driver.findElement(By.xpath("//input[@id='age']"));
        ageField.sendKeys("32");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        System.out.println("You need to add also email, Salary and Department");

        driver.close();
        driver.quit();
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
//        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDrivers(); js.executeScript("arguments[0].click();", driver);
//        new WebDriverWait(getWebDriver(), 5).until(badRequest.driver.findElement(By.id("bad-request")).click();
        WebElement badRequest = driver.findElement(By.id("bad-request"));
        badRequest.click();
        WebElement request = driver.findElement(By.id("linkResponse"));
        System.out.println(request.getText());

        WebElement linksButton = driver.findElement(By.linkText("Home"));
        linksButton.click();

        driver.close();
        driver.quit();
    }
}
