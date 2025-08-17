package io.loop.test.day5;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.*;
/*
    1. open chrome
    2. go to docuport
    3. click on forgot password
    4. validate url contains: reset-password
    5. validate - Enter the email address associated with your account
    6. enter forgotpasswordg1@gmail.com to email box
    7. validate send button is displayed
    8. validate cancel button is displayed
    9. click send button
    10. validate - We've send you an email with a link to reset your password. Please check your email
     */


public class T2_xpath_getText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

       // driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);

        WebElement forgotPasswordButton = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        forgotPasswordButton.click();

       driver.getCurrentUrl();

       if (driver.getCurrentUrl().equals(DocuportConstants.EXPECTED_URL_FORGOT_PASSWORD)) {
           System.out.println("Expected URL test passed");
       }else  {
           System.out.println("Test failed");
       }

       Thread.sleep(2000);

    WebElement enterFogotPassword = driver.findElement(By.xpath("//div[contains(text(), 'Enter')]"));
      System.out.println("Is \"enter forgot password\" displayed - " + enterFogotPassword.isDisplayed());

      Thread.sleep(2000);

    WebElement emailInputBox = driver.findElement(By.xpath("//input[contains(@id,'input')]"));
      emailInputBox.click();
      emailInputBox.sendKeys(DocuportConstants.RESET_PASSWORD_EMAIL);



    WebElement sendButton = driver.findElement(By.xpath("//span[normalize-space()='Send']"));

      if(sendButton.isDisplayed()) {
          System.out.println("Test send button is displayed passed");
      }else {
          System.out.println("Test failed");
      }


    WebElement cancelButton = driver.findElement(By.xpath("//span[contains(text(), 'Cancel')]"));

        if(cancelButton.isDisplayed()) {
            System.out.println("Test cancel button is displayed passed");
        }else {
            System.out.println("Test failed");
        }

    sendButton.click();

    //    WebElement succesMessage = driver.findElement(By.xpath("//span[@class='body-1']"));
    //        System.out.println(succesMessage.getText());


    WebElement succesMessage;

    try{
    succesMessage = driver.findElement(By.xpath("//span[@class='body-1']"));
    } catch (NoSuchElementException e) {
    e.printStackTrace();
    Thread.sleep(4000);
    succesMessage = driver.findElement(By.xpath("//span[@class='body-1']"));
    }


        System.out.println("Succes message: " + succesMessage.getText());

        Thread.sleep(10000);

        try {
            System.out.println("Succes message: " + succesMessage.getText());
        }catch (StaleElementReferenceException e) {
            e.printStackTrace();
            System.out.println("Element is not here anymore");
        }
    driver.quit();
    }
}
