import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static final String DriverProperty = "webdriver.chrome.driver";
    public static final String LocalDriver = "src\\test\\WebDrivers\\chromedriver.exe";
    protected WebDriver driver;

    public void Setup() {
        System.setProperty(DriverProperty, LocalDriver);

    }


}