package tests;

import org.junit.Test;

import pages.SigninPage;

public class SignInTest extends BaseTest {
    public SigninPage signinPage;

    @Test
    public void clickonSignInButton(){
        SigninPage signinPage = new SigninPage(driver);
        signinPage.basePage();
        signinPage.signIn();
    }

}
