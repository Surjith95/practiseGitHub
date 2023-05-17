package org.pagedefn;

import org.basepackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.ClickAction;
import org.pageobject.TextBox;

public class Textboxpageexecution {

	public static void enterFullName() {
		TextBox.enterName("userName").sendKeys("abc");
	}

	public static void enterEmail() {
		TextBox.enterName("userEmail").sendKeys("abc@gmail.com");
	}

	public static void currentAdd() {
		TextBox.enterName("currentAddress").sendKeys("Trichy, TamilNadu");
	}

	public static void clickSubmitButton() {
		TextBox.javaScriptclick(TextBox.enterName("submit"));
	}

}
