package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSS_homework {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        //driver.manage().window().maximize();

        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);


        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

        String actualLogoDocuport = logo.getDomAttribute("alt");

        System.out.println("Docuport = " + actualLogoDocuport);


        if (actualLogoDocuport.equals(DocuportConstants.EXPECTED_LOGO_DOCUPORT)) {
            System.out.println("Expected logo docuport \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\" matches actual logo docuport \"" + actualLogoDocuport + "\" => TEST PASS");

        } else {
            System.out.println("Expected logo docuport \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\" not matches actual logo docuport \"" + actualLogoDocuport + "\" => TEST FAIL");
        }

        WebElement username = driver.findElement(By.id("input-14"));

        username.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.id("input-15"));

        password.sendKeys(DocuportConstants.PASSWORD);

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();


        Thread.sleep(3000);

        WebElement confirmButton = driver.findElement(By.cssSelector("button[type='submit']>span[class='v-btn__content']"));
        confirmButton.click();

        // Thread.sleep(3000);

        WebElement burgerButton = driver.findElement(By.cssSelector("button[class='v-app-bar__nav-icon v-btn v-btn--icon v-btn--round theme--light v-size--default']"));
        burgerButton.click();
        System.out.println("===============================");

        WebElement logoHome = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

        String actualLogoDocuportHome = logoHome.getDomAttribute("alt");

        System.out.println("Docuport home page = " + actualLogoDocuportHome);


        if (actualLogoDocuport.equals(DocuportConstants.EXPECTED_LOGO_DOCUPORT)) {
            System.out.println("Expected logo docuport \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\" matches actual logo docuport \"" + actualLogoDocuportHome + "\" => TEST PASS");

        } else {
            System.out.println("Expected logo docuport \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\" not matches actual logo docuport \"" + actualLogoDocuportHome + "\" => TEST FAIL");
        }

    }
}