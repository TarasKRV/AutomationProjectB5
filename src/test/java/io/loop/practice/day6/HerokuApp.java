package io.loop.practice.day6;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class HerokuApp {

    WebDriver driver;
    String actualOption;
    String actualOption1;
    String actualOption2;
    String expected = "Please select an option";
    String expectedOption1 = "Option 1";
    String expectedOption2 = "Option 2";



    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get(GeneralConstants.HEROKUAPP_URL_DROPDOWN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void afterMethod() {
       driver.quit();
    }
    @Test
    public void herokuAppTest() throws InterruptedException {

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        actualOption = dropdown.getFirstSelectedOption().getText();
        assertEquals(actualOption, expected, "Actual: " + actualOption + " Doesnt match expected: " + expected);

        dropdown.selectByValue("1");
        actualOption1 = dropdown.getFirstSelectedOption().getText();
        assertEquals(actualOption1, expectedOption1, "Actual: " + actualOption1 + " Doesn't match expected: " + expectedOption1);

        dropdown.selectByValue("2");
        actualOption2 = dropdown.getFirstSelectedOption().getText();
        assertEquals(actualOption2, expectedOption2, "Actual: " + actualOption2 + " Doesn't match expected: " + expectedOption2);

        System.out.println();

        WebElement header3 = driver.findElement(By.tagName("h3"));
        String actualHeaderName = header3.getText();

        if(actualHeaderName.equals(GeneralConstants.EXPECTED_HEADER_DROPDOWN_NAME)){
            System.out.println("Expected header name: \"" + GeneralConstants.EXPECTED_HEADER_DROPDOWN_NAME + "\" matches actual header name: \"" + actualHeaderName + "\" => TEST PASS");
        } else {
            System.out.println("Expected header name: \"" + GeneralConstants.EXPECTED_HEADER_DROPDOWN_NAME + "\" not matches actual header name: \"" + actualHeaderName + "\" => TEST FAIL");
        }
    }
}



