package com.projectname.test.functional.modulename2;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.projectname.testutils.baseclass.TestBaseClass;
import com.projectname.testutils.pages.genericPages.HomePage;
import com.projectname.testutils.pages.projectnamepages.HomeScreen;
import com.projectname.testutils.retryAnalyser.RetryRule;

@Listeners(com.projectname.testutils.baseclass.CustomizedReporter.class)

public class HomePageTest  extends TestBaseClass{
	
	/*************************************************************************************************** 
	 * @purpose To verify home page elements
 	 * @action Verify the links present on the home page
   	 * @author AspireQA
   	 * @since October 30, 2014
   	 ***************************************************************************************************/

	@Test(retryAnalyzer = RetryRule.class)
	public void homePageTest(){
		// ------------------------------------------------------------------//
		// Step-1: Log in to the application //
		// ------------------------------------------------------------------//
		logTitleMessage("Login to application");
		homePage = loginUser1();
		logTitleMessage("Login Successful");
		
		// ------------------------------------------------------------------//
		// Step-2:Load Home Page Variable //
		// ------------------------------------------------------------------//
		logTitleMessage("Load home page elements");
		homePage = PageFactory.initElements(driver, HomePage.class);	
		HomeScreen homeobject = homePage.navigateToHomePage();
		
		logTitleMessage("Successfully loaded Home Page elements");
		
		// ------------------------------------------------------------------//
		// Step-3:Verify Home page element //
		// ------------------------------------------------------------------//
		logTitleMessage("Verify presense of home page elements");
		assertTrue(homeobject.verifyelement(),"Verification failed",driver);
		logTitleMessage("Verified home page elements");
	}
}
