
package com.mycompany.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
       
       driver.findElement(By.xpath("//*[@id=\"collapse-2\"]/li[3]/a")).click();
   
        
//         //Enter Email
//        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
//        email.sendKeys("bspr31@gmail.com");
//          //Enter password
//        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
//        password.sendKeys("Test123");


//       
//        
    }
    
    
}
