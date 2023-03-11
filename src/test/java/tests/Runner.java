package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\features"},
		glue= {"gluecode"},
		plugin= {"pretty","html:target/res","rerun:target/failedscenarios.txt"}
		)
public class Runner extends AbstractTestNGCucumberTests
{
	
}