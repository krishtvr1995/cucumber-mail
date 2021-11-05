package com.stepdefinition;

import org.openqa.selenium.By;

import com.ulitilies.BaseClass;
import com.ulitilies.Fbfile;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class Facebookstepdefinition extends BaseClass{
	Fbfile d=new Fbfile();

		@Given("^The user should launch the chrome browser$")
		public void the_user_should_launch_the_chrome_browser() throws Throwable {
			//launchBrowser();//
		    
		}

		@When("^The user should type the url$")
		public void the_user_should_type_the_url() throws Throwable {
		  // loadUrl("https://www.facebook.com");//
		}

		@When("^The user should maxmize the window$")
		public void the_user_should_maxmize_the_window() throws Throwable {
		  // windowMax();//
		}

		@When("^The user should type invalid username and invalid password$")
		public void the_user_should_type_invalid_username_and_invalid_password() throws Throwable {
		   
		 driver.findElement(By.xpath("//input[@id='email']"));
		   
		 driver.findElement(By.xpath("//input[@id='pass']"));
		}

		

		@When("^The user should click the login button$")
		public void the_user_should_click_the_login_button() throws Throwable {
		    driver.findElement(By.xpath("//button[@id='u_0_d_MO']"));
		}

		@When("^The user should get te title of the incorrect credential page$")
		public void the_user_should_get_te_title_of_the_incorrect_credential_page() throws Throwable {
		   String currentUrl = driver.getCurrentUrl();
		   Assert.assertTrue("verify",currentUrl.contains("privacy"));
		   System.out.println("test passed");
		}

		@Then("^The user should naviage to incorrect credential page$")
		public void the_user_should_naviage_to_incorrect_credential_page() throws Throwable {
		   
		}

		@When("^The user should type invalid username\"([^\"]*)\" and valid password\"([^\"]*)\"$")
		public void the_user_should_type_invalid_username_and_valid_password(String arg1, String arg2) throws Throwable {
		    
		}



}
