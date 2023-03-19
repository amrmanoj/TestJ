package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\features"},
		glue= {"gluecode"},
		plugin= {"pretty","html:D:/batch262/org.cucumber.jenkins/target/res.html","rerun:target/failedscenarios.txt"}
		)
public class Runner extends AbstractTestNGCucumberTests
{
	
}