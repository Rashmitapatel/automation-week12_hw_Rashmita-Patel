package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

        String baseURL = "https://magento.softwaretestingboard.com";
        public static WebDriver driver;
        public void openBrowser (String baseURL){
            driver = new ChromeDriver();
            // Launch URL
            driver.get(baseURL);
            //Maximise window
            driver.manage().window().maximize();
            //Implicit time out
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }


        public void closeBrowser () {
            driver.quit();
        }
    }
