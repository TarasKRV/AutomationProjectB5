package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class T4_radioButton {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.get(LoopCampConstans.RADIO_BUTTON_URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            }
}
