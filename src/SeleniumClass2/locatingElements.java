package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://facebook.com");

        driver.findElement(By.id("email")).sendKeys("Abdulkazimrasoly@gmail.com");
        //driver.findElement(By.name("email")).sendKeys("kmkkmkmmkm");
        driver.findElement(By.name("pass")).sendKeys("kmmlklmm");
       // driver.findElement(By.name("login")).click();
       driver.findElement(By.linkText("Forgot password?")).click();
       // driver.findElement(By.partialLinkText("Forgot")).click();// we can use this wat for forgot password

    }
}
