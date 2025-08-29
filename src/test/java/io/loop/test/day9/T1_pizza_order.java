package io.loop.test.day9;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.PizzaOrderUtil;
import org.testng.annotations.Test;

import javax.swing.text.TabExpander;

public class T1_pizza_order extends TestBase {


    @Test
    public void test_pizza_order() throws InterruptedException {

        driver.navigate().to("https://loopcamp.vercel.app/");
        driver.manage().window().maximize();

        String name = "Bart Fish";
        String expectedPizzaType = "Cheese";
        String actualPizzaType   = PizzaOrderUtil.returnFieldValue(driver, name, "pizza type");
        System.out.println(actualPizzaType);
    }
}
