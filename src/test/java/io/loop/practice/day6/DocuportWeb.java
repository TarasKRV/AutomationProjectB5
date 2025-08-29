package io.loop.practice.day6;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DocuportWeb {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(DocuportConstants.DOCUPORT_TEST);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @Test
    public void docuportWebTest() throws InterruptedException {

        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD);

        WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']/span[@class='v-btn__content']"));
        logInButton.click();


        WebElement receivedDocuments = driver.findElement(By.xpath("//a[@href='/received-docs']"));
        receivedDocuments.click();


        WebElement searchButton = driver.findElement(By.xpath("//span[text()='Search']"));
        searchButton.click();


        WebElement statusDropdown =  driver.findElement(By.xpath("//div[@role='button'][@aria-haspopup='listbox'][@aria-expanded='false']"));
        statusDropdown.click();


       WebElement inProgress = driver.findElement(By.xpath("//div[text()='In progress']"));
       inProgress.click();

       Thread.sleep(1000);




    }
}
//        WebElement searchButton = driver.findElement(By.xpath("//button[@type='button'][3]"));
//        searchButton.click();
//
//       WebElement statusDropdown =  driver.findElement(By.xpath("//div[@class='v-input__control']/child::div[@role='button'][1]"));
//       statusDropdown.click();
//
//
//