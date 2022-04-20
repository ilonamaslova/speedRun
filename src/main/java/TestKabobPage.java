import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestKabobPage extends BasePage {
    public TestKabobPage(WebDriver driver) {
        super(driver);
    }

    public WebElement findText() {
        return getElementByXpath("//h1");
    }
}
