package tests;

import manager.Configuration;
import org.testng.annotations.Test;
import screens.LoginScreen;

public class LoginTests extends Configuration {

    @Test
    public void loginSuccess(){
        new LoginScreen(driver)
                .fillEmail("tel@gmail.com")
                .fillPassword("Ttel12345$")
                .clickLoginButton()
                .isPlusButtonPresentAssert()
                .openMenu()
                .logout();

        //Assert
    }

    @Test
    public void loginSuccessSecond(){
        new LoginScreen(driver)
                .fillEmail("wick@gmail.com")
                .fillPassword("Ww12345$")
                .clickLoginButton()
                .isPlusButtonPresentAssert()
                .openMenu()
                .logout();
    }
}
