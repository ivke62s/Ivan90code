package tests;

import java.util.UUID;

import org.junit.Test;

import pages.LoginPage;
import pages.RegistrationPage;
import pages.SigninPage;

public class RegistrationTest extends BaseTest {

    public LoginPage loginPage;
    public SigninPage signinPage;
    public RegistrationPage registrationPage;

    String email = UUID.randomUUID().toString() + "@test.com";
    String name = "Ivan";
    String lastName = "Markovski";
    String password = "testing123";
    String company = "FIS";
    String address = "Nehruova 61";
    String city = "Los Angeles";
    String zipCode = "11080";
    String phoneNumber = "0643571992";

    @Test
    public void verifyRegistrationPage(){
        LoginPage loginPage = new LoginPage(driver);
        SigninPage signinPage = new SigninPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        signinPage.basePage();
        signinPage.signIn();
        loginPage.registration(email);
        loginPage.verifySuccessRegistration();
        registrationPage.pickGender();
        registrationPage.createFirstName(name);
        registrationPage.createLastName(lastName);
        registrationPage.createPassword(password);
        registrationPage.chooseDay();
        registrationPage.chooseMonth();
        registrationPage.chooseYear();
        registrationPage.companyName(company);
        registrationPage.adress(address);
        registrationPage.city(city);
        registrationPage.chooseState();
        registrationPage.zipCode(zipCode);
        registrationPage.phoneNumber(phoneNumber);
        registrationPage.registerButton();
        registrationPage.signOutButton();
        

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

       
    }

    
}
