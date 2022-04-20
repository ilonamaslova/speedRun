import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElementByXpath(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

}
