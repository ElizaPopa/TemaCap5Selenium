
import org.testng.annotations.Test;

public class ThirdPoint extends Base {
    @Test
    public void textBoxTest() {
        elementsPage.textBox();
    }
    @Test
    public void checkBoxTest () { elementsPage.checkBoxField(); }
    @Test
    public void RadioButtonTest() {
        elementsPage.radioButtonField();
    }
    @Test
    public void WebTablesTest() {
        elementsPage.webTablesField();
    }
    @Test
    public void ButtonsTest() { elementsPage.buttonsField(); }
    @Test
    public void LinksTest() { elementsPage.linksField(); }
}
