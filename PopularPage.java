package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopularPage extends BasePage {
    public PopularPage (WebDriver driver){
        super(driver);
    }

    By numberOfItems = By.xpath("//*[@id='homefeatured']/li");

    
    public PopularPage numberOfItems(int expectedNumberOfProducts){
        int actualNumberOfItems = countItems(numberOfItems);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfItems);
        return this;
    }
    
    
}
