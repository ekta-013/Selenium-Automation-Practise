package com.bridgelabz.test;

import com.bridgelabz.test.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon extends BaseClass {
    @Test
    public void returnOrders() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        boolean flag = driver.findElement(By.id("nav-orders")).isDisplayed();
        Assert.assertTrue(flag);
        if (flag) {
        driver.findElement(By.id("nav-orders")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("createAccountSubmit")).click();
        Thread.sleep(1000);
    }
    }
}
