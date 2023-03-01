package com.bridgelabz.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static ChromeDriver driver = null;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
//      driver.get("https://bldev.bridgelabz.com/webinar");
//        driver.get("https://www.amazon.in/");
//      driver.get("https://demoqa.com/browser-windows");
//      driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng/7.7.0");
//      driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterTest
    public void TearDown(){
        driver.close();
    }
    public static void takeScreenshot() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\EKTA\\IdeaProjects\\SeleniumJava\\src\\Screenshot\\screenshot"+System.currentTimeMillis()+".png");
        FileUtils.copyFile(srcFile,destinationFile);
    }
}
