package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
    /**
     * @param browserType
     * @return the driver of that browser
     * @autors
     */
    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("safari")) {
            return new ChromeDriver();
        } else {
            System.out.println("No driver found");
            System.out.println("Driver is null");
            return null;
        }


    }
}