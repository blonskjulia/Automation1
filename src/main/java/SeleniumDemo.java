import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;
import javax.xml.xpath.XPathException;
import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/АВТОМАТИЗАЦИЯ/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        WebDriverWait wait=new WebDriverWait(driver,5);
        WebElement go = driver.findElement(By.name("go"));
        go.sendKeys("automation");
        go.click();
        System.out.println(driver.getTitle());
        List<WebElement> headings = driver.findElements(By.className("b_title"));
        for (WebElement h: headings) {
            WebElement resultTitle = h.findElement(By.tagName("h2"));
            System.out.println(resultTitle.getText());
        }
        driver.quit();
        }
        }



