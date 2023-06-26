package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Message;

public class LoginPage {

    private WebDriver driver;
    private By emailField= By.id("ap_email");
    private By passwordField= By.id("ap_password");
    private By continueButton= By.id("continue");
    private By submitButton= By.id("signInSubmit");
    private  By invalidPasswordMessage = By.className("a-list-item");
    private  By invalidEmailMessage = By.className("a-list-item");
    private  By emptyPasswordMessage = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/div[2]/div/div");
    private  By emptyEmailMessage = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/div/div/div");
    private By creatNewAccountButton= By.id("createAccountSubmit");

    public String getInvalidPasswordMessage() {
       String Message;
        return Message = driver.findElement(invalidPasswordMessage).getText();
    }

    public String getInvalidEmailMessage() {
        String Message;
        return Message = driver.findElement(invalidEmailMessage).getText();
    }

    public String getEmptyPasswordMessage() {
        String Message;
        return Message = driver.findElement(emptyPasswordMessage).getText();
    }

    public String getEmptyEmailMessage() {
        String Message;
        return Message = driver.findElement(emptyEmailMessage).getText();
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
    public UserUniquePage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new UserUniquePage(driver);
    }

    public void clickCreateAccount(){
        clickLink(creatNewAccountButton);
    }
        private void clickLink(By element){
            driver.findElement(element).click();
        }


   }
