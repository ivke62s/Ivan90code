package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage {
    public AddToCartPage(WebDriver driver){
        super(driver);
    }

    By tShirtButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By viewListButtonBy = By.xpath("//*[@id='list']/a/i");
    By addToCartBy = By.xpath("//*[@id='center_column']/ul/li/div/div/div[3]/div/div[2]/a[1]/span");

    public AddToCartPage tShirtButton(){
        click(tShirtButtonBy);
        return this;
    }

    public AddToCartPage clickOnViewList(){
        click(viewListButtonBy);
        return this;
    }

    public AddToCartPage addToCart(){
        click(addToCartBy);
        return this;
    }

   
}