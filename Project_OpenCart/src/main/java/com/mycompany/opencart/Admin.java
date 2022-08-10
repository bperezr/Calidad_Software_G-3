
package com.mycompany.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

public class Admin {
    
     public void admin(){        
        ChromeDriver driver = new ChromeDriver(); 
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.get("http://localhost/opencartsite/admin/");         
        driver.manage().window().maximize();
       //Enter user
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"input-username\"]"));
        firstname.sendKeys("admin");
        //Enter password
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        lastname.sendKeys("1234");
         //Continue Button
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click(); 
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button"))).click();       
        
       //click extensions     
       driver.findElement(By.xpath("//*[@id=\"menu-extension\"]/a")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      
       driver.findElement(By.xpath("//*[@id=\"collapse-2\"]/li[3]/a")).click();       
       //Choose the extension Type
       driver.findElement(By.xpath("//*[@id=\"input-type\"]")).click();         
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
       driver.findElement(By.xpath("//*[@id=\"input-type\"]/option[11]")).click();     
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);        
       //Select free shipping
       driver.findElement(By.xpath("//*[@id=\"extension\"]/fieldset[2]/div/table/tbody/tr[2]/td[4]/a[1]")).click();          
       //Total
        WebElement total = driver.findElement(By.xpath("//*[@id=\"input-total\"]"));        
        total.sendKeys("100");          
         //GeoZone
        driver.findElement(By.xpath("//*[@id=\"input-geo-zone\"]")).click();    
         Select geoZone = new Select(driver.findElement(By.id("input-geo-zone")));
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
         geoZone.selectByVisibleText("UK Shipping");
         driver.findElement(By.xpath("//*[@id=\"input-geo-zone\"]")).click();       
        //Status
        driver.findElement(By.xpath("//*[@id=\"input-status\"]")).click();    
         Select status = new Select(driver.findElement(By.id("input-status")));
         status.selectByVisibleText("Enabled");
         driver.findElement(By.xpath("//*[@id=\"input-status\"]")).click();         
         //Total
        WebElement sort = driver.findElement(By.xpath("//*[@id=\"input-sort-order\"]"));        
        sort.sendKeys("1");                 
        //Save free shipping
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();                        
          //Return
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a")).click();
         
              
         
                 
    }
    
    
}
