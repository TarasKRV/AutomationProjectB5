package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_forgot_password {

       /*
    validate forget password
    identify reset password heading using css and go from parent to child
     */

    public static void main(String[] args) {

        //get driver and maximize
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        // go to the url
        driver.get(DocuportConstants.DOCUPORT_TEST);

        // locate the forget password link with css and click
        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgetPasswordLink.click();

        //locate forgot password heading
        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println(forgetPasswordHeading.getText());



    }

}









