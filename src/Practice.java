import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement click= driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        click.click();

        Thread.sleep(5000);

        WebElement close=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        close.click();

    }

}
