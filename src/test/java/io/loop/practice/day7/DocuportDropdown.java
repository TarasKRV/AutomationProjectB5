package io.loop.practice.day7;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class DocuportDropdown extends TestBase {

    @Test
    public void docuportDropdown() throws InterruptedException {

        driver.get(DocuportConstants.DOCUPORT_TEST);
        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD);

        WebElement logInButton = driver.findElement(xpath("//button[@type='submit']/span[@class='v-btn__content']"));
        logInButton.click();

        Thread.sleep(2000);

        WebElement receivedDocuments = driver.findElement(xpath("//a[@href='/received-docs']"));
        receivedDocuments.click();


        WebElement searchButton = driver.findElement(xpath("//span[text()='Search']"));
        searchButton.click();

        WebElement statusDropdown =  driver.findElement(xpath("//div[@role='button'][@aria-haspopup='listbox'][@aria-expanded='false']"));


        List< WebElement> statusDropdownOptions = driver.findElements(By.xpath( "//div[@role='listbox' and @id='list-309']"));
         statusDropdownOptions.forEach(WebElement:: click);

         //validate that status dropdown does not allow to select multiple


        int counter = driver.findElements(By.xpath( "//div[@role='Listbox']//div[@role='option' and @aria-selected='true']")).size();


        if (counter == 1 ) {
            System.out.println("Status dropdown: does NOT allow to select multiple options");
        }else
            System.out.println("Status dropdown: allows select multiple options");

        //validate that tags dropdown allows to select multiple


        WebElement clear = driver. findElement(xpath("//span[normalize-space()='Clear']"));
        clear.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement tagsDropdown = driver.findElement(xpath("//label[.='Tags']/parent::div"));
        tagsDropdown.click();

        // List ‹WebElement> tagsDropdownOptions = driver.findElements (By.xpath"//input|@id='input-134']/parent: :div"));

        List < WebElement> tagsDropdownOptions = driver.findElements(By.xpath("//label[.='Tags']/parent::div"));

    }
}
