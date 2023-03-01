package com.bridgelabz.test;

import com.bridgelabz.test.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class FbSelectClass extends BaseClass {

    public Select dropDown;

    @Test(priority = 3)
    public void NavigateOnFbLoginScreen_Success() throws IOException {
        driver.navigate().to("https://www.facebook.com/");
       String title = driver.getTitle();
        Assert.assertEquals(title,"Facebook – log in or sign up");
        takeScreenshot();
    }
    @Test(priority = 2)
    public void RedirectOnToFbScreen_IdDisplayedImg() throws IOException {
        driver.navigate().to("https://www.facebook.com/");
        boolean flag = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img")).isDisplayed();
        Assert.assertTrue(flag);
        takeScreenshot();
    }

    @Test(priority = 1)
    public void CreateScreen() throws InterruptedException, IOException {
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(1000);

        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Ekta");
        Thread.sleep(1000);

        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("mohite");
        Thread.sleep(1000);

        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("9876543211");
        Thread.sleep(1000);

        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("EKta@123");
        Thread.sleep(1000);

        WebElement dayDropDown = driver.findElement(By.name("birthday_day"));
        dropDown = new Select(dayDropDown);
        dropDown.selectByVisibleText("31");
        Thread.sleep(1000);

        WebElement monthDropDown = driver.findElement(By.id("month"));
        dropDown = new Select(monthDropDown);
        dropDown.selectByIndex(7);
        Thread.sleep(1000);

        WebElement yearDropDown = driver.findElement(By.name("birthday_year"));
        dropDown = new Select(yearDropDown);
        dropDown.selectByValue("1999");
        Thread.sleep(1000);

        driver.findElements(By.name("sex")).get(0).click();
//        List<WebElement> gender = driver.findElements(By.name("sex"));
//        System.out.println("Size of list : " +gender.size());
//        for (int i=0; i< gender.size(); i++){
//            gender.get(i).click();
//            if (i==0){
//                gender.get(0).click();
//        }

        boolean flag = driver.findElements(By.name("sex")).get(0).isSelected();
        if (flag == true){
            System.out.println("Female radio button selected");
        }
        else {
            driver.findElements(By.name("sex")).get(0).click();
        }
        Thread.sleep(1000);
        takeScreenshot();
    }
}
