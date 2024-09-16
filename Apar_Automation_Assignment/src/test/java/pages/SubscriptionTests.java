package tests;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SubscriptionPage;
import org.testng.Assert;

public class SubscriptionTests extends BaseTest {
    SubscriptionPage subscriptionPage;

    @BeforeClass
    public void setUpPage() {
        subscriptionPage = new SubscriptionPage(driver);  // Initialize once in @BeforeClass
    }

    @Test
    public void validateSubscriptionPrices() {
        // Navigate to Saudi Arabia's page
        subscriptionPage = new SubscriptionPage(driver);
        subscriptionPage.goToCountry("sa");

        // Extract prices
        String litePrice = subscriptionPage.getLitePackagePrice();
        String classicPrice = subscriptionPage.getClassicPackagePrice();
        String premiumPrice = subscriptionPage.getPremiumPackagePrice();

        // Validation
        Assert.assertEquals(litePrice, "15", "LITE package price mismatch");
        Assert.assertEquals(classicPrice, "25", "CLASSIC package price mismatch");
        Assert.assertEquals(premiumPrice, "60", "PREMIUM package price mismatch");
    }
    
    @Test
    public void validateKuwaitSubscriptionPrices() {
        // Navigate to Kuwait's page
        subscriptionPage = new SubscriptionPage(driver);
        subscriptionPage.goToCountry("kw");

        // Extract prices
        String litePrice = subscriptionPage.getLitePackagePrice();
        String classicPrice = subscriptionPage.getClassicPackagePrice();
        String premiumPrice = subscriptionPage.getPremiumPackagePrice();

        // Validation (Expected values for Kuwait)
        Assert.assertEquals(litePrice, "1.2", "LITE package price mismatch");
        Assert.assertEquals(classicPrice, "2.5", "CLASSIC package price mismatch");
        Assert.assertEquals(premiumPrice, "4.8", "PREMIUM package price mismatch");
    }
    
    @Test
    public void validateBahrainSubscriptionPrices() {
        // Navigate to Bahrain's page
        subscriptionPage = new SubscriptionPage(driver);
        subscriptionPage.goToCountry("bh");

        // Extract prices
        String litePrice = subscriptionPage.getLitePackagePrice();
        String classicPrice = subscriptionPage.getClassicPackagePrice();
        String premiumPrice = subscriptionPage.getPremiumPackagePrice();

        // Validation (Expected values for Bahrain)
        Assert.assertEquals(litePrice, "2", "LITE package price mismatch");
        Assert.assertEquals(classicPrice, "3", "CLASSIC package price mismatch");
        Assert.assertEquals(premiumPrice, "6", "PREMIUM package price mismatch");
    }
}
