package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {

    public static void main(String[] args) {

        // create driver object
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

        // navigate to loopcamp practice page
        // https://loopcamp.vercel.app

        driver.get("https://loopcamp.vercel.app/registration_form.html");


        // WebElement firstName = driver.findElement(By.name("firstname"));
        // WebElement firstName = driver.findElement(By.className("form-control"));
        WebElement firstName = driver.findElement(By.name("firstname"));

        String firstname = "Loop";

        firstName.sendKeys(firstname);


        WebElement lastName = driver.findElement(By.name("lastname"));

        String lastname = "Camp";

        lastName.sendKeys(lastname);

        WebElement userName = driver.findElement(By.name("username"));

        String username = "Academy";

        userName.sendKeys(username);


        WebElement female = driver.findElement(By.name("gender"));
        female.click();



    }

}