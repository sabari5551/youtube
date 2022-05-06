package org.youtubedownloader.demo;

//import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pomtest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VigneshSE\\eclipse-workspace\\eclipse project\\java\\driver\\chromedriver.exe");
		String url="https://www.youtube.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);

		Pom.search(driver).sendKeys("newsongs");
		Pom.enter(driver).click();
		Pom.song(driver).click();
		String downloadUrl= Pom.getDownloadUrl(driver);
		System.out.println("url" + downloadUrl);
	    driver.navigate().to(downloadUrl);
//		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1)); //switches to new tab	
		driver.get(downloadUrl);
		Pom.downloadlink(driver).click();
		Pom.downloaded(driver).click();
	}
}
