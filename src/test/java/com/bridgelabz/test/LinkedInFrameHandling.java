package com.bridgelabz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkedInFrameHandling extends BaseClass{
    @Test
    public void SignUpPage() throws InterruptedException {
        driver.navigate().to("https://www.linkedin.com/home");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/a")).click();
        driver.findElement(By.id("email-or-phone")).sendKeys("mohiteekta31@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("forgotpassword");
        Thread.sleep(1000);
        driver.findElement(By.id("join-form-submit")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Ekta");
        driver.findElement(By.id("last-name")).sendKeys("Mohite");
        WebElement clickButton  = driver.findElement(By.id("join-form-submit"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", clickButton);

        executor.executeScript("alert('Welcome on Frame');");

        //total numbers of Iframe present in the webpage
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total number of frames: "+ size);

        //finding out the index of frame
        for (int i=0; i<=size; i++){
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath("//iframe[@src='/checkpoint/challengeIframe/AQEbZC2s7YY6pgAAAYadr0VlaVu1JZr6UAjdu3l7BlQsUlTvDPcgKSBJx-B9zSGUGgknvwIwxV6c38TkNzsAku5U6Vt38A?ut=0OdOEr-O8zGaE1']")).size();
            System.out.println(total);
            driver.findElement(By.name("phoneNumber")).sendKeys("7887680540");
            driver.switchTo().defaultContent();
            Thread.sleep(1000);
        }
    }
}
