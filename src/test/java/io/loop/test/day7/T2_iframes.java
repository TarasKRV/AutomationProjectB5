package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T2_iframes extends TestBase {


    @Test
    public void iframeTest () throws InterruptedException {


        driver.get("https://loopcamp.vercel.app/iframe.html");
        driver.manage().window().maximize();

        // Switch iframe by index
        //driver.switchTo().frame(0);

        // Switch with id or name
        driver.switchTo().frame("mce_0_ifr");

        // Switch with webElement iframe
//        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
//        driver.switchTo().frame(iframe);

        Thread.sleep(2000);

//        WebElement typingBoxElement = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
//        System.out.println(typingBoxElement.getText());

        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Loopcamp");
        assertEquals(textBox.getText(), "Loopcamp", "Actual text is not matching expected.");


        driver.switchTo().defaultContent();
        WebElement header =  driver.findElement(By.xpath("//h3[contains(text(),'An iFrame')]"));
        assertTrue(header.isDisplayed(), "Header not displayed");
    }

    @Test
    public void nestedFrame() {

        driver.get("https://loopcamp.vercel.app/nested-frames.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> frames = driver.findElements(By.xpath("//frame"));
        System.out.println(frames.size());
    }
    }