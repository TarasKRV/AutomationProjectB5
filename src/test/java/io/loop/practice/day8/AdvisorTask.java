package io.loop.practice.day8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.DocuportUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class AdvisorTask extends TestBase {


    /*
       1. login as an advisor
       2. go to users
       3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
       4. validate that user name for alex.de.souza@gmail.com is alexdesouze
       5. validate that phone number for alex.de.souza@gmail.com is +994512060042
       6. validate that role for alex.de.souza@gmail.com is client
       7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
        */

        @Test
        public void webTables() throws InterruptedException {
            DocuportUtils.login(driver, DocuportConstants.ADVISOR);
            //DocuportUtils.logOut(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


            WebElement users = driver.findElement(By.xpath("//a[@href='/users']"));
            users.click();
            String expectedFullName = "AAlex De Souza";
            WebElement userEmail = driver.findElement(By.xpath("//td[2][text()='alex.de.souza@gmail.com']/preceding-sibling::td//span[2]"));
            userEmail.getText();



            String actualFullName = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "Full name");
            assertEquals(actualFullName, expectedFullName, "Full name does not match");
            System.out.println(actualFullName + " is Actual = Expected " + expectedFullName);



            String expectedUsername = "alexdesouze";
            String actualUserName = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "username");
            assertEquals(actualUserName, expectedUsername, "Username name does not match");
            System.out.println( actualUserName+ " is Actual = Expected " + expectedUsername);



            String expectedPhoneNumber = "+994512060042";
            String actualPhoneNumber = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "Phone number");
            assertEquals(actualPhoneNumber, expectedPhoneNumber, "Phone number does not match");
            System.out.println(actualPhoneNumber+ " is Actual = Expected " + expectedPhoneNumber);



            String expectedRole = "Client";
            String actualRole = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "Role");
            assertEquals(actualRole, expectedRole, "Role does not match");
            System.out.println(actualRole+ " is Actual = Expected " + expectedRole);



            String expectedAdvisor = "advisor advisor";
            String actualAdvisor = DocuportUtils.returnAnyFieldFromTable(driver, "alex.de.souza@gmail.com", "Advisor");
            assertEquals(actualAdvisor, expectedAdvisor, "Role does not match");
            System.out.println(actualAdvisor+ " is Actual = Expected " + expectedAdvisor);
        }
    }


