package pages.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;

    protected void clickLink(By element){
        driver.findElement(element).click();
    }
    protected WebElement chooseFromListOfElements(int x, By element){
        return findLinks(element).get(x-1);
    }

    protected String getText(By element){
        return driver.findElement(element).getText();
    }
    protected List<WebElement> findLinks(By element){
        return driver.findElements(element);
    }
    protected void waiter(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
    }
    public void sendData(By element,String data){
        driver.findElement(element).sendKeys(data);
    }

    public void sendEmailAndPassword(){
        By emailField= By.id("ap_email");
        By passwordField= By.id("ap_password");
        By submitButton = By.id("signInSubmit");
        driver.findElement(emailField).sendKeys("salahtest96@gmail.com");
        driver.findElement(passwordField).sendKeys("11223344aaAA!!");
        clickLink(submitButton);
    }
    protected void hoverToElement(By element){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(element)).perform();
    }
}
