package io.loop.test.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(3000);


        Thread.sleep(3000);

        driver.get("https://workspace.google.com/intl/en-US/gmail/");

        String expectedTitleGmail = "Gmail";

        String actualTitleGmail = driver.getTitle();

        Thread.sleep(3000);

        if(actualTitleGmail.contains(expectedTitleGmail)){
            System.out.println("Gmail title matches => TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }

        System.out.println("============");

        driver.navigate().back();
        Thread.sleep(3000);

        String expectedTitleGoogle = "Google";

        String actualTitleGoogle = driver.getTitle();


        if(actualTitleGoogle.contains(expectedTitleGoogle)){
            System.out.println("Google title matches => TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }

    }
}
