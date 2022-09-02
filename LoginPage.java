package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
        super(driver);
    }

    By usernameBy = By.id("email");
    By passwordBy = By.id("passwd");
    By loginButtonBy = By.id("SubmitLogin");
    By accountCoontainerBy = By.className("page-heading");
    By registerEmailButtonBy = By.id("email_create");
    By createAccountButtonBy = By.id("SubmitCreate");
    By registrationContainerBy = By.id("account-creation_form");
    //By errorContainerBy = By.className("alert-danger");
    By errorContainerBy = By.cssSelector("#center_column > div.alert.alert-danger > ol > li");
   


    public LoginPage login (String username, String password){
        writeText(usernameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
        return this;
    }


    public LoginPage verifySuccessfullLogin(String expectedText){
        String actualText = readText(accountCoontainerBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }


    public LoginPage verifyUnsuccessfullLogin(String expectedText){
        String actualText = readText(errorContainerBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }


    public LoginPage registration (String email){
        writeText(registerEmailButtonBy, email);
        click(createAccountButtonBy);
        return this;
    }

    public LoginPage verifySuccessRegistration(){
        waitVisability(registrationContainerBy);
        return this;
    }
    


    
}
