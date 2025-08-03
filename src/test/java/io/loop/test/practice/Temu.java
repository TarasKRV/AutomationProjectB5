package io.loop.test.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Temu {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);


        driver.navigate().to("https://www.temu.com");


        WebElement searchBox = driver.findElement(By.id("searchInput"));


        String textToSearch = "Wooden spoon";

        searchBox.sendKeys(textToSearch + Keys.ENTER);


        String expectedTitleTemu = "Temu";

        String actualTitleTemu = driver.getTitle();

        Thread.sleep(3000);

        if(actualTitleTemu.contains(expectedTitleTemu)){
            System.out.println("Temu title matches => TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }


    }
}
