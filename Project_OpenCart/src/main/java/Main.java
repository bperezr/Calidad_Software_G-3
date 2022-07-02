import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

public class Main {
    

    public static void main(String[] args) {    
     System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        
        ChromeDriver driver = new ChromeDriver(); 
                     
         driver.get("http://localhost/opencartsite/");
         
         driver.manage().window().maximize();
             

    }

    
    
}
