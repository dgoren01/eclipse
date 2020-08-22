package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public static void main(String[] args) {
	
	ExtentReports extent;
	ExtentHtmlReporter html;
	ExtentTest test;
	
	
   
	   
	   System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
	   
	   WebDriver driver= new ChromeDriver();
	   extent=new ExtentReports();
	   html=new ExtentHtmlReporter("repores.html");
	   extent.attachReporter(html);
		  
	 
	  test=extent.createTest("google verification");
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
	  
  
	  driver.close();
	  
  }

}
