package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.LoopCampConstans;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_css_practice {
    public static void main(String[] args) {



        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.manage().window().maximize();

        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);


        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));

        String actualLogoDocuport = logo.getDomAttribute("alt");

        System.out.println("docuport = " + actualLogoDocuport);


        if(actualLogoDocuport.equals(DocuportConstants.EXPECTED_LOGO_DOCUPORT)){
            System.out.println("expected logo docuport \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\" matches actual actual logo docuport \"" + actualLogoDocuport + "\" => TEST PASS");

        }else {
            System.out.println("expected logo docuport \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\" not matches actual actual logo docuport \"" + actualLogoDocuport + "\" => TEST FAIL");
        }

        driver.quit();
    }


}
