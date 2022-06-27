package tests;

import manager.Configuration;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.SplashScreen;

public class RegistrationTests extends Configuration {

    @Test
    public void registrationSuccess(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
 new SplashScreen(driver)
         .checkVersion("0.0.3")
         .fillEmail("tel@gmail.com") //waite
         .fillPassword("Ttel12345$")
         .clickLoginButtonForReg()
         .skipWizard()
         .openMenu()
                .logout();
    }

    @Test
    public void registrationSuccessSecond(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        //new SplashScreen(driver)
                //.checkVersion("0.0.3")
        new LoginScreen(driver)
                .fillEmail("tel@gmail.com") //waite
                .fillPassword("Ttel12345$")
                .clickLoginButtonForReg()
                .skipWizard()
                .openMenu()
                .logout();
    }
}
