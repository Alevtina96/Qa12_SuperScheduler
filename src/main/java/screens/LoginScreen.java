package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginScreen extends BaseScreen{
    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[resource-id='com.example.svetlana.scheduler:id/log_email_input']")
    MobileElement emailEditText;

    @FindBy(xpath = "//*[resource-id='com.example.svetlana.scheduler:id/log_password_input']")
    MobileElement passwordEditText;

    @FindBy(xpath = "//*[resource-id='com.example.svetlana.scheduler:id/login_btn']")
    MobileElement loginButton;

    public LoginScreen fillEmail(String email){
//waite open form
        new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOf(emailEditText));
        //return new LoginScreen(driver);
        type(emailEditText,email);
        return this; //мы заменяем экземпляр этого класса
    }

    public LoginScreen fillPassword(String password){
        type(passwordEditText,password);
        return this; //если мы остаемся на этом же экране то тогда мы пишем this
    }

    public HomeScreen clickLoginButton(){
        driver.hideKeyboard(); //для закрытия клавитуры и нажатия на трегугольник что бы можно было сделать клик
loginButton.click();
        return new HomeScreen(driver); //пишем так потому что мы после клика переходим на экран хоум
    }

    public WizartScreen clickLoginButtonForReg(){
        driver.hideKeyboard();
        loginButton.click();
        return new WizartScreen(driver);
    }
}
