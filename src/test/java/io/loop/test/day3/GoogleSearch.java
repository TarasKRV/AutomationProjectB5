package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        String expectedTitle = "Google";

        String actualTitlte = driver.getTitle();

        if(actualTitlte.contains(expectedTitle)){
            System.out.println("Actual title: " +actualTitlte + ", matches expected title "+ expectedTitle + ". => TEST PASS");

        }else {
            System.out.println("Actual title: " +actualTitlte + ", DOES NOT matches expected title "+ expectedTitle + ". => TEST FAIL");
        }

        System.out.println();

        String expectedURL = "https://www.google.com";

        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Actual url: " + actualURL + ", matches expected url "+ expectedURL + ". => TEST PASS");
        }else {
            System.out.println("Actual url: " + actualURL + ", DO NOT  matches expected url "+ expectedURL + ". => TEST PASS");
        }
    }
}
