package tests;

import org.junit.Test;

import pages.PopularPage;
import pages.SigninPage;

public class PopularTest extends BaseTest {
    public SigninPage signinPage;
    public PopularPage popularPage;

    int numberOfAllitems = 7;

    @Test
    public void numberOfPopularItems(){
        SigninPage signinPage = new SigninPage(driver);
        PopularPage popularPage = new PopularPage(driver);
        signinPage.basePage();
        popularPage.numberOfItems(numberOfAllitems);

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


    }
    
}


