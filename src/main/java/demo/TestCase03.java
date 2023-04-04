package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase03 {
    WebDriver driver;
    public TestCase03()
    {
        System.out.println("Constructor: TestCase1");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    public void endTest()
    {
        System.out.println("End Test: TestCases");
        //driver.close();
        //driver.quit();

    }
    public  void testCase03() throws InterruptedException{
        System.out.println("Testcase to Automate linkedin account for typing the text under connections only and select image by giving the path of the image");
    System.out.println("Start Test case: testCase03");
    driver.get("https://www.linkedin.com");
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    driver.findElement(By.name("session_key")).sendKeys("7057401789");
    //Thread.sleep(3000);
    driver.findElement(By.name("session_password")).sendKeys("roopareddy.28");
    driver.findElement(By.linkText("Sign in")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("username")).sendKeys("7057401789");
    driver.findElement(By.id("password")).sendKeys("roopareddy.28");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    WebElement pr=driver.findElement(By.xpath("//div[text()='Welcome, Roopa!']"));
    if(pr.isDisplayed())
           {
            driver.findElement(By.xpath("//span[text()='Start a post']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("All about selenum");
            Thread.sleep(3000);
            WebElement wb= driver.findElement(By.xpath("//li-icon[@type='image']"));
            wb.click();
            Thread.sleep(1000);
            WebElement wb1=driver.findElement(By.xpath("//input[@type='file']"));
            Thread.sleep(1000);
             wb1.sendKeys("C:/Users/Bojji Reddy/Desktop/Screenshot (6).png");
             Thread.sleep(3000);
             driver.findElement(By.xpath("//span[text()='done']")).click();
             System.out.println("End Test case: testCase03"); 
        }
    }
 
}