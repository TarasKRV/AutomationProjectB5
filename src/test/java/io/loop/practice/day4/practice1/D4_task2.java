package io.loop.practice.day4.practice1;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D4_task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.get(DocuportConstants.DOCUPORT_TEST);

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD);

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();



        Thread.sleep(3000);

        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
        continueButton.click();




        Thread.sleep(3000);

        WebElement actualTextAppointment = driver.findElement(By.cssSelector("h3[class='text-h6']"));
        System.out.println(actualTextAppointment.getText());

        if(actualTextAppointment.getText().equals(DocuportConstants.EXPECTED_TEXT_APPOINTMENT)){
            System.out.println("Expected text appointment: \"" + DocuportConstants.EXPECTED_TEXT_APPOINTMENT + "\" matches actual text appointment: \"" + actualTextAppointment.getText() + "\" => TEST PASS");
        } else {System.out.println("Expected text appointment: \"" + DocuportConstants.EXPECTED_TEXT_APPOINTMENT + "\" not matches actual text appointment: \"" + actualTextAppointment.getText() + "\" => TEST FAIL");

        }

        WebElement buttonBG = driver.findElement(By.cssSelector("div[class='v-avatar primary']>span"));
        buttonBG.click();


        Thread.sleep(3000);


        WebElement logOutButton = driver.findElement(By.cssSelector("div[id='list-item-154']>div[class='v-list-item__title']>span[class='body-2']"));
        Thread.sleep(3000);
        logOutButton.click();



        Thread.sleep(3000);
        WebElement actualTextLogin = driver.findElement(By.cssSelector("h1[class='text-h5 font-weight-medium mb-6']"));
        System.out.println(actualTextLogin.getText());

        if(actualTextLogin.getText().equals(DocuportConstants.EXPECTED_TEXT_LOGIN)){
            System.out.println("Expected text login: \"" + DocuportConstants.EXPECTED_TEXT_LOGIN + "\" matches actual text: \"" + actualTextLogin.getText() + "\" => TEST PASS");
        } else {System.out.println("Expected text login: \"" + DocuportConstants.EXPECTED_TEXT_LOGIN + "\" not matches actual text: \"" + actualTextLogin.getText() + "\" => TEST FAIL");

        }
    }
}
