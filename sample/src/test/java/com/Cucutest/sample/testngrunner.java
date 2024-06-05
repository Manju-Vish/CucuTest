package com.Cucutest.sample;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\manju\\eclipse-workspace\\sample\\src\\test\\java\\features",glue="stepdefinitions",monochrome=true,tags="@Smoketest")
public class testngrunner  extends AbstractTestNGCucumberTests{

	
	
}
