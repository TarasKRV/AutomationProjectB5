package io.loop.practice.day8;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExtraTask extends TestBase {
    @Test
    public void testExtraTask() throws InterruptedException {
        driver.get("https://app.docuport.app/company-formation/resident");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //PAGE 1

        WebElement llcButton = driver.findElement(By.xpath("//label[.='LLC']"));
        llcButton.click();

        WebElement marylandButton = driver.findElement(By.xpath("//label[.='Maryland']"));
        marylandButton.click();

        WebElement companyName = driver.findElement(By.xpath("//label[text()='Legal Company Name  *']/following-sibling::input"));
        companyName.sendKeys("Granite");

        WebElement dba =  driver.findElement(By.xpath("//label[text()='DBA (Doing Business As)']/following-sibling::input"));
        dba.sendKeys("Minnesota Granite");

        WebElement industry = driver.findElement(By.xpath("//label[text()='Industry *']/following-sibling::input[1]"));
        industry.click();

        Thread.sleep(1000);
        WebElement gardening = driver.findElement(By.xpath("//div[text()='Gardening and Landscaping']"));
        gardening.click();

        WebElement firsName = driver.findElement(By.xpath("//label[text()='First name *']/following-sibling::input[1]"));
        firsName.sendKeys("Tom");

        WebElement lastName = driver.findElement(By.xpath("//label[text()='Last name *']/following-sibling::input[@id][@type][1]"));
        lastName.sendKeys("Holland");

        WebElement email = driver.findElement(By.xpath("//label[text()='Email address *']/following-sibling::input"));
        email.sendKeys("graniteMN@gmail.com");

        WebElement phoneNumber = driver.findElement(By.xpath("//label[text()='Phone number *']/following-sibling::input"));
        phoneNumber.sendKeys("+123456789101");

        WebElement fax = driver.findElement(By.xpath("//label[text()='Fax']/following-sibling::input"));
        fax.sendKeys("+13456789101");

        Thread.sleep(1000);
        WebElement nextButton = driver.findElement(By.xpath("//button[@type='submit']/child::span[1]"));
        nextButton.click();


        //PAGE 2

        Thread.sleep(1000);
        WebElement agentType = driver.findElement(By.xpath("//label[text()='Company']"));
        agentType.click();

        WebElement companyName2 = driver.findElement(By.xpath("//label[text()='Company name *']/following-sibling::input"));
        companyName2.click();
        companyName2.sendKeys("Granite");

        WebElement address = driver.findElement(By.xpath("//label[text()='Address line 1 *']/following-sibling::input"));
        address.sendKeys("Round Lake 12345");

        WebElement city = driver.findElement(By.xpath("//label[text()='City *']/following-sibling::input"));
        city.sendKeys("New Prague");

        WebElement jurisdictionButton = driver.findElement(By.xpath("//label[text()='Jurisdiction *']/following-sibling::input[1]"));
        jurisdictionButton.click();

        Thread.sleep(1000);
        WebElement jurisdiction = driver.findElement(By.xpath("//div[text()='Calvert County']/.."));
        jurisdiction.click();

        WebElement zipCode = driver.findElement(By.xpath("//label[text()='Zip code *']/following-sibling::input"));
        zipCode.sendKeys("12345");

        WebElement emailAddress = driver.findElement(By.xpath("//label[text()='Email address']/following-sibling::input"));
        emailAddress.sendKeys("graniteMN@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//form[@data-gtm-form-interact-id='1']//child::div//child::div[9]//child::div//child::div//child::div//child::div//child::input"));
        phone.click();
        Thread.sleep(1000);
        phone.sendKeys("+123456789101");

        WebElement registeredAgent = driver.findElement(By.xpath("//label[text()='Use Registered Agent Address']"));
        registeredAgent.click();

        WebElement nextButton2 = driver.findElement(By.xpath("//div[@class='v-stepper__content ma-0 pa-0'][@style='transform-origin: center top 0px;']//div[@class='d-flex align-center justify-end']//child::button[2]//span"));
        nextButton2.click();

        //PAGE 3

        WebElement firstName = driver.findElement(By.xpath("//label[text()='Share Ownership (%) *']/../../../../../../child::div/child::div/child::div/child::div/child::div/child::input[1]"));
        firstName.sendKeys("Tom");

        WebElement lastName2 = driver.findElement(By.xpath("//label[text()='Share Ownership (%) *']/../../../../../../child::div//following-sibling::div/child::div/child::div/child::div/child::div//input[1]"));
        lastName2.sendKeys("Holland");

        WebElement ownership = driver.findElement(By.xpath("//label[text()='Share Ownership (%) *']/../../../../../../child::div//following-sibling::div//following-sibling::div//following-sibling::div//child::div/child::div/child::div/child::div//input[1]"));
        ownership.sendKeys("5");

        WebElement ssn = driver.findElement(By.xpath("//label[text()='SSN of an Organizing Member *']//following-sibling::input"));
        ssn.sendKeys("123121234");

        WebElement fName = driver.findElement(By.xpath("//p[text()=' Social Security Number required to get Employment Identification Number (EIN) ']//..//label[text()='First name *']//following-sibling::input"));
        fName.sendKeys("Tom");


        WebElement lName = driver.findElement(By.xpath("//p[text()=' Social Security Number required to get Employment Identification Number (EIN) ']//..//label[text()='Last name *']//following-sibling::input"));
        lName.sendKeys("Holland");

        Thread.sleep(2000);
        WebElement goToPaymentButton = driver.findElement(By.xpath("//span[text()=' Go to payment ']"));
        goToPaymentButton.click();
    }
}
