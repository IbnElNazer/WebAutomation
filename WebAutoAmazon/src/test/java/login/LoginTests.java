package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserUniquePage;

import java.time.Duration;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("youngshark96@gmail.com");
        loginPage.clickContinue();
        loginPage.setPassword("a1k2o3n4");
        UserUniquePage UserUniquePage1 = loginPage.clickSubmitButton();
        assertTrue(UserUniquePage1.getUserName()
                .contains("Salah"),"Good");
    }


    @Test
    public void testFailedLoginInvalidPassword()  {
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("youngshark96@gmail.com");
        loginPage.clickContinue();
        loginPage.setPassword("swewq34");
        UserUniquePage UserUniquePage1 = loginPage.clickSubmitButton();
        assertEquals("Your password is incorrect",loginPage.getInvalidPasswordMessage());
    }

    @Test
    public void testFailedLoginInvalidEmail(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("youngshark996@gmail.com");
        loginPage.clickContinue();
        assertEquals("We cannot find an account with that email address",loginPage.getInvalidEmailMessage());
    }


    //Good
    @Test
    public void testFailedLoginEmptyPassword(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("youngshark96@gmail.com");
        loginPage.clickContinue();
        loginPage.setPassword("");
        UserUniquePage UserUniquePage1 = loginPage.clickSubmitButton();
        assertEquals("Enter your password",loginPage.getEmptyPasswordMessage());
    }

    //good
    @Test
    public void testFailedLoginEmptyEmail(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.clickContinue();
        System.out.println(loginPage.getEmptyEmailMessage());
        assertEquals("We cannot find an account with that email address",loginPage.getEmptyEmailMessage());
    }
    @Test

    public void testCreateNewUserAccount(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.clickCreateAccount();

    }

}
