import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;

public class Client {
    public static void main(String[] args) throws InterruptedException, AWTException {
        //Invoke the browser
        System.setProperty("web-driver.chrome.driver", "chromedriver.exe");
        //Add chrome options menu
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-web-security");
        //Open the browser
        WebDriver driver = new ChromeDriver(options);
        //Maximise the browser
        driver.manage().window().maximize();
        //Navigate to url
        driver.get("https://patient-satisfaction.seamhealth.support/signin/");
        //input email address
        driver.findElement(By.id("signInEmail")).sendKeys("xerelax126@roborena.com");
        //input password
        driver.findElement(By.id("password")).sendKeys("password");
        //click login button
        driver.findElement(By.className("login-text")).click();
        //click on feedback
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/app-root/app-auth/div[1]/div[1]/app-side-bar/div/div[2]/div/div[2]/span")).click();
        //click on complain
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@class='row mb-2 sublinks']")).click();
        //click on export
        driver.findElement(By.xpath("//button[@class='export-complaints']//span[contains(text(),'Export')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='ng-untouched ng-pristine ng-valid']/div[1]/div/img")).click();
        //click date range  the dropdown
        driver.findElement(By.xpath("//div[contains(text(),'One months')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[contains(text(),'CSV')]")).click();
        //click  drop down
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@class='ng-untouched ng-pristine ng-valid']/div[2]/div/img")).click();
        //click download button
        driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();

        
    }
}
