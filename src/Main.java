import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        searchBox.click();
        Thread.sleep(5000);
        WebElement close= driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        close.click();

    }
}
