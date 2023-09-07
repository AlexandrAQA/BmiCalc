package com.calc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.calc.BaseTest.driver;

public class BmiCalculator extends BaseTest{

         /*
    1. open the Chrome browser
    2. go to the page
    3. find  weight field => sendKeys
    4. find  height field => sendKeys
    5. Click on Calculate Btn
    6. AssertEquals
     */

        @Test
        public static void sixtyKilogramShouldBeValid() {
            WebElement weight
                    = driver.findElement(By.xpath(".//input[@name='wg']"));
            WebElement height
                    = driver.findElement(By.xpath(".//input[@name='ht']"));
            ;
            weight.sendKeys("60", Keys.ENTER);
            height.sendKeys("170", Keys.ENTER);
            WebElement calculateButton
                    = driver.findElement(By.xpath(".//input[@name='cc']"));
            calculateButton.click();
            WebElement content1 = driver.findElement(By.xpath(".//input[@class='content']"));
            //Assert.assertEquals(content1.getText(),"Your category is Normal");
        }
}
