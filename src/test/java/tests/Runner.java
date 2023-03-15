package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\features"},
		glue= {"gluecode"},
		plugin= {"pretty","html:C:/Users/Manoj/.jenkins/workspace/Test2/res.html","rerun:target/failedscenarios.txt"}
		)
public class Runner extends AbstractTestNGCucumberTests
{
	
}