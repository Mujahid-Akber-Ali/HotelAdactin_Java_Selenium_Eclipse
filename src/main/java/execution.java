import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class execution {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void exampleTest() throws InterruptedException {
    	
        driver.get("https://adactinhotelapp.com/");
        driver.findElement(By.id("username")).sendKeys("MujahidAkberAli"); 
        driver.findElement(By.id("password")).sendKeys("mujahid123");
        
        driver.findElement(By.id("login")).click();
        
        driver.findElement(By.id("location")).sendKeys("Adelaide");
        driver.findElement(By.id("hotels")).sendKeys("Hotel Sunshine");
        driver.findElement(By.id("room_type")).sendKeys("Deluxe");
        driver.findElement(By.id("room_nos")).sendKeys("1 - One");
        driver.findElement(By.id("datepick_in")).sendKeys("11/06/2023");
        driver.findElement(By.id("datepick_out")).sendKeys("14/06/2023");
        driver.findElement(By.id("adult_room")).sendKeys("4 - Four");
        driver.findElement(By.id("child_room")).sendKeys("3 - Three");
        Thread.sleep(3000);
        driver.findElement(By.id("Submit")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.id("radiobutton_0")).click();   
        driver.findElement(By.id("continue")).click();        
        
        driver.findElement(By.id("first_name")).sendKeys("Mujahid Akber Ali"); 
        driver.findElement(By.id("last_name")).sendKeys("Akber Ali");
        driver.findElement(By.id("address")).sendKeys("1-A 5/7 Nazimabad no.1, karachi");
        driver.findElement(By.id("cc_num")).sendKeys("12345678910111213");
        driver.findElement(By.id("cc_type")).sendKeys("Master Card");
        
        driver.findElement(By.id("cc_num")).sendKeys("12345678910111213");
        driver.findElement(By.id("cc_exp_month")).sendKeys("April");
        driver.findElement(By.id("cc_exp_year")).sendKeys("2021");
        driver.findElement(By.id("cc_cvv")).sendKeys("123456789"); 
        Thread.sleep(3000);
        
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
