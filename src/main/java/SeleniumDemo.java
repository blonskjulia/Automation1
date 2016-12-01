import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        WebDriverWait wait=new WebDriverWait(driver,5);
        WebElement go = driver.findElement(By.name("go"));
        go.sendKeys("automation");
        go.click();
        System.out.println(driver.getTitle());
        List<WebElement> a = driver.findElements(By.xpath("//div[@class='b_title']/h2/a"));
        for (WebElement el:a) {System.out.println(el.getText());
        }
    driver.quit();
    }
}




