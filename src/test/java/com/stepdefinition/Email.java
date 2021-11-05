package com.stepdefinition;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;

import com.ulitilies.BaseClass;

import cucumber.api.java.en.*;

public class Email extends BaseClass {



@Given("^The user should launch web$")
public void theUserShouldLaunchWeb() throws Throwable {
	launchBrowser();
}

@When("^The user should click url$")
public void theUserShouldClickUrl() throws Throwable {
    loadUrl("https://www.google.com/intl/en-GB/gmail/about/");
}

@When("^The user should maxmize$")
public void theUserShouldMaxmize() throws Throwable {
    windowMax();

}

@When("^The user should click create button$")
public void theUserShouldClickCreateButton() throws Throwable {
	driver.findElement(By.xpath("//span[text()='Create an account']")).click();
   Thread.sleep(2000);
}

@When("^The user should enter first name$")
public void theUserShouldEnterFirstName() throws Throwable {
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("raja");
	   Thread.sleep(2000);

}

@When("^The user should enter last name$")
public void theUserShouldEnterLastName() throws Throwable {
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("A");
	   Thread.sleep(2000);

}

@When("^The user should create mail id$")
public void theUserShouldCreateMailId() throws Throwable {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rajasatvat2021");
	   Thread.sleep(2000);

}

@When("^The user should enter password$")
public void theUserShouldEnterPassword() throws Throwable {
	driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("raja123456789@");
    
}

@When("^The user should enter conform password$")
public void theUserShouldEnterConformPassword() throws Throwable {
  driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("raja123456789@");
  Thread.sleep(2000);

}

@When("^The user should click next button$")
public void theUserShouldClickNextButton() throws Throwable {
   driver.findElement(By.xpath("//span[text()='Next']")).click();
   

}

@When("^The user should enter mobile number$")
public void theUserShouldEnterMobileNumber() throws Throwable {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("7708828386");
	   

    
}

@When("^The user should next button$")
public void theUserShouldNextButton() throws Throwable {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	
   
}


}
