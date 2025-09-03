package io.loop.test.day6;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_radio_button {

    public static void main(String[] args) {
        /*
        https://loopcamp.vercel.app/radio-buttons.html
        wait implicitly 10 seconds
        is selected
        is enabled
         */

            WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
            driver.manage().window().maximize();
            driver.get(LoopCampConstants.RADIOBUTTON_URL);

            // selenium 3 wait
            // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // selenium 4 wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id = 'red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id = 'green']"));

        //isSelected
        System.out.println("red.isSelected() Before clicking = " + red.isSelected());

        // click the red radio button
        red.click();
        System.out.println("red.isSelected() After clicking = " + red.isSelected());

        // click green button
        green.click();

        System.out.println("green.isSelected() = " + green.isSelected());

        // isEnabled()
        System.out.println("red.isEnabled() = " + red.isEnabled());
        System.out.println("green.isEnabled() = " + green.isEnabled());

    }

}









