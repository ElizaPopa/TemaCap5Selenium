package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicWebPage extends BasePage {

    @FindBy(id = "para1")
    private WebElement firstParagraph;
    @FindBy(id = "para2")
    private WebElement secondParagraph;

    public BasicWebPage(ChromeDriver driver) {
        super(driver);
    }

    public void getTextFromPage() {
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        System.out.println("The first text is: " + firstParagraph.getText());
        System.out.println("The second text is: " + secondParagraph.getText());
    }
}
