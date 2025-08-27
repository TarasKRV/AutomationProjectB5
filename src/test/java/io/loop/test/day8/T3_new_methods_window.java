package io.loop.test.day8;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class T3_new_methods_window extends TestBase {
    @Test
    public void test_new_methods() {
        driver.get("https://www.google.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.loopcamp.io");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");
    }
}
