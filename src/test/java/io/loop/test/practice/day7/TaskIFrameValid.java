package io.loop.test.practice.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

//go to https://loopcamp.vercel.app/nested-frames.html
//validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"

public class TaskIFrameValid extends TestBase {

    @Test
    public void taskIFrameValid() {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement left = driver.findElement(By.xpath("//body[contains(.,'LEFT')]"));
        String actualLeftIframeText = left.getText().trim();
        assertEquals(actualLeftIframeText, "LEFT");
        driver.switchTo().parentFrame();


        driver.switchTo().frame("frame-middle");
        WebElement middle = driver.findElement(By.xpath("//body[contains(.,'MIDDLE')]"));
        String actualMiddleIframeText = middle.getText().trim();
        assertEquals(actualMiddleIframeText, "MIDDLE");
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");
        WebElement right = driver.findElement(By.xpath("//body[contains(.,'RIGHT')]"));
        String actualRightIframeText = right.getText().trim();
        assertEquals(actualRightIframeText, "RIGHT");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bottom = driver.findElement(By.xpath("//body[contains(.,'BOTTOM')]"));
        String actualBottomIframeText = bottom.getText().trim();
        assertEquals(actualBottomIframeText, "BOTTOM");

    }
}
