package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HTMLTableTagPage extends BasePage {

    @FindBy(css = "table[id='mytable'] caption")
    private WebElement tableInformation;
    @FindBy(xpath = "//td[normalize-space()='Bob']")
    private WebElement nameBob;

    @FindBy(xpath = "//td[normalize-space()='23']")
    private WebElement amountOfBob;

    public HTMLTableTagPage(ChromeDriver driver) {
        super(driver);
    }

    public void HTMLTable() {
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
        System.out.println(tableInformation.getText());
        System.out.println(nameBob.getText());
        System.out.println(amountOfBob.getText());
    }

}
