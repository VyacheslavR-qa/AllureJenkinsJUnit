


import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JunitExample {

WebDriver driver;
@Attachment(value = "attachment", type = "text/plain")
    public String attachment() {
        return "<p>HELLO</p>";
    }
    @Test
    @Description("test case")
    @Epic("test1")
    public void Run() {
        WebDriver driver;
        LoginPage page = new LoginPage();

        page.Getting();
        page.Email();
        page.Password();


    }
}