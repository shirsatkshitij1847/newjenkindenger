package com.mavenjenkindemo1.mavenjenkindemo1;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

 

 

 

public class Test2 {

 

    public static void main(String[] args) {

        // TODO Auto-generated method stub

         WebDriver driver = new ChromeDriver();

//          driver.get("https://www.google.com");

          driver.manage().window().maximize();

          

          driver.get("https://www.google.com/");

            driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER);

//            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

 

            String pageTitle = driver.getTitle();

            System.err.println(pageTitle);
            // Use the Java assert statement for assertion

            assert pageTitle.contains("Selenium") : "Page title does not contain 'Selenium'";

    }

 

}