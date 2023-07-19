package pages.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base.BasePage;

public class LoginPage extends BasePage { //done


    private By emailField= By.id("ap_email");
    private By passwordField= By.id("ap_password");
    private By continueButton= By.id("continue");
    private By submitButton= By.id("signInSubmit");
    private  By invalidPasswordMessage = By.className("a-list-item");
    private  By invalidEmailMessage = By.className("a-list-item");
    private  By emptyPasswordMessage = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/div[2]/div/div");
    private  By emptyEmailMessage = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/div/div/div");


    public String getInvalidPasswordMessage() {
       String Message;
        return Message = getText(invalidPasswordMessage);
    }

    public String getInvalidEmailMessage() {
        String Message;
        return Message = getText(invalidEmailMessage);
    }

    public String getEmptyPasswordMessage() {
        String Message;
        return Message = getText(emptyPasswordMessage);
    }

    public String getEmptyEmailMessage() {
        String Message;
        return Message = getText(emptyEmailMessage);
    }




    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickContinue(){
        clickLink(continueButton);
    }

    public void setPassword(String Password){
        driver.findElement(passwordField).sendKeys(Password);
    }
    public HomePage clickSubmitButton(){
        clickLink(submitButton);
        return new HomePage(driver);
    }






}
