package com.bridgelabz.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends BaseClass{
    @Test
    public void Execute() throws InterruptedException {
        driver.get("https://www.guru99.com/api-testing.html");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        System.out.println("Execute script: " + executor.executeScript("return window.length"));

        int noOfFrames = Integer.parseInt(executor.executeScript("return window.length").toString());
        System.out.println("No of Frames: " + noOfFrames);

//        for (int i=0; i<=noOfFrames; i++){
//            System.out.println("Frame Title: " + driver.switchTo().frame(i).getTitle());
//        }
        executor.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(500);
    }
}
