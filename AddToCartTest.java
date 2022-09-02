package tests;

import org.junit.Test;

import pages.AddToCartPage;
import pages.SigninPage;

public class AddToCartTest extends BaseTest {
    public SigninPage signinPage;
    public AddToCartPage addToCartPage;

    @Test
    public void addToCart(){
        SigninPage signinPage = new SigninPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);

        signinPage.basePage();
        addToCartPage.tShirtButton();
        addToCartPage.clickOnViewList();
        addToCartPage.addToCart();

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
   


}
