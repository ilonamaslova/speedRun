import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class TestSitePage extends BasePage {
    public TestSitePage(WebDriver driver){
        super(driver);
    }
    public void navigate(){
        driver.get("https://eatstreet.com/");
    }

    public WebElement clickGotIt() {
        return driver.findElement(By.xpath("//button[@class='btn']"));
    }

    public WebElement clickGetFed() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }

    public WebElement clickEnterAddress() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement searchChicago() {
        return getElementByXpath("//input[@id='input-food-search']");
    }

    public WebElement clickEnterAddress2() {
        return driver.findElement(By.xpath("//a[@class='btn btn-primary float-right']"));
    }
}
