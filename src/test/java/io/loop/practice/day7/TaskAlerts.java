package io.loop.practice.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

//go to https://demoqa.com/alerts
//click - click button to see alert
//handle alert
//click - On button click, alert will appear after 5 seconds
//handle alert
//click - On button click, confirm box will appear
//click ok and validate - You selected Ok
//after that do it again this time cancel and validate - You selected Cancel
//click - On button click, prompt box will appear
//enter "Loop Academy" and validate You entered Loop Academy

public class TaskAlerts extends TestBase {
    @Test
    public void taskDemoqa() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement alertButton2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        alertButton2.click();
        Thread.sleep(6000);
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();

        WebElement alertButton3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        alertButton3.click();
        Alert alert3 = driver.switchTo().alert();
        alert3.accept();

        WebElement successMessageForConfirmationAlert = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String expected = "You selected Ok";
        String actual = successMessageForConfirmationAlert.getText();
        // System.out.println(actual);
        assertEquals(actual, expected, "Actual does not match the expected");

        Thread.sleep(2000);
        alertButton3.click();
        Alert alert4 = driver.switchTo().alert();
        alert4.dismiss();
        WebElement MessageForConfirmationAlert = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String expected2 = "You selected Cancel";
        String actual2 = MessageForConfirmationAlert.getText();
        // System.out.println(actual2);
        assertEquals(actual2, expected2, "Actual does not match the expected");

        WebElement promptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
        promptButton.click();
        Alert alert5 = driver.switchTo().alert();
        alert5.sendKeys("Loop Academy");
        alert5.accept();
        WebElement MessageForPrompt = driver.findElement(By.xpath("//span[@id='promptResult']"));
        String expected3 = "You entered Loop Academy";
        String actual3 = MessageForPrompt.getText();
        assertEquals(actual3, expected3,"Actual does not match the expected");

    }
}
