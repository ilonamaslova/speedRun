package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void getNavigation() {
        driver.get("https://rozetka.com.ua/ua/");
    }

    public WebElement getImageSmile() {
        return getElementByXpath("//img[@alt='Rozetka Logo']");
    }

    public WebElement getBtnMenu() {
        return getElementByXpath("//button[@id='fat-menu']");
    }

    public WebElement checkInput() {
        return getElementByXpath("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']");
    }
}
