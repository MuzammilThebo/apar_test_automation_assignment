package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestUtil;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Clear WebDriverManager cache and setup the ChromeDriver for Chrome-for-Testing
        WebDriverManager.chromedriver().clearDriverCache().setup();

        // Define Chrome options to disable WebSocket, enable headless mode, and other configurations
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("w3c", true);  // Disable WebSocket
        // options.addArguments("--headless=new");      // Enable headless mode

        // Initialize the ChromeDriver with the options
        driver = new ChromeDriver(options);

        // Maximize the window
        driver.manage().window().maximize();

        // Set an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.DEFAULT_WAIT));
    }

    @AfterClass
    public void tearDown() {
        // Capture a screenshot before closing the browser
        TestUtil.takeScreenshot(driver, "final_screenshot");

        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
