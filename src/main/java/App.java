import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args){

        //Instantiating a web driver with a chrome driver
        WebDriver driver = new ChromeDriver();

        //Define where ChromeDriver is located
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Best practice is to maximise so that it can find all the elements
        driver.manage().window().maximize();


        //Opening a website- Invoke the object of the driver and call method get
        driver.get("https://www.wikipedia.org/");


        System.out.println(driver.getTitle());

        //Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver, 10);


        //Fluent Wait
        Wait Fluentwait=new FluentWait<WebDriver>(driver)
                .withTimeout(15,TimeUnit.SECONDS)
                .pollingEvery(5,TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);


        

        driver.close();

    }
}
