package tests;

import org.junit.Test;

import pages.BestSellersPage;
import pages.SigninPage;

public class BestSellersTest extends BaseTest {
    public SigninPage signinPage;
    public BestSellersPage bestSellersPage;

    int expectedNumberOfSellers = 7;

    @Test
    public void numberOfSellers(){

        SigninPage signinPage = new SigninPage(driver);
        BestSellersPage bestSellersPage = new BestSellersPage(driver);
        signinPage.basePage();
        bestSellersPage.clickSellersItems();
        bestSellersPage.numberOfItems(expectedNumberOfSellers);

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
