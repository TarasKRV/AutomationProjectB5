package io.loop.test.day6;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
        1. Go to http://the-internet.herokuapp.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
        3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.

         */
public class T2_checkboxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        //WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox' and following-sibling::text()[contains(.,'checkbox 1')]]"));

       WebElement checkbox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 1')]/preceding-sibling::input"));


        if (!checkbox1.isSelected()) {
            System.out.println("Checkbox 1 not selected");
        }else {
            System.out.println("Checkbox 1 selected");
        }

        Thread.sleep(2000);
        System.out.println();
        checkbox1.click();

        if (!checkbox1.isSelected()) {
            System.out.println("Checkbox 1 not selected");
        }else {
            System.out.println("Checkbox 1 selected");
        }


        Thread.sleep(2000);
        System.out.println();


        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox' and normalize-space(following-sibling::text())='checkbox 2']"));

        checkbox2.click();

        if (!checkbox2.isSelected()) {
            System.out.println("Checkbox 2 not selected");
        }else  {
            System.out.println("Checkbox 2 selected");
        }

        if (!checkbox1.isSelected()) {
            System.out.println("Checkbox 1 not selected");
        }else {
            System.out.println("Checkbox 1 selected");
        }



    }
}
