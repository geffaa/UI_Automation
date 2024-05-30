import org.example.ResultPage;
import org.example.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        // Set the path to your Chromedriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void driverTest() {
        SearchPage search = new SearchPage(driver);
        search.setSearch_bar("revandra aryo");
        ResultPage resultPage = search.click_search();
        String title = resultPage.getWebTitle();

        Assertions.assertTrue(title.contains("revandra aryo"));
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
