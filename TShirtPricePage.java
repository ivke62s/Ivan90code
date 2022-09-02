package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class TShirtPricePage extends BasePage {
    public TShirtPricePage(WebDriver driver){
        super(driver);
    }

    By checkOutBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
    By productPriceBy = By.id("total_product");
    By shippingPriceBy = By.id("total_shipping");
    By totalPriceBy = By.id("total_price");

    public TShirtPricePage toCheckoutButton(){
        click(checkOutBy);
        return this;
    }

    public TShirtPricePage verifyTotalPrice(double actualPrice){
        double productPrice = Double.parseDouble(driver.findElement(productPriceBy).getText().substring(1));
        double shippingPrice = Double.parseDouble(driver.findElement(shippingPriceBy).getText().substring(1));
        double expectedPrice = productPrice + shippingPrice;
        Assert.assertEquals(expectedPrice, actualPrice, delta);
        return this;
    }

    
    

    
    
}
