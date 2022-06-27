package tests;

import manager.Configuration;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.LoginScreen;

public class LoginTestsAssert extends Configuration {

    @Test
    public void loginSuccess(){
        boolean isPlusPressent = new LoginScreen(driver)
                .fillEmail("tel@gmail.com")
                .fillPassword("Ttel12345$")
                .clickLoginButton()
                .isPlusButtonPresent(); //or true or false

        Assert.assertTrue(isPlusPressent);
        //Assert
    }

    @Test
    public void loginSuccessSecond(){
        boolean isPlusPressent = new LoginScreen(driver)
                .fillEmail("wick@gmail.com")
                .fillPassword("Ww12345$")
                .clickLoginButton()
                .isPlusButtonPresent();

        Assert.assertTrue(isPlusPressent);

    }

    @AfterMethod
    public void postCondition(){
        new HomeScreen(driver)
                .openMenu()
                .logout();
    }
}
