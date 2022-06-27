package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WizartScreen extends BaseScreen{
    public WizartScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.example.svetlana.scheduler:id/wizard_settings_skip']")
    MobileElement skipWizart;


    public HomeScreen skipWizard(){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.visibilityOf(skipWizart));
        skipWizart.click();
        return new HomeScreen(driver);
    }
}
