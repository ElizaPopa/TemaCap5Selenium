package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ElementsPage extends BasePage {
    String url = "https://demoqa.com/elements";
    @FindBy(className = "text")
    private WebElement textBox;
    @FindBy(id = "userName")
    private WebElement insertName;
    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement insertEmail;
    @FindBy(id = "submit")
    private WebElement submitButton;
    @FindBy(id = "name")
    private WebElement nameAdded;
    @FindBy(id = "email")
    private WebElement emailAdded;
    @FindBy(xpath = "//span[normalize-space()='Check Box']")
    private WebElement checkBoxField;
    @FindBy(xpath = "//button[@title='Toggle']//*[name()='svg']")
    private WebElement box1;
    @FindBy(xpath = "//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']")
    private WebElement box2;
    @FindBy(id = "result")
    private WebElement box3;
    @FindBy(xpath = "//span[normalize-space()='Radio Button']")
    private WebElement radioButton;
    @FindBy(css = "label[for='yesRadio']")
    private WebElement yesButton;
    @FindBy(className = "text-success")
    private WebElement yesAgain;
    @FindBy(xpath = "//span[normalize-space()='Web Tables']")
    private WebElement webTablesButton;
    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    private WebElement addButton;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='age']")
    private WebElement ageField;
    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClick;
    @FindBy(id = "doubleClickMessage")
    private WebElement afterDoubleClick;
    @FindBy(id = "rightClickBtn")
    private WebElement rightClick;
    @FindBy(id = "rightClickMessage")
    private WebElement afterRightClick;
    @FindBy(id = "bad-request")
    private WebElement badRequest;
    @FindBy(id = "linkResponse")
    private WebElement requestMessage;
    @FindBy(linkText = "Home")
    private WebElement linksButton;
    public ElementsPage(ChromeDriver driver) {
        super(driver);
    }

    public void textBox() {
        driver.get(url);
        textBox.click();
        insertName.sendKeys("Eliza Popa");
        insertEmail.sendKeys("adresaElizei@gmail.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", submitButton);
        submitButton.click();
        System.out.println(nameAdded.getText());
        System.out.println(emailAdded.getText());
    }

    public void checkBoxField() {
        driver.get(url);
        checkBoxField.click();
        box1.click();
        box2.click();
        System.out.println(box3.getText());
    }

    public void radioButtonField() {
        driver.get(url);
        radioButton.click();
        yesButton.click();
        System.out.println("I have selected: " + yesAgain.getText());
    }

    public void webTablesField() {
        driver.get(url);
        driver.manage().window().maximize();
        FluentWait wait = new FluentWait<>(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[normalize-space()='Web Tables']")));
        webTablesButton.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='addNewRecordButton']")));
        addButton.click();
        firstName.sendKeys("Lexie");
        lastName.sendKeys("Grey");
        ageField.sendKeys("32");
        submitButton.click();
        System.out.println("You need to add also email, Salary and Department");
    }

    public void buttonsField() {
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        System.out.println(afterDoubleClick.getText());
        actions.contextClick(rightClick).perform();
        System.out.println(afterRightClick.getText());
    }

    public void linksField() {
        driver.get("https://demoqa.com/links");
        try {
            badRequest.click();
        } catch (ElementClickInterceptedException ex) {
            System.out.println("Element interceptat");
        }
        System.out.println(requestMessage.getText());
        linksButton.click();
    }
}
