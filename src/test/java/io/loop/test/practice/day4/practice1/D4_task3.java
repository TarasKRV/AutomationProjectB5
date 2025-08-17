package io.loop.test.practice.day4.practice1;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D4_task3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.get(DocuportConstants.DOCUPORT_TEST);


        WebElement usernamePlaceholder = driver.findElement(By.cssSelector("div[class='v-text-field__slot']"));
        usernamePlaceholder.getText();

        if (usernamePlaceholder.getText().equals("Username or email")) {
            System.out.println("User name placeholder test - passed");
        }else  {
            System.out.println("Test failed");
        }


        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("div[class='v-text-field__slot']>label[for='input-15']"));
        usernamePlaceholder.getText();

        if (passwordPlaceholder.getText().equals("Password")) {
            System.out.println("Password placeholder test - passed");
        }else {
            System.out.println("Test failed");
        }

            Thread.sleep(2000);

            WebElement logInButton = driver.findElement(By.cssSelector("button[type='submit']"));
            logInButton.click();

            Thread.sleep(2000);

            WebElement userNameOrEmail = driver.findElement(By.cssSelector(".mb-4:first-of-type .v-messages__message"));
            userNameOrEmail.getText();
            if (userNameOrEmail.getText().equals("Please enter your username or email address")) {
                System.out.println("User name error message test - passed");
            }else   {
                System.out.println("Test failed");
            }

            Thread.sleep(2000);


            WebElement passwordWrong =driver.findElement(By.cssSelector(".mb-4:nth-of-type(2) .v-messages__message"));
            passwordWrong.getText();

        if (passwordWrong.getText().equals("Please enter your password")) {
                System.out.println("Password error message test - passed");
            }else   {
                System.out.println("Test failed");
            }
        }
    }

