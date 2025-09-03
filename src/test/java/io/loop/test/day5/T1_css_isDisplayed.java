package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_css_isDisplayed {
    
    /*
    https://the-internet.herokuapp.com/forgot_password
     */

    public static void main(String[] args) {
        
        // setup driver and navigate
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(GeneralConstants.HEROKUAPP_URL);

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));

        // print out the text of the element
        System.out.println("forgotPasswordHeading.getText() = " + forgotPasswordHeading.getText());

        // isDisplayed() boolean - will return true of false depending on the element is displayed at html
        System.out.println("forgotPasswordHeading.isDisplayed() = " + forgotPasswordHeading.isDisplayed());

        if(forgotPasswordHeading.isDisplayed()){
            System.out.println("test pas");
        } else {
            System.out.println("test fail");
        }
    }
    
}













