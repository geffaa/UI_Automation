package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private By search_bar = new By.ById("APJFgb");
    private By button = new By.ByName("btnK");

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Perbarui metode ini agar menerima argumen String
    public void setSearch_bar(String query) {
        driver.findElement(search_bar).sendKeys(query);
    }

    public ResultPage click_search() {
        driver.findElement(button).submit();
        return new ResultPage(driver);
    }
}
