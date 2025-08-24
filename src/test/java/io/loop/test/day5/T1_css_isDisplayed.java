package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_css_isDisplayed {

    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
       // driver.manage().window().maximize();

        driver.get(GeneralConstants.HEROKUAPP_URL_FPASSWORD);

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));


        System.out.println("Forgot password text: " + forgotPasswordHeading.getText());

        System.out.println("Forgot password is displayed: " +forgotPasswordHeading.isDisplayed());

        if (forgotPasswordHeading.isDisplayed()) {
            System.out.println("Test pass");
        }else  {
            System.out.println("Test failed");
        }


    }
}
