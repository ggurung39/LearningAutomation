import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddItemToToDoList {
    public static void main(String[] args) throws InterruptedException {
        String [] names= {"Enter", "Edit", "Pass"};
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        WebElement inputBox=driver.findElement(By.tagName("input"));
        for(String name: names){
            inputBox.sendKeys(name);
            inputBox.sendKeys(Keys.RETURN);
            Thread.sleep(3000);//this holds webpage for 3 sec
        }

    }
}
