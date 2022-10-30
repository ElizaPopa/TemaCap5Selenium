package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LocatorsPage extends BasePage {

    @FindBy(id = "p5")
    private WebElement eParagraph;
    @FindBy(id = "p41")
    private WebElement lastNested;
    @FindBy(id = "a43")
    private WebElement jumpToParagraph17;


    public LocatorsPage(ChromeDriver driver) {
        super(driver);
    }

    public void findByPlayground() {
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        System.out.println(eParagraph.getText());
        System.out.println(lastNested.getText());
        jumpToParagraph17.click();
    }
}
