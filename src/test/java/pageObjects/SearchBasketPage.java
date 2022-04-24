package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class SearchBasketPage extends BasePage {
    public SearchBasketPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextForCustomer() {
        waitTillElementContainsText("//h4[@class='cart-dummy__heading']", "Кошик порожній");
        return getElementByXpath("//h4[@class='cart-dummy__heading']");
    }
}
