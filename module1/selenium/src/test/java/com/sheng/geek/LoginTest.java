package com.sheng.geek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
        @Before
        public void setUp() throws Exception {
            //all driver shall be downloaded by this instruction https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/

            System.setProperty(
                    "webdriver.chrome.driver",
                    "webdriver/chromedriver_mac");
            baseUrl = "https://www.baidu.com/";
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        @Test
        public void testLogin(){
            driver.get(baseUrl);
            driver.findElement(By.id("kw")).sendKeys("selenium");
            driver.findElement(By.id("su")).click();
        }
        @After
        public void tearDown() throws Exception {
            driver.quit();
        }
}
