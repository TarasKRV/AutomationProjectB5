package io.loop.test.day9;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class T6_uploads {

    @Test
    public void upload_file() throws InterruptedException {
        Driver.getDriver().get("https://demo.guru99.com/test/upload/");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement choseFile = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String path = "/Users/newuser/Desktop/test.text";
        choseFile.sendKeys(path);

        WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
        submitButton.click();

        String expected = "1 file\n" +
                "has been successfully uploaded.";

        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//h3[@id='res']/center"));
        Thread.sleep(2000);
        assertEquals(expected, successMessage.getText(), "Not much");



    }
}
