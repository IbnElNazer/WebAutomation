package user;

import base.BaseTests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserUniquePage;



import static org.testng.Assert.*;

public class LoginTests extends BaseTests { //All OK

    @Test //OK
    public void testSuccessfulLogin()  {
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("salahtest96@gmail.com");
        loginPage.clickContinue();
        loginPage.setPassword("11223344aaAA!!");
        HomePage HP =loginPage.clickSubmitButton();
        assertTrue(HP.getUserName().contains("salah"));
    }

    @Test //OK
    public void testFailedLoginInvalidPassword()  {
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("youngshark96@gmail.com");
        loginPage.clickContinue();
        loginPage.setPassword("swewq34");
        loginPage.clickSubmitButton();
        assertEquals("Your password is incorrect",loginPage.getInvalidPasswordMessage());
    }

    @Test //OK
    public void testFailedLoginInvalidEmail(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("youngshark996@gmail.com");
        loginPage.clickContinue();
        assertEquals("We cannot find an account with that email address",loginPage.getInvalidEmailMessage());
    }


    @Test //OK
    public void testFailedLoginEmptyPassword(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.setEmail("youngshark96@gmail.com");
        loginPage.clickContinue();
        loginPage.setPassword("");
        loginPage.clickSubmitButton();
        assertEquals("Enter your password",loginPage.getEmptyPasswordMessage());
    }

    @Test //OK
    public void testFailedLoginEmptyEmail(){
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.clickContinue();
        System.out.println(loginPage.getEmptyEmailMessage());
        assertEquals(loginPage.getEmptyEmailMessage(),"Enter your email or mobile phone number");
    }

}
