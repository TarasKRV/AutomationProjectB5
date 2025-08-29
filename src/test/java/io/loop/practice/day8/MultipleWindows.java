package io.loop.practice.day8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MultipleWindows extends TestBase {

    @Test
    public void multipleWindows() {

        driver.navigate().to("https://loopcamp.vercel.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement multipleWindowsButton = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
        multipleWindowsButton.click();

        WebElement poweredBy = driver.findElement(By.xpath("//div[text()='Powered by ']"));
        WebElement loopcamp = driver.findElement(By.xpath("//a[text()='LOOPCAMP']"));

        System.out.println("poweredBy.isDisplayed():    " + poweredBy.isDisplayed());
        System.out.println("loopcamp.isDisplayed():     " + loopcamp.isDisplayed());


        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        System.out.println("actualTitle:    "+actualTitle);
       assertEquals(actualTitle, expectedTitle, "Actual title doesn't match expected title");

       WebElement clickHereButton = driver.findElement(By.xpath("//a[@href='windows/new.html']"));
       clickHereButton.click();


        BrowserUtils.switchToWindow(driver, "New Window");
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "New Window";
        System.out.println("actualTitle2:   "+actualTitle2);
        assertEquals(actualTitle2, expectedTitle2, "Actual title doesn't match expected title");


    }
}
