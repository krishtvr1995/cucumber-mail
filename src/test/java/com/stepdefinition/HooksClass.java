package com.stepdefinition;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.remote.ScreenshotException;

import com.ulitilies.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order=1)
	public void beforescenario() {
		System.out.println("scenario start");
		launchBrowser();
	    loadUrl("https://www.google.com/intl/en-GB/gmail/about/");
	    windowMax();
	}
	
	@After(order=1)
	public void afterscenario() {
		
		System.out.println("scenario ends");

	}
	@Before(order=2)
	public void starttime() {
		// TODO Auto-generated method stub
System.out.println(new Date());
	}
	@After(order=2)
	public void endtime() {
		// TODO Auto-generated method stub
System.out.println(new Date());
	}
	@Before(order=3)
	public void beforesce() {
		// TODO Auto-generated method stub
System.out.println("before testing");
	}
	@After(order=3)
	public void aftersec(Scenario s) throws IOException {
		String name=s.getName();
		screenshot(name);
		
		
		
		// TODO Auto-generated method stub
System.out.println("after testing");
	}
}
