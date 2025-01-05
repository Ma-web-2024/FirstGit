package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\deplaced\\CUCUMBER\\Features\\MultipleLogin.feature" , glue= {"stepDefinitions"} ,monochrome = true , plugin = {"pretty","json:target/cucumber.json"})
public class TestRunner {
	

}
