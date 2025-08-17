package io.loop.test.day6;

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

public class T8_HTML_dropdown {


        WebDriver driver;

        @BeforeMethod
        public void beforeMethod() {
            driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
            //driver.manage().window().maximize();
            driver.get(DocuportConstants.DOCUPORT_TEST);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
        @AfterMethod
        public void afterMethod() {
            // driver.quit();
        }
        @Test
        public void t7_multi_dropdown() throws InterruptedException {
            WebElement username = driver.findElement(By.xpath("//input[@id='input-14']"));
            WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));

            username.sendKeys(DocuportConstants.USERNAME_CLIENT);
            password.sendKeys(DocuportConstants.PASSWORD);

            WebElement signIn = driver.findElement(By.className("v-btn__content"));
            signIn.click();

            WebElement dropdown = driver.findElement(By.cssSelector("button[type='submit']>span[class='v-btn__content']"));
            dropdown.click();

            Thread.sleep(2000);

            WebElement dropdown2 = driver.findElement(By.xpath("//span[contains(text(),'Jeffrey')]"));
            dropdown2.click();




    }
}
