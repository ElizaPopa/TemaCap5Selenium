
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelenium {

    public static void main(String[] args) throws Exception {


        WebDriverManager.chromedriver().setup();

        FirstLink.PrimulLink(new ChromeDriver());
        SecondLink.AlDoileaLink(new ChromeDriver());
        ThirdLink.AlTreileaLink(new ChromeDriver());
        ThirdLink.checkBoxField(new ChromeDriver());
        ThirdLink.RadioButtonField(new ChromeDriver());
        ThirdLink.WebTablesField(new ChromeDriver());
        ThirdLink.ButtonsField(new ChromeDriver());
        ThirdLink.LinksField(new ChromeDriver());
    }
}
