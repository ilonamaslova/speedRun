import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        driver.get("https://eatstreet.com/signin");
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));

    }

    public WebElement getPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement getErrorMSG() {
        return driver.findElement(By.xpath("//span[contains(text(), 'The login information you entered is incorrect.')]"));
    }

    public void closeModal() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

    public WebElement clickInImage() {
        return driver.findElement(By.xpath("//img[@class='logo-alternate']"));
    }
}
