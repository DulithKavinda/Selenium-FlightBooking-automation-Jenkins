package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetup {
    public static WebDriver getDriver() {


        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();


    }
}
