import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class TestChicagoPage extends BasePage {
    public TestChicagoPage(WebDriver driver) {
        super(driver);
    }

    public WebElement visibleCircle() {
        return getElementByXpath("//input[@id='filters-checkbox-delivery']");
    }

    public WebElement searchTanoorKabob() {
        return getElementByXpath("//input[@id='search-autocomplete']");
    }

    public WebElement clickTanoorKabob() {
        return getElementByXpath("//img[@alt='Tanoor Kabob logo']");
    }
}
