import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnMainPage extends BasePage {
    public ReturnMainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButton() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }
}
