package io.loop.test.day4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Etsy {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);


        driver.navigate().to("https://www.etsy.com");


        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));


        String textToSearch = "Wooden spoon";

        searchBox.sendKeys(textToSearch + Keys.ENTER);


        String expectedTitleEtsy = "Etsy";

        String actualTitleEtsy = driver.getTitle();

        Thread.sleep(3000);

        if(actualTitleEtsy.contains(expectedTitleEtsy)){
            System.out.println("Temu title matches => TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }


    }
}
