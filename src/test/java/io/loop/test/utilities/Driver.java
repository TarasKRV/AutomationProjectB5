package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {


    private Driver() {

    }

    public static WebDriver driver;


    /**
     * Singleton pattern
     * @return
     */

    public static WebDriver getDriver() {

        if (driver == null) {
            String browserType = ConfigurationReader.getProperties("browser");
            ChromeOptions options = new ChromeOptions();
            switch (browserType.toLowerCase()) {
                case "chrome" -> {
                options.addArguments("--disable-blink-features=AutomationControlled");
                driver = new ChromeDriver(options);}
                case "firefox" -> driver = new FirefoxDriver();
                case "safari" -> driver = new SafariDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    /**
     * Closing the driver
     * @author nsh
     */

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
