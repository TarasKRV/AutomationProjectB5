package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_getText_getAttribute {
    public static void main(String[] args) {



      /*
    go to url: https://loopcamp.vercel.app/registration_form.html
    validate header text expected:  Registration form
    validate placeholder attribute value for first name expected - first name
     */


        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.manage().window().maximize();
        driver.navigate().to(LoopCampConstans.REGISTRATION_FORM_URL);

        WebElement header = driver.findElement(By.tagName("h2"));

        String actualHeaderForForms = header.getText();


        if(actualHeaderForForms.equals(LoopCampConstans.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: \"" + LoopCampConstans.EXPECTED_HEADER_FOR_FORM + "\" matches actual header for form: \"" + actualHeaderForForms + "\" => TEST PASS");
        } else {System.out.println("Expected header for form: \"" + LoopCampConstans.EXPECTED_HEADER_FOR_FORM + "\" not matches actual header for form: \"" + actualHeaderForForms + "\" => TEST FAIL");

        }

        WebElement firstNamePlaceholder = driver.findElement(By.name("firstname"));
        System.out.println(firstNamePlaceholder.getDomAttribute("placeholder"));


        String actualPlaceholderForFirstName = firstNamePlaceholder.getAttribute("placeholder");

        if(actualPlaceholderForFirstName.equals(LoopCampConstans.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME)){
            System.out.println("expected placeholder for form \"" + LoopCampConstans.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + "\" matches actual placeholder for form \"" + actualPlaceholderForFirstName + "\" => TEST PASS");

        }else {
            System.out.println("expected placeholder for form \"" + LoopCampConstans.EXPECTED_PLACEHOLDER_FOR_FIRSTNAME + "\" not matches actual placeholder for form \"" + actualPlaceholderForFirstName + "\" => TEST FAIL");
        }
        driver.quit();
    }
}