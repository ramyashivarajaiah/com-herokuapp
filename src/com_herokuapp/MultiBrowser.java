package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

public class MultiBrowser {

    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            driver = new SafariDriver();
        }
        //Base Url
        String baseUrl = "http://the-internet.herokuapp.com/login";

        //1. Setup chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //Maximizing the page
        driver.manage().window().maximize();

        //Giving implicit wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //3. Print the title of the page.
        System.out.println("The title if the page is: " + driver.getTitle());

        //4. Print the current url.
        System.out.println("The current url is: " + driver.getCurrentUrl());

        // 5. Print the page source.
        System.out.println("The page sourece is: " + driver.getPageSource());

        //6. Enter the email to email field.
        driver.findElement(By.name("username")).sendKeys("tomsmith");

        //7. Enter the password to password field.
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        //8. Click on Login Button.
        driver.findElement(By.className("radius")).click();

        //9. Print the current url.
        System.out.println("The Current Url is: " + driver.getCurrentUrl());

        //10. Refresh the page.
        driver.navigate().refresh();

        //11. Close the browser.
        driver.quit();
    }
}


