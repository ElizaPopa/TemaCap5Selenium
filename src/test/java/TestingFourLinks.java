import org.testng.annotations.Test;

public class TestingFourLinks extends Base {

    @Test
    public void FirstLink() {
        basicWebPage.getTextFromPage();
    }

    @Test
    public void SecondLink() {
        elementAttributesPage.inspectAllElements();
    }

    @Test
    public void ThirdLink() {
        locatorsPage.findByPlayground();
    }

    @Test
    public void FourthLink() {
        htmlTableTagPage.HTMLTable();
    }
}
