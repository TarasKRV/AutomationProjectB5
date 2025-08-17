package io.loop.test.day6;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class T1_radio_button {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.get(LoopCampConstans.RADIO_BUTTON_URL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id='red']"));

        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));

        System.out.println("red.isSelected() before click: " + red.isSelected());

        red.click();

        System.out.println("red.isSelected() after click: " + red.isSelected());

        green.click();

        System.out.println("green.isSelected: " + green.isSelected());

        System.out.println("red.isEnabled: " + red.isEnabled());
        System.out.println("green.isEnabled: " + green.isEnabled());
    }
}
