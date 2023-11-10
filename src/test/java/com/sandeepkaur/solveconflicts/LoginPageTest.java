package com.sandeepkaur.solveconflicts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.solveConflicts.TestBase;
import com.solveConflicts.pages.LoginPage;


public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	@BeforeMethod
	public void launch() {
		intialisation();
		loginPage = new LoginPage();

	}

	@Test
	public void validateUserCanLoginWithValidCredentials() {
	 loginPage.SubmitLogin("sandeepkaur1@gmail.com", "sandeep");
		Assert.assertEquals("My Account", "User not logged in");
	}

	

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

}
