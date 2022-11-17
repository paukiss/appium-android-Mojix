package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("deviceName", "Pixel 3a API 33 2");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        capabilities.setCapability("noReset", true);

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

        driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("Hola");
        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.5), (int)(dimension.height*0.9));
        Point end = new Point((int) (dimension.width * 0.2), (int)(dimension.height*0.1));

        PointerInput FINGER = new PointerInput(PointerInput.Kind.TOUCH, "finger");


        Thread.sleep(8000);
    }
}
