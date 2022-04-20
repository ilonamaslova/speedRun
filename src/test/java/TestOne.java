import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne extends TestInit {


    @Test
    public void testOne() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.navigate();
        signInPage.getEmailField().sendKeys("grtjyjjyg");
        signInPage.getPassword().sendKeys("grdfdfffgyg");
        sleep(3);
        signInPage.closeModal();
        signInPage.getLoginBtn().click();
        sleep(3);

        Assert.assertTrue(signInPage.getErrorMSG().isDisplayed());
        signInPage.clickInImage().click();

        ReturnMainPage returnMainPage = new ReturnMainPage(driver);
        sleep(2);
        Assert.assertTrue(returnMainPage.getButton().isDisplayed());
    }

    @Test
    public void TestTwo(){
        TestSitePage testSitePage = new TestSitePage(driver);

        testSitePage.navigate();
        testSitePage.clickGotIt().click();
        testSitePage.clickGetFed().click();
        testSitePage.clickEnterAddress().click();
        sleep(3);
        testSitePage.searchChicago().sendKeys("chicago\n");
        testSitePage.clickEnterAddress2().click();
        testSitePage.clickGetFed().click();

        TestChicagoPage testChicagoPage = new TestChicagoPage(driver);
        testChicagoPage.visibleCircle().isDisplayed();
        testChicagoPage.searchTanoorKabob().sendKeys("Tanoor Kabob\n");
        testChicagoPage.clickTanoorKabob().click();

        TestKabobPage testKabobPage = new TestKabobPage(driver);

        waitTillElementContainsText("//h1", "Tanoor Kabob" );
        Assert.assertTrue(testKabobPage.findText().getText().contains("Tanoor Kabob"));
    }



}