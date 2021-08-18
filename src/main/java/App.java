import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args){

        //Instantiating a web driver with a chrome driver
        WebDriver driver = new ChromeDriver();
        //Define where ChromeDriver is located
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Best practice is to maximise so that it can find all the elements
        driver.manage().window().maximize();
        //Opening a website- Invoke the object of the driver and call method get
        driver.get("http://localhost:63342/LastEdit/Table.html?_ijt=9h70v5rugkvdo2gsjh3hh6dbq7");


        driver.close();

    }
}
