import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    @Test
    public void test() {
        WebDriver driver;
        driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "~/chromedriver-mac-arm64/chromedriver");

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }

}
