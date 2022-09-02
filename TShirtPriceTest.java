package tests;

import org.junit.Test;

import pages.AddToCartPage;
import pages.SigninPage;
import pages.TShirtPricePage;

public class TShirtPriceTest extends BaseTest {
    public SigninPage signinPage;
    public AddToCartPage addToCartPage;
    public TShirtPricePage tShirtPricePage;

    double totalPrice = 18.51;

    @Test
    public void totalPrice(){
        SigninPage signinPage = new SigninPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        TShirtPricePage tShirtPricePage = new TShirtPricePage(driver);
        signinPage.basePage();
        addToCartPage.tShirtButton();
        addToCartPage.clickOnViewList();
        addToCartPage.addToCart();
        tShirtPricePage.toCheckoutButton();
        tShirtPricePage.verifyTotalPrice(totalPrice);

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }



    }
    
}
