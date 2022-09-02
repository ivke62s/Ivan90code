package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSellersPage extends BasePage {
    public BestSellersPage (WebDriver driver){
        super(driver);
    }
    
    By BestSellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By sellersItemsBy = By.xpath("//*[@id='blockbestsellers']/li");


    public BestSellersPage clickSellersItems(){
        click(BestSellersButtonBy);
        return this;
    }


    public BestSellersPage numberOfItems(int expectedNumber){
        int actualNumberOfItems = countItems(sellersItemsBy);
        assertIntegerEquals(expectedNumber, actualNumberOfItems);
        return this;
    }

}
