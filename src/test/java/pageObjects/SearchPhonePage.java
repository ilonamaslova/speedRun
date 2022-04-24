package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class SearchPhonePage extends BasePage {

    public SearchPhonePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getWordPhone() {
        return getElementByXpath("//h1");
    }

    public WebElement getBtn() {
        return getElementByXpath("//button[@class='header__button ng-tns-c107-1']");
    }

    public WebElement clickOnBasket() {
        return getElementByXpath("//button[@opencart]");
    }
}
