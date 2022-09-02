package tests;


import org.junit.Test;

import pages.LoginPage;
import pages.SigninPage;

public class LoginTests extends BaseTest {

    public LoginPage loginPage;
    public SigninPage signinPage;
    String emailAddress = "ivanmarkovski63s@gmail.com";
    String errorEmail = "mika.com";
    String emptyUserName = "";
    String username = "ivanmarkovski62s@gmail.com";
    String password = "testing25";
    String expectedText = "MY ACCOUNT";
    String invalidEmail = "Invalid email address.";
    String accountEmail = "ivan.markovski62@gmail.com";
    String emptyEmail = "An email address required.";
    String registrationPage = "YOUR PERSONAL INFORMATION";
    
    @Test
    public void verifySuccesfullLogin(){
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.login(username, password);
        loginPage.verifySuccessfullLogin(expectedText);
        

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    @Test
    public void verifyUnsuccesfullLogin(){
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.login(errorEmail, password);
        loginPage.verifyUnsuccessfullLogin(invalidEmail);
        

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

       
    }
   

    @Test
    public void verifyEmptyEmailLogin(){
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.login(emptyUserName, password);
        loginPage.verifyUnsuccessfullLogin(emptyEmail);
        

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }


        @Test
    public void verifyRegistrationLogin(){
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.registration(emailAddress);
        loginPage.verifySuccessRegistration();

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
       
    }

    
       
    

   
    
}
