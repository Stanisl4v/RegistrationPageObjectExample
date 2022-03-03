package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTestHaloOglasi {
    public static WebDriver driver;
    public static WebDriverWait wdwait;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get("https://www.halooglasi.com/prijava?returnUrl=%2f");
    }
    @After

    public void tearDown(){
//        driver.close();
//        driver.quit();
    }
}
