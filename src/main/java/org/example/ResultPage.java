package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ResultPage {

    WebDriver driver;

    public ResultPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public String getWebTitle()
    {
        return driver.getTitle();
    }
}
