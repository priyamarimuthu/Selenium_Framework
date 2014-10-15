package com.projectName.test.functional.moduleName1;


import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.projectName.testutils.baseclass.TestBaseClass;
import com.projectName.testutils.pages.genericPages.HomePage;
import com.projectName.testutils.pages.genericPages.SearchPage;
import com.projectName.testutils.pages.projectNamePages.HomeScreen;
import com.projectName.testutils.retryAnalyser.RetryRule;
import com.projectName.testutils.testdatareader.ExcelReader;

public class SearchByAnyName extends TestBaseClass{

	@Test(retryAnalyzer = RetryRule.class)
	public void searchbyname(){
		// ------------------------------------------------------------------//
		// Step-1: Get the test data //
		// ------------------------------------------------------------------//
		HashedMap testData = ExcelReader.getTestDataByTestCaseId(
				"TC_EBS_001", LoginTest.class.getSimpleName());
		log.info(testData.get("TC_ID").toString() + " - ");

		// ------------------------------------------------------------------//
		// Step-2: Load the application //
		// ------------------------------------------------------------------//
		
		//driver = loadURL();
		homePage = loginUser1();
		log.info("Successfully navigated to Preferences Page.");
		
		// ------------------------------------------------------------------//
		// Step-2: Load the application //
		// ------------------------------------------------------------------//
		homePage = PageFactory.initElements(driver, HomePage.class);	
		HomeScreen homeobject = homePage.navigateToHomePage();
		
		SearchPage searchobject = homePage.navigateToSearchPage();
		log.info("Successfully loaded Home Page elements");
		
		// ------------------------------------------------------------------//
		// Step-3:Search by name //
		// ------------------------------------------------------------------//
		//Assert.assertTrue(homeobject.searchbyanyname(testData.get(UserName)));
		
		// ------------------------------------------------------------------//
		// Step-4:Verify Search Screen page //
		// ------------------------------------------------------------------//
		
		//Assert.assertTrue(searchobject.searchPage());
			
	}
}
