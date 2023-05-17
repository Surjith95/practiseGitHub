package org.pageobject;

import org.basepackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBox extends BaseClass {
	
	public static WebElement enterName(String text) {
		return driver.findElement(By.id(text));
	}
	
//	public static WebElement clickAction(String cl) {
//		return driver.findElement(By.id(cl));
//	}
	

}
