package io.loop.practice.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

//go to https://demoqa.com/nestedframes
//Validate "Child Iframe" text
//Validate "Parent Iframe" text
//Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."



public class TaskIFrame extends TestBase {

    @Test
    public void taskIFrame() throws InterruptedException {
        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        WebElement childIframeText = driver.findElement(By.xpath("//body[contains(.,'Child Iframe')]"));
        String actualChildIframeText = childIframeText.getText();
        String expectedChildIframeText = "Child Iframe";
        assertEquals(actualChildIframeText, "Child Iframe");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement parentIframeText = driver.findElement(By.xpath("//body[contains(.,'Parent frame')]"));
        String actualParentIframeText = parentIframeText.getText();
        String expectedParentIframeText = "Parent frame";
        assertEquals(actualParentIframeText, expectedParentIframeText, "Parent Iframe");

    }
}
