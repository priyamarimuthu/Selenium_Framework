package com.projectname.testutils.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.projectname.testutils.genericutility.ExceptionHandler;
import com.projectname.testutils.seleniumutils.SeleniumWebDriver;


public class SharedPage extends SeleniumWebDriver{

	
	protected By readyLocator = By.id("searchtextbox");


	protected By btnLogout = By.linkText("Logout");

	protected By btnLogin = By.linkText("Log In");
	protected By lnkChangePwd = By.linkText("change password");
	protected By imgLoginPopup = By.id("modal-content");
	
	protected By lnkUserName = By.cssSelector("css=span.user_name");
	protected By lnkTrainingSystem = By.linkText("Training System");
	protected By txtSearchtextbox = By.id("searchtextbox");
	protected By btnSearch = By.id("searchbtn");
	/***
	 * Call to super constructor
	 * @throws Exception 
	 */
	public SharedPage() throws Exception{
		PageFactory.initElements(SeleniumWebDriver.driver, this);
		isElementPresent(readyLocator);
	}

	
	public void logOut() throws Exception{
		click(lnkUserName);
		waitForPageToLoad();
		if (waitForElement(btnLogout, 5)) {
			click(btnLogout);
			waitForPageToLoad();
		}
	}
	/***
	 * Search by any name to the Home screen
	 * @throws Exception 
	 * @throws ExceptionHandler
	 * @throws IOException 
	 * @throws AWTException
	 * @throws InterruptedException
	 */
	public SearchPage searchbyanyname(String userName) throws Exception{
		sendKeys(txtSearchtextbox,userName);
		click(btnSearch);
		waitForPageToLoad();
		return new SearchPage();
	}

}
