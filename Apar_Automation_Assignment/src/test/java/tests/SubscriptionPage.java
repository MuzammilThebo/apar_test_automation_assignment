package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SubscriptionPage {
    private WebDriver driver;

    // Updated XPath for each package's price
    private By litePackagePrice = By.xpath("//*[@id='currency-lite']/b");
    private By classicPackagePrice = By.xpath("//*[@id='currency-classic']/b");
    private By premiumPackagePrice = By.xpath("//*[@id='currency-premium']/b");

    public SubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to get the price for each package
    public String getLitePackagePrice() {
        return driver.findElement(litePackagePrice).getText();
    }

    public String getClassicPackagePrice() {
        return driver.findElement(classicPackagePrice).getText();
    }

    public String getPremiumPackagePrice() {
        return driver.findElement(premiumPackagePrice).getText();
    }

    // Navigates to the specified country
    public void goToCountry(String countryCode) {
        driver.get("https://subscribe.stctv.com/" + countryCode + "-en");
    }
}
