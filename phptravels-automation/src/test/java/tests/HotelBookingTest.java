import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Open browser
        driver.get("https://example.com");     // Navigate to website
        System.out.println("Title: " + driver.getTitle());
        driver.quit();                         // Close browser
    }
}


import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Open browser
        driver.get("https://example.com");     // Navigate to website
        System.out.println("Title: " + driver.getTitle());
        driver.quit();                         // Close browser
    }
}