package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SearchBasketPage;
import pageObjects.SearchPhonePage;

public class TestSiteRozetka extends TestInit{

    @Test
    public void CheckElementsOnSite(){
        MainPage mainPage = new MainPage(driver);
        mainPage.getNavigation();

        Assert.assertTrue(mainPage.getImageSmile().isDisplayed());
        Assert.assertTrue(mainPage.getBtnMenu().isDisplayed());
        mainPage.checkInput().sendKeys("phone\n");

        SearchPhonePage searchPhonePage = new SearchPhonePage(driver);

        Assert.assertTrue(searchPhonePage.getWordPhone().getText().contains("«phone»"));
        Assert.assertTrue(searchPhonePage.getBtn().isDisplayed());
        searchPhonePage.clickOnBasket().click();

        SearchBasketPage searchBasketPage = new SearchBasketPage(driver);

        Assert.assertTrue(searchBasketPage.getTextForCustomer().getText().contains("Кошик порожній"));


    }
}
