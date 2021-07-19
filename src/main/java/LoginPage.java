import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class LoginPage {






    @Attachment(value = "file", type = "jpg")
    public static byte[] getByte(String name) throws IOException {
        return Files.readAllBytes(Paths.get("src/main/resources", name));
    }


    @Step

    public void Getting(){
System.out.println("Run started");
    }
    @Step

    public  void Email(){

        System.out.println("email is entered");

    }
@Step
    public void Password() {
        System.out.println("Success");
    }

}
