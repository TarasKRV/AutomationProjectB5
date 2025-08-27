package io.loop.test.practice.day8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.LoopCampUtil;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;


//go to https://loopcamp.vercel.app/web-tables.html
//create a method to test given field for a given name
//test type
//test amount
//test date
//test street
//test city
//test state
//test zip
//test card
//test card number
//test exp


public class GivenFieldTask extends TestBase {
    @Test
    public void givenFieldTask () throws InterruptedException {
     driver.navigate().to("https://loopcamp.vercel.app/web-tables.html");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



String expectedPizzaType = "Thin Crust";
String actualPizzaType = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Pizza Type");
assertEquals(actualPizzaType, expectedPizzaType, "Actual doesn't match expected pizza type");
 System.out.println("Pizza type: " + actualPizzaType);


        String expectedAmount = "2";
String actualAmount = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Amount");
assertEquals(actualAmount, expectedAmount, "Actual doesn't match expected amount");
System.out.println("Actual amount: " + actualAmount);

        String expectedDate = "04/15/2021";
String actualDate = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Date");
assertEquals(actualDate, expectedDate, "Actual doesn't match expected date");
System.out.println("Actual date: "+actualDate);


        String expectedStreet = "7, Miller Street";
String actualStreet = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Street");
assertEquals(actualStreet, expectedStreet, "Actual doesn't match expected street");
System.out.println("Actual street: "+actualStreet);

String expectedCity = "Chicago, IL";
String actualCity = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "City");
assertEquals(actualCity, expectedCity, "Actual doesn't match expected city");
System.out.println("Actual city: "+actualCity);

String expectedState = "US";
String actualState = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "State");
assertEquals(actualState, expectedState, "Actual doesn't match expected state");
System.out.println("Actual state: "+actualState);

String expectedZip = "748";
String actualZip = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Zip");
assertEquals(actualZip, expectedZip, "Actual doesn't match expected zip");
System.out.println("Actual zip: "+actualZip);

String expectedCard = "VISA";
String actualCard = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Card");
assertEquals(actualCard, expectedCard, "Actual doesn't match expected card");
System.out.println("Actual card: "+actualCard);

String expectedCardNum = "321456789012";
String actualCardNum = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Card Number");
assertEquals(actualCardNum, expectedCardNum,  "Actual doesn't match expected card number");
System.out.println("Actual card number: "+actualCardNum);

String expectedExp = "02/24";
String actualExp = LoopCampUtil.returnAnyFieldFromLoopTables(driver, "Alexandra Gray", "Exp");
assertEquals(actualExp, expectedExp, "Actual doesn't match expected exp");
System.out.println("Actual exp: "+actualExp);
    }
}
