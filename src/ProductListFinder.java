import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ProductListFinder {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"page-object-model\"]")).click();
        Thread.sleep(5000);
        ArrayList tabs=new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a")).click();
        Thread.sleep(5000);
        List <WebElement> elements=driver.findElements(By.className("sub-heading"));
        int total=0;
        for (WebElement e:elements){
            System.out.println(e.getText());
            total= total+1;
            System.out.println("Total number of items is"+total);
        }






    }
}
