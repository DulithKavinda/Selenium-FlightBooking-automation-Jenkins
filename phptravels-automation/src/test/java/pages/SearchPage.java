package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//span[text()='Search by City']")
    WebElement cityDropdown;

    @FindBy(xpath = "//input[@type='search']")
    WebElement cityInput;

    @FindBy(xpath = "//li[@role='option']")
    WebElement firstCityOption;

    @FindBy(name = "checkin")
    WebElement checkIn;

    @FindBy(name = "checkout")
    WebElement checkOut;

    @FindBy(id = "submit")
    WebElement searchButton;

    public void searchHotel(String city, String checkinDate, String checkoutDate) throws InterruptedException {

        cityDropdown.click();
        cityInput.sendKeys(city);
        Thread.sleep(2000); // wait for dropdown suggestions
        firstCityOption.click();

        checkIn.clear();
        checkIn.sendKeys(checkinDate);
        checkOut.clear();
        checkOut.sendKeys(checkoutDate);

        searchButton.click();

    }
}
