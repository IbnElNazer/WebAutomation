package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountCreationPage {
    private WebDriver driver;
    private By nameField= By.id("ap_customer_name");
    private By emailField= By.id("ap_email");
    private By passwordField= By.id("ap_password");
    private By passwordCheckField= By.id("ap_password_check");
    private By continueButton= By.id("continue");
    private By puzzleCheckText= By.className("a-size-large");
    private By solvePuzzleButton= By.id("home_children_button");
    private By OTPEmailField = By.id("cvf-input-code");
    private By verifyButton= By.id("cvf-submit-otp-button-announce");
    private By MobileField = By.className("cvf_phone_num");
    private By addMobileButton= By.id("a-autoid-0-announce");
    private By OTPPhoneField = By.cssSelector("type=\"text");
    private By CreateButton= By.id("a-autoid-0-announce");
}
