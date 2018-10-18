import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testqa {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumLib\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\SeleniumLib\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

    }
}
