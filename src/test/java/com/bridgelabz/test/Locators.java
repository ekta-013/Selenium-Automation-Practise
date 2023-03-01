package com.bridgelabz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators extends BaseClass{
    @Test
    public void demoLocators() throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");
        WebElement PhoneNumber = driver.findElement(By.id("deftphnumber"));
        PhoneNumber.sendKeys("7654321234");

        driver.findElement(By.tagName("input"));

        driver.findElement(By.name("email")).sendKeys("Ekta@123");

        driver.findElement(By.cssSelector("input#deftusername")).sendKeys("Ekta");

        WebElement element = driver.findElement(By.xpath("/html/body/section[1]/div/div[6]/div[2]/div[2]/div[2]/div/input"));
        Thread.sleep(500);
        element.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(500);
        element.click();

        driver.findElement(By.xpath("//*[@id=\"deftyear\"]")).getText();
        driver.findElement(By.className("anchor-tag")).click();

        String title = driver.getTitle();
        Assert.assertEquals("BridgeLabz: Guaranteed Emerging Tech Job",title);

        String pageSource = driver.getPageSource();
        System.out.println("PageSource : "+pageSource);

//        WebElement element = driver.findElement(By.linkText("Maven"));
//        Thread.sleep(500);
//        element.sendKeys(Keys.PAGE_DOWN);
//        Thread.sleep(500);
//        element.click();
//        Thread.sleep(1000);

//        WebElement element2 = driver.findElement(By.partialLinkText("Forgotten"));
//        Thread.sleep(1000);
//        element2.click();
//        Thread.sleep(1000);
    }
}
