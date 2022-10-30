package org.example;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

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
    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    private WebElement addButton;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='age']")
    private WebElement ageField;
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

        addButton.click();
        firstName.sendKeys("Lexie");
        lastName.sendKeys("Grey");
        ageField.sendKeys("32");
        submitButton.click();
        System.out.println("You need to add also email, Salary and Department");
    }
}
