package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestUtil {

    public static final long DEFAULT_WAIT = 10;

    // Wait until an element is visible
    public static void waitForElementToBeVisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Take a screenshot and store it in a specified directory
    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        // Append timestamp to avoid FileAlreadyExistsException
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = LocalDateTime.now().format(formatter);
        String fullScreenshotName = screenshotName + "_" + timestamp;
        
        // Create directory if it doesn't exist
        String screenshotDir = "./screenshots/";
        Path path = Paths.get(screenshotDir);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Capture and save screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(screenshot.toPath(), Paths.get(screenshotDir + fullScreenshotName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Custom sleep method (if needed)
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
