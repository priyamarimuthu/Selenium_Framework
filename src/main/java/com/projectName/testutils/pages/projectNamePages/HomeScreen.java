package com.projectName.testutils.pages.projectNamePages;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.Hashtable;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.projectName.testutils.genericutility.ExceptionHandler;
import com.projectName.testutils.pages.genericPages.HomePage;
import com.projectName.testutils.pages.projectNamePages.HomeScreen;
import com.projectName.testutils.seleniumutils.SeleniumWebDriver;
import org.openqa.selenium.Keys;
public class HomeScreen extends SeleniumWebDriver{
	
	protected By lnkIDM = By.linkText("IDM/PMS");
	protected By lnkLearnStation = By.linkText("Learn Station");
	protected By lnkLMS = By.linkText("LMS");
	protected By lnkHelpDesk = By.linkText("Help Desk");
	protected By lnkTas = By.linkText("TAS");
	protected By lnkSeventhSense = By.linkText("Seventh Sense");
	protected By lnkLibrary = By.linkText("Library");
	protected By lnkPayroll = By.linkText("Payroll");
	protected By lnkGain = By.linkText("iGain");
	protected By lnkTrainingSystem = By.linkText("Training System");
	protected By txtSearchtextbox = By.id("searchtextbox");
	
	/***
	 * Call to super constructor
	 */
	public HomeScreen(WebDriver driver) {
		super(driver);
	}
	

	/***
	 * Search by any name to the Home screen
	 * @throws ExceptionHandler
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public boolean searchbyanyname(String UserName)throws ExceptionHandler {
		try{
			
			Assert.assertTrue(sendKeys(txtSearchtextbox,UserName),"Could not enter user name");
			Assert.assertTrue(sendKeys(txtSearchtextbox,"\\13"),"could not press the enter button");
			
		}catch(Exception e){
			throw new ExceptionHandler(e);
		}
		return true;
	}
	
	public boolean verifyelement()throws ExceptionHandler{
		try{
			if(isElementPresent(lnkIDM)){
				return true;
			}
			if(isElementPresent(lnkLMS)){
				return true;
			}
			if(isElementPresent(lnkSeventhSense)){
				return true;
			}
			return false;
		}catch(Exception e){
			throw new ExceptionHandler(e);
		}
		
	}
}
