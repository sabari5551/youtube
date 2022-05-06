package org.youtubedownloader.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

public class Pom {
	public static WebElement search(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id=\"search\"]"));

	}
	public static WebElement enter(WebDriver driver) {
		return	driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]"));

	}
	public static WebElement song(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()=\"Arabic Kuthu | Halamithi Habibo -Lyric Video| Beast| Thalapathy Vijay| Sun Pictures| Nelson| Anirudh\"]"));
	}
	public static String getDownloadUrl(WebDriver driver) {
		String currentUrl = driver.getCurrentUrl();
		String[] arrOfStr = currentUrl.split("youtube.com");
		String downlaodUrl = arrOfStr[0] + "ssyoutube.com" + arrOfStr[1];
		System.out.println(downlaodUrl);
		return downlaodUrl;	
	}
	public static  WebElement downloadlink(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id=\"sf_submit\"]"));

	}
	public static  WebElement downloaded(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Download']"));

	}
}
