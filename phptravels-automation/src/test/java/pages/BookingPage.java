package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class BookingPage {

    WebDriver driver;
    WebDriverWait wait;

    public BookingPage(WebDriver driver) {


        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//button[contains(text(),'Book Now')]")
    WebElement bookNow;

    @FindBy(xpath = "//button[contains(text(),'Confirm Booking')]")
    WebElement confirmBooking;

    @FindBy(xpath = "//h4[contains(text(),'Your booking status is')]")
    WebElement bookingStatus;

    public void bookHotel() {
        wait.until(ExpectedConditions.elementToBeClickable(bookNow)).click();
        wait.until(ExpectedConditions.elementToBeClickable(confirmBooking)).click();
    }

    public boolean isBookingConfirmed() {
        return wait.until(ExpectedConditions.visibilityOf(bookingStatus)).isDisplayed();


    }
}
