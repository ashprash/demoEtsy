package etsy;

//created by Aswani -19/06/2018

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Search {
    static WebDriver driver;
    static String baseURL = "http://www.etsy.com/";
    static String browser = "chrome";

    @BeforeClass
    public static void startBrowser() {
        // create chrome browser instance
        System.setProperty("webdriver.chrome.driver", "C:\\etsy\\src\\test\\java\\etsy\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);



        // Wait
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/button\n")).click();

        // Maximise the Browser
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }

    @Test
    public  void searchHomePage(){

        driver.findElement(By.xpath("//*[@id=\"search-query\"]")).sendKeys("sport shoes");
        driver.findElement(By.xpath("//*[@id=\"search-suggestions\"]/ul/li[1]"));
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown-group text-control text-smaller']")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div/ul/li[4]/a")).click();

        System.out.println("Displaying prices for top 10 items from the search list");
        System.out.print("1 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[4]/div[1]/a/div[2]/div/p[2]/span[2]")).getText());
        System.out.print("2 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[4]/div[2]/a/div[2]/div/p[2]/span[2]\n")).getText());
        System.out.print("3 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[4]/div[3]/a/div[2]/div/p[2]/span[2]")).getText());
        System.out.print("4 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[4]/div[4]/a/div[2]/div/p[2]/span[2]")).getText());
        System.out.print("5 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[5]/div[1]/a[1]/div[2]/div/p[2]/span[1]/span[2]")).getText());
        System.out.print("6 :£");
       System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[5]/div[6]/a[1]/div[2]/div/p[2]/span[2]")).getText());
       System.out.print("7 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[7]/div[3]/a[1]/div[2]/div/p[2]/span[2]")).getText());
        System.out.print("8 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[7]/div[4]/a[1]/div[2]/div/p[2]/span[2]")).getText());
        System.out.print("9 :£");
       System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[7]/div[5]/a[1]/div[2]/div/p[2]/span[2]")).getText());
        System.out.print("10 :£");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[2]/div[7]/div[6]/a[1]/div[2]/div/p[2]/span[2]")).getText());



    }

}
