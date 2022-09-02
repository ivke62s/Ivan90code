package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    public RegistrationPage (WebDriver driver) {
        super(driver);
    }
    

    By radioButtonBy = By.id("id_gender1");
    By firstNameButtonBy = By.id("customer_firstname");
    By lastNameButtonBy = By.id("customer_lastname");
    By emailButtonBy = By.id("email");
    By passwordButtonBy = By.id("passwd");
    By dayButtonBy = By.id("uniform-days");
    By monthButtonBy = By.id("uniform-months");
    By yearButtonBy = By.id("uniform-years");
    By dayOptionBy = By.xpath("//*[@id='days']/option[6]");
    By monthOptionBy = By.xpath("//*[@id='months']/option[6]");
    By yearOptionBy = By.xpath("//*[@id='years']/option[34]");
    By companyNameBy = By.id("company");
    By addressBy = By.id("address1");
    By cityBy = By.id("city");
    By stateBy = By.id("uniform-id_state");
    By stateNameBy = By.xpath("//*[@id='id_state']/option[6]");
    By zipCodeBy = By.id("postcode");
    By countryBy = By.id("uniform-id_country");
    By phoneNumberBy = By.id("phone_mobile");
    By registerButtonBy = By.id("submitAccount");
    By signOutBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");

    public RegistrationPage pickGender(){
        click(radioButtonBy);
        return this;
    }


    public RegistrationPage createFirstName(String Name){
        writeText(firstNameButtonBy, Name);
        return this;
    }

    public RegistrationPage createLastName(String Lastname){
        writeText(lastNameButtonBy, Lastname);
        return this;
    }
    
    public RegistrationPage createPassword(String Password){
        writeText(passwordButtonBy, Password);
        return this;
    }

    public RegistrationPage chooseDay(){
        click(dayButtonBy);
        click(dayOptionBy);
        return this;
    }

    public RegistrationPage chooseMonth(){
        click(monthButtonBy);
        click(monthOptionBy);
        return this;
    }

    public RegistrationPage chooseYear(){
        click(yearButtonBy);
        click(yearOptionBy);
        return this;
    }

    public RegistrationPage companyName(String text){
        writeText(companyNameBy, text);
        return this;
    }

    public RegistrationPage adress(String address1){
        writeText(addressBy, address1 );
        return this;
    }

    public RegistrationPage city(String cityName){
        writeText(cityBy, cityName );
        return this;
    }

    public RegistrationPage chooseState(){
        click(stateBy);
        click(stateNameBy);
        return this;
    }

    public RegistrationPage zipCode(String postalCode){
        writeText(zipCodeBy, postalCode );
        return this;
    }

    public RegistrationPage phoneNumber(String mobilePhone){
        writeText(phoneNumberBy, mobilePhone );
        return this;
    }

    public RegistrationPage registerButton(){
        click(registerButtonBy);
        return this;
    }

    public RegistrationPage signOutButton(){
        click(signOutBy);
        return this;
    }

}
