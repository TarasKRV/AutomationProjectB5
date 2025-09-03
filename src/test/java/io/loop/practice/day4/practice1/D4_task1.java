package io.loop.practice.day4.practice1;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D4_task1 {
    public static void main(String[] args) {


        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        //driver.manage().window().maximize();

        driver.navigate().to(LoopCampConstants.LOOPCAMP_FORGOT_PASSWORD_PAGE);

        WebElement forgotPassword = driver.findElement(By.cssSelector("div.example>h2"));

        String actualForgotPassword = forgotPassword.getText();


        if (actualForgotPassword.equals(LoopCampConstants.EXPECTED_HEADER_FORGOT_PASSWORD_LOOPCAMP)){
            System.out.println("Expected Forgot Password: \"" + LoopCampConstants.EXPECTED_HEADER_FORGOT_PASSWORD_LOOPCAMP + "\" matches actual forgot password: \"" + actualForgotPassword + "\" => TEST PASS");

        }else {
            System.out.println("TEST FAIL");
        }


        System.out.println("-------------------------");
        WebElement eMail = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>label"));

        String actualeMail = eMail.getText();


        if (actualeMail.equals(LoopCampConstants.EXPECTED_EMAIL_LOOPCAMP)){
            System.out.println("Expected E-mail: \"" + LoopCampConstants.EXPECTED_EMAIL_LOOPCAMP + "\" matches actual E-mail: \"" + actualeMail + "\" => TEST PASS");

        }else {
            System.out.println("TEST FAIL");
        }


        System.out.println("-------------------------");
        WebElement eMailInput = driver.findElement(By.cssSelector("input[type='text']"));

        String actualeMailInput = eMailInput.getDomAttribute("name");


        if (actualeMailInput.equals(LoopCampConstants.EXPECTED_EMAILINPUT_LOOPCAMP)){
            System.out.println("Expected input: \"" + LoopCampConstants.EXPECTED_EMAILINPUT_LOOPCAMP + "\" matches actual input: \"" + actualeMailInput + "\" => TEST PASS");

        }else {
            System.out.println("TEST FAIL");
        }


        System.out.println("-------------------------");
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']>i"));

        String actualRetrievePassword = retrievePassword.getText();


        if (actualRetrievePassword.equals(LoopCampConstants.EXPECTED_RETVIEVEPASSWORD_LOOPCAMP)){
            System.out.println("Expected retrieve password: \"" + LoopCampConstants.EXPECTED_RETVIEVEPASSWORD_LOOPCAMP + "\" matches actual retrieve password: \"" + actualRetrievePassword + "\" => TEST PASS");

        }else {
            System.out.println("TEST FAIL");
        }



        System.out.println("-------------------------");
        WebElement poweredByLoopcamp = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        String actualpoweredByLoopcamp = poweredByLoopcamp.getText();


        if (actualpoweredByLoopcamp.equals(LoopCampConstants.EXPECTED_POWEREDBY_LOOPCAMP)){
            System.out.println("Expected powered by loopcamp: \"" + LoopCampConstants.EXPECTED_POWEREDBY_LOOPCAMP + "\" matches actual powered by loopcamp: \"" + actualpoweredByLoopcamp + "\" => TEST PASS");

        }else {
            System.out.println("TEST FAIL");
        }
    }
}
