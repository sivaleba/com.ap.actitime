package com.demoacti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoacti.base.DriverScript;

/*
 * Name=Driverscript
 * Developed By:Siva
 * Created date:8/2/21
 * Updated date:8/8/22
 * Description:This is responsible for all the driver related activites.
*/
public class EnterTimePage extends DriverScript{
	
	 //*******************Page initialization****************************//
	public EnterTimePage() {
		PageFactory.initElements(driver,this);
	}
	//*******************Page Elements****************************// 
	@FindBy(xpath="//a[@class='content tasks']")WebElement menutask;
	@FindBy(id="logoutLink")WebElement linkLogOut;
	                                     
	//*******************Page Actions****************************//
	public void task() {
		menutask.click();
	}
	
	
	
	public void logout() {
		linkLogOut.click();
	}
	public String getEnterTimeTittle() {
		return driver.getTitle();
	}
}
