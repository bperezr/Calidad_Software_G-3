
package com.mycompany.opencart;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewMain {

    public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
      
//      NewMain loginuser = new NewMain();
//        loginuser.login();

      Admin extension = new Admin();
      extension.admin();
    }

    
    public void login(){
        
        ChromeDriver driver = new ChromeDriver(); 
        
        driver.get("http://localhost/opencartsite/");         
        driver.manage().window().maximize();
        //Click in My Account
        driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a"));
        driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a")).click();
        //Click in Register
        driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")).click();
        //Enter Name
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        firstname.sendKeys("Bryan");
         //Enter LastName
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        lastname.sendKeys("Pérez Reyes");
         //Enter Email
        WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        email.sendKeys("bspr31@gmail.com");
          //Enter password
        WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        password.sendKeys("Test123");
          //NewsLetter YES
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
          //Private Policy accepted
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
          //Continue Button
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click(); 
        
    }
    
}
