package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ulitilies.BaseClass;

import cucumber.api.java.en.*;

public class ForgetPasswordStepDefinition extends BaseClass {
	
	@Given("^The user should launch the browser$")
	public void the_user_should_launch_the_browser() throws Throwable {
		//launchBrowser();//
	    
	}

	@When("^The user should load the url$")
	public void the_user_should_load_the_url() throws Throwable {
	   // loadUrl("https://www.facebook.com/");//
	}

	@When("^The user should maximize the window$")
	public void the_user_should_maximize_the_window() throws Throwable {
	  //  windowMax();//
	}

	@When("^The user should click the forgot password link$")
	public void the_user_should_click_the_forgot_password_link() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	  
	    
	}

	@When("^The user should naviate to find your accout$")
	public void the_user_should_naviate_to_find_your_accout() throws Throwable {
	   String currentUrl = driver.getCurrentUrl(); 
	   Assert.assertTrue("verify fb account",currentUrl.endsWith("screen=0"));
	   System.out.println("account page et verified");
	}

	@When("^The user should type the registered mobile number or email id$")
	public void the_user_should_type_the_registered_mobile_number_or_email_id() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("8754764572");
	    
	}

	@When("^The user should click on searc button$")
	public void the_user_should_click_on_searc_button() throws Throwable {
	   driver.findElement(By.xpath("//button[@id='did_submit']")).click();
	 //  driver.close();//
	   
	  Thread.sleep(3000);
	}
	@When("^The user should click on continue button$")
	public void theUserShouldClickOnContinueButton() throws Throwable {
	  driver.findElement(By.xpath("//button[text()='Continue']")).click();
	}

	@Then("^The user should navigate to reset password page$")
	public void the_user_should_navigate_to_reset_password_page() throws Throwable {
	   String currentUrl = driver.getCurrentUrl();
	   Assert.assertTrue("verify reset page", currentUrl.contains("recover"));
	   System.out.println("verifeied reset");
	}



}
