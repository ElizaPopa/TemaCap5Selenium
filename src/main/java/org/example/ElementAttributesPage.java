package org.example;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ElementAttributesPage extends BasePage {
    @FindBy(css = "div.centered #domattributes")
    private WebElement paragraph3;
    @FindBy(id = "jsattributes")
    private WebElement paragraph4;
    @FindBy(css = "div .centered button")
    private WebElement attributesButton;

    public ElementAttributesPage(ChromeDriver driver) {
        super(driver);
    }

    public void inspectAllElements() {
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        System.out.println(paragraph3.getText());
        System.out.println(paragraph4.getText());
        attributesButton.click();
        System.out.println(attributesButton.getAttribute("nextid"));
        System.out.println(attributesButton.getAttribute("custom-1"));
    }
}
