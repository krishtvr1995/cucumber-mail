package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="com.StepDefinition",dryRun=true,monochrome=true,strict=false,snippets=SnippetType.CAMELCASE,tags= {"@raja"},plugin= {"html:target\\Reports",
		"junit:target\\Report\\email.xml",
		"json:target\\Reports\\e.jon"})
public class TestRunner {
	

}
